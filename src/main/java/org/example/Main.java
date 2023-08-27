package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x = 0;
        int[] arrayNum = {1, 2, 3, 4, 5};

        for(int i = 0; i < arrayNum.length; i++)
            System.out.println(arrayNum[i]);

        int numToFind = 7status;
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
        }
    }
