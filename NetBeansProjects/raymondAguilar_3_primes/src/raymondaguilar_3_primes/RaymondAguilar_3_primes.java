/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondaguilar_3_primes;

/**
 *
 * @author raylex01
 */
public class RaymondAguilar_3_primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int evens = 0;
        for(int i = 0;i < 100;i++){
            if(i % 2 == 0){
                evens = evens + 1;
                
               
                System.out.println(i+"There are "+evens+" evens in");
                    }
                    
                        //What is a method?
                       // A method is a function
                       // Like a little program, e.g.
                       // like finding a square root, something you might wanna do again and again.
                     

            }
                    //boolean isEven(int someNumber){
                        //A return value is the type of
                        //value you are giving back to the program
                       // return ()
        
                       static boolean isEven (int somenumber){
                        return (somenumber % 2 == 0);
                    }
        
                        static boolean isOdd (int somenumber) {
                            return (somenumber % 2 !=0);
                        }
                        static boolean isPrime (int somenumber) {
                            int divisor = 0;
                            for (int i = 2; i < somenumber)
                        }
                            
                        }
                    //return (divisor == 0);
                        
                        
