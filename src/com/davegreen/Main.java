package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        //width of an int = 32 (4 bytes).
	    int myIntValue = 5 / 3;

	    //width of a float = 32 (4 bytes).
	    float myFloatValue = 5f / 3f;

	    //width of a double = 64 (8 bytes).
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue + " + myFloatValue);
        System.out.println("myDoubleValue + " + myDoubleValue);


        //Challange.

        double poundsWeight = 200d;
        double kiloConvertion = 0.45359237d;

        double convertedWeight = poundsWeight * kiloConvertion;

        System.out.println("Your weight is kilo's is : " + convertedWeight);
    }
}
