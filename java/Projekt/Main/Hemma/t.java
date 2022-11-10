import java.util.Scanner;
public class t{
    public static void main(String[] args) {
        char tempYesNo = ' ';
        do {
            
            //Program Menu1 - Temperature Conversions

            System.out.println("You have chosen Temperature conversions.");

            System.out.println("Please enter the desired Temperature in Fahrenheit to convert to Celsius & Kelvin." + "\\n");


            // User enters Temperature data here

            Scanner tp = new Scanner(System.in);

            double temperatureInF = tp.nextDouble();


            // Converts Fahrenheit to Celcius & Prints result on screen

            System.out.println("\\t" + "Celsius: " + ((temperatureInF - 32) * 5 / 9) + "C" + "\\n");


            // Converts Fahrenheit to Kelvin & Prints result on screen

            System.out.println("\\t" + "Kelvin: " + (((temperatureInF - 32) * 5 / 9) + 273.15) + "K" + "\\n");


            // Displays the users Temperature input

            System.out.println("The Temperature you used was: " + temperatureInF + "F" + "\\n" + "\\n" + "\\n"); 

            System.out.println("Keep in mind that all conversions shown are exact. You may round up or down if needed.");




            //Asks user if they would like to do another Temp. conversion

            System.out.println("Would you like to do another Temperature conversion?");

            System.out.println("Please type Y/N");


            // User enters repeat Temp conversion Y/N***                            

            Scanner yesNoTemp = new Scanner(System.in);

            tempYesNo = yesNoTemp.next().charAt(0); 
        }

        while (tempYesNo == 'Y' || tempYesNo == 'y');
    }
}