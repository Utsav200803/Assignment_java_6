/*
    21CE037 Utsav Gundaraniya
   Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to
         display the numbers stored at odd indexes by thread1 and display numbers stored at even
         indexes by thread2.
*/

import java.util.*;

public class Prac_2_Random {
    public static void main(String[] args) {
        int[] array = new int[15];
        //   Random elements in array
        for (int i = 0; i < 15; i++) {
            array[i] = new Random().nextInt(100);
        }

        System.out.println("The array is : ");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i]     + " ");
        }
        System.out.println("\n\nStarting thread...");

        //   Thread for printing odd indexes of array
        Thread thread1 = new Thread()   {
            public void run()   {
                for (int i = 1; i < 15; i       =   i + 2) {
                    System.out.println("Odd : "     + array[i]);
                }
            }
        };

        //   Thread for printing even indexes of array
        Thread thread2 = new Thread()   {
            public void run()   {
                for (int i = 0; i < 15; i       =   i + 2) {
                    System.out.println("Even : "     + array[i]);
                }
            }
        };

        
}