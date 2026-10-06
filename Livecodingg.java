/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class Livecoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//write a program that accepts 15 integer values and stores them in an array
//write a program that accepts 10 integers and stores them in an array
//- that program must: display all the entered values, count how many numbers are positive, 
//count how many numbers are negative, count how many values are zero.
        int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Enter a number for index:" + i);
            A[i] = input.nextInt();
        }
        System.out.println("Enter a number for search");
        int search = input.nextInt();

        for (int j = 0; j < A.length; j++) {
            if (search == A[j]) {
                System.out.println("Number is in index: " + j);
            } else {
                System.out.println("wala na sha buseng. . sa array ang value");
                
               
            }
        }
    }
}
