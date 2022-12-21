
import Main.Square;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haleywaddell
 */

    public class SquareTest {

   /**
   * @param args
   */
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       try {
           System.out.print("Enter the size of a square :");
           int sizeOfSquare = scanner.nextInt();
           Square square = new Square(sizeOfSquare);
           square.readSquare(sizeOfSquare);
           System.out.println("Matrix is :");
           square.printSquare();
           if (square.isMagicSquare()) {
               System.out.println("Magic Square ");

           } else {
               System.out.println("Not Magic Square ");
           }
       } catch (Exception e) {
       } finally {
           scanner.close();
           
       }
//17 24 1 8 15
//23 5 7 14 16
//4 6 13 20 22 
//10 12 19 21 3 
//11 18 25 2 9 
   }
    
}
