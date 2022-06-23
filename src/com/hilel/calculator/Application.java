package com.hilel.calculator;

public class Application {
    public static void main(String[] args) {
        //greeting message
        System.out.println("Ready to Start IBM calculator");

        // every variables that start from the word "customer" contains information about User
        int customerAge = 300;
        char customerGender = 'F';
        float customerWeight = 64f;
        float customerHeight = 164f;

        //this variable will be used as final result
        float customerIMT;


        //variable contains some failure about user parameters
        boolean customerFailure = true;

        //this block checks mistakes in age
        if (customerAge <= 2 || customerAge >= 120) {
            System.out.println("Age is Incorrect");
            customerFailure = false;
            //System.out.println("Program is Ready");
        } else {
            System.out.println("Age is correct");
        }

        //This block checks gender
        if (customerGender !='F' && customerGender != 'M') {
            System.out.println("Gender is Incorrect");
            customerFailure = false;
        } else {
            System.out.println("Gender is correct");
        }
        //this block will help us check weight
        if (customerWeight <= 1 || customerWeight >= 450){
            System.out.println("Weight is incorrect");
            customerFailure = false;
        } else {
            System.out.println("Weight is Correct");
        }
        //this block will help us check height
        if (customerHeight <= 50 || customerHeight >= 250){
            System.out.println("Height is Incorrect");
            customerFailure = false;
        } else {
            System.out.println("Height is Correct");
        }

        //this block will help us understand mistaken user properties
        if (customerFailure == true) {
            System.out.println("Program Works Correctly");
            customerIMT = customerWeight / (customerHeight * customerHeight);
            System.out.println("Your IMT:");
            System.out.println(customerIMT);
        } else {
            System.out.println("Program doesn't Work Correctly");
        }
    }
}

//if (conditions) {
//      doSomething
// } else {
//      doSomethingElse
// }