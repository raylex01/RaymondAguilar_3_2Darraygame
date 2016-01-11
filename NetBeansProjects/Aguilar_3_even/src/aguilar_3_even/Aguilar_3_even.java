/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aguilar_3_even;

/**
 *
 * @author raylex01
 */
public class Aguilar_3_even {
    public static void main(String[] args) {
        for(int i = 0; i<100;i++){
            System.out.println(isEven(i));
    }
    }
        /*
        A method is a little program that communicates with other parts
        of the program by returning values (most of the time)
        */
       
        static boolean isEven(int number){
            return (number % 2 == 0);
            
            //System.out.println(i+" isOdd: "+isOdd
        }
}


  