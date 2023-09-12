package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x = 0;
        int[] arrayNum = {1, 2, 3, 4, 5, 3, 4, 7, 7};

        for(int i = 0; i < arrayNum.length; i++)
            System.out.println(arrayNum[i]);

        int numToFind = 7;
        int found = 0;
        int position = -1;

        for(int i = 0; i < arrayNum.length; i++) {
            if (numToFind == arrayNum[i]) {
                found = arrayNum[i];
                position = i;
                break;
            }
        }
            if(found != 0 )
                System.out.println("The number " + numToFind + " is found at the position " + position + " in the array.");
            else
                System.out.println("The number " + numToFind + " s not found in the array.");


    int repeatNum = 0;
    found = 0;

        for(int j = 0; j < arrayNum.length; j++) {
            if (numToFind == arrayNum[j]) {
                found = arrayNum[j];
                position = j;
                repeatNum++;

            }
        }

        if(found != 0 )
            System.out.println("The number " + numToFind + " is found at the position " + position + " in the array. It was found " + repeatNum + " times in the array.");
        else
            System.out.println("The number " + numToFind + " s not found in the array.");

        }






}

