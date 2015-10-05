/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondaguilar_3_challenge0;

/**
 *
 * @author raylex01
 */
public class RaymondAguilar_3_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0;i < 500; i++){
       if(isDivisiblebyeleven(i) & isDivisiblebyfive(i)){
           System.print.outln("Animate this!");
        if(isDivisiblebyeleven(i)) & isDivisiblebythree(i)){
           System.print.outln("Herr Direktor");
       }
           
           
       
           
       }
    }
    
}




static boolean isDivisiblebytwo(int somenumber) {
return (somenumber % 2 == 0);
}
static boolean isDivisiblebythree(int somenumber) {
return (somenumber % 3 == 0);
}
static boolean isDivisiblebyfive(int somenumber) {
return (somenumber % 5 == 0);
}
static boolean isDivisiblebyeleven(int somenumber) {
return (somenumber % 11 == 0);
}

}