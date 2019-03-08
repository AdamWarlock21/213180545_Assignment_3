/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.assignment3;

/**
 *
 * @author BooBoo
 */
public class CalcRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Calculator calcu = new Calculator();
      
      int resultA = calcu.add(6, 10);
      int resultM = calcu.subtract(7, 2);
      int resultT = calcu.multiply(10 ,resultM );
      int resultD = calcu.divide(resultA, resultT);
      
      System.out.println(resultA);
      System.out.println(resultM);
      System.out.println(resultT);
      System.out.println(resultD);
    }
    
}
