public class FizzBuzz {
    public static void main(String[]args) {

        for(int i = 1; i <= 100; i++) {

            String output = "";

            if(i % 15 == 0) {
                output += "Fizzbuzz";
            }
            else if(i % 3 == 0) {
                output += "Fizz";
            }
            else if(i % 5 == 0) {
                output += "Buzz";
            }
            else
                output += i;
                
                System.out.println(output);
        }
    }
}