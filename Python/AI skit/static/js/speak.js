const btn = document.querySelector('.talk');
const content = document.querySelector('.content');

const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
const recognition = new SpeechRecognition();

recognition.onstart = function(){
    console.log("voice is activated");
}
recognition.onresult = function(event){
    const current = event.resultIndex;
    var transcript = event.results[current][0].transcript;
    var final = "";
    var i;

    $.ajax({
        url: '/get_end_predictions',
        type: "post",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify({
            "input_text": transcript,
            "top_k": 1,
        }),
        beforeSend: function () {
            $('.overlay').show()
        },
        complete: function () {
            $('.overlay').hide()
        }
    }).done(function (jsondata, textStatus, jqXHR) {
        console.log(jsondata)
        $('#text_roberta').val(jsondata['roberta'])
        var t = jsondata['roberta'];
        readOutLoud(t);
        content.textContent = transcript + ' ';
        content.textContent += jsondata['roberta'] + ' ';

        $.ajax({
            url: '/get_end_predictions',
            type: "post",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify({
                "input_text": transcript + t,
                "top_k": 1,
            }),
            beforeSend: function () {
                $('.overlay').show()
            },
            complete: function () {
                $('.overlay').hide()
            }
        }).done(function (jsondata, textStatus, jqXHR) {
            console.log(jsondata)
            $('#text_roberta').val(jsondata['roberta'])
            readOutLoud(jsondata['roberta']);
            content.textContent += jsondata['roberta'] + ' ';
            
        }).fail(function (jsondata, textStatus, jqXHR) {
            console.log(jsondata)
        });

        
    }).fail(function (jsondata, textStatus, jqXHR) {
        console.log(jsondata)
    });
    


    
}


btn.addEventListener('click', () => {
    recognition.start();
})

function readOutLoud(message){
    const speech = new SpeechSynthesisUtterance();
    speech.text = message;
    speech.volume = 1;
    speech.rate = 1;
    speech.pitch = 1;

    window.speechSynthesis.speak(speech);
}
