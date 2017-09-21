package com.timbuchalka;



public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("The Value Was 1");
//
//        } else if (value == 2) {
//            System.out.println("The Value Was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 3;
//
//        switch (switchValue) {
//
//            case 1:
//                System.out.println("Value Was 1");
//                break;
//            case 2:
//                System.out.println("Value Was 2");
//                break;
//            case 3:case 4:case 5:
//                System.out.println("Was 3 or 4 or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not Value 1 or 2");
//                break;
        char letters = 'G';

        switch (letters) {

            case 'A':
                System.out.println("A Was Found");
                break;
            case 'B':
                System.out.println("B Was Found");
                break;
            case 'C':
                System.out.println("C Was Found");
                break;
            case 'D':
                System.out.println("D Was Found");
                break;
            case 'E':
                System.out.println("E Was Found");
                break;
            default:
                System.out.println("A,B,C,D or E Was not Found");
                break;

        }

        String month = "JanuaRY";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan-> Reclamou do servidor mais uma vez");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure!");
        }


    }
}
