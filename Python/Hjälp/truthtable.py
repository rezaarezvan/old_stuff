answers = ["true","false","true","true","true","false","false","true","false","false","false","false","false","true","true","false","true","true"]
questions = ["True or false?","True or True?","False or True?","False or False?","True and False?","True and True?","False and True?","False and False?","not(True or false)?","not(True or True)?","not(False or True)?","False or False?","not(True and False)?","not(True and True)?","not(False and True)?","not(False and False)?",]

index = 0
for question in questions:
    print(question)
    answer = str(input())
    if answer != answers[index]:
        print("Game Over")
        break

    else: print("Test") 
    index += 1