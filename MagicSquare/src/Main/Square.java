/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.util.Scanner;

/**
 *
 * @author haleywaddell
 */
public class Square {
   
    int arr[][];

   // constructor that gives the size of the square

   public Square(int size) {
       arr = new int[size][size];

   }

   // methods to read values into the square
   public int[][] readSquare(int size) {

       Scanner in = new Scanner(System.in);
       try {
           System.out.println("Enter the elements of Square matrix :");

           for (int c = 0; c < size; c++)
               for (int d = 0; d < size; d++)
                   arr[c][d] = in.nextInt();

       } catch (Exception e) {
       } finally {
           in.close();
       }
       return arr;
   }

   // print the square,

   public void printSquare() {

       final int size = arr.length;

       for (int c = 0; c < size; c++) {
           for (int d = 0; d < size; d++) {
               System.out.print(arr[c][d] + "\t");
           }
           System.out.println();
       }

   }

   // find the sum of a given row,

   public int sumOfRow(int rowNum) {

       int sumOfRow = 0;

       final int n = arr.length;

       for (int i = 0; i < n; i++) {

           sumOfRow += arr[rowNum][i];

       }

       return sumOfRow;
   }
    public int sumOfColumn(int colNum) {

       int sumOfColumn = 0;

       final int n = arr.length;
       for (int i = 0; i < n; i++) {

           sumOfColumn += arr[i][colNum];

       }

       return sumOfColumn;
   }

   public int sumOfDiagnal() {

       int sumOfDiagnal = 0;

       final int n = arr.length;

       for (int i = 0; i < n; i++) {
           sumOfDiagnal += arr[i][i];

       }

       return sumOfDiagnal;
   }

   public int sumOfSecondaryDiagnal() {

       int sumOfSecondaryDiagonal = 0;

       final int n = arr.length;

       for (int i = 0; i < n; i++) {
           sumOfSecondaryDiagonal += arr[i][n - i - 1];

       }

       return sumOfSecondaryDiagonal;
   }

   public boolean isMagicSquare() {

       final int n = arr.length;
       final int M = (n * n * (n * n + 1) / 2) / n;
       for (int i = 0; i < n; i++) {

           if (sumOfRow(i) != M || sumOfColumn(i) != M) {
               return false;

           }

       }

       if (sumOfDiagnal() != M || sumOfSecondaryDiagnal() != M) {
           return false;
       }

       return true;

   }

}
