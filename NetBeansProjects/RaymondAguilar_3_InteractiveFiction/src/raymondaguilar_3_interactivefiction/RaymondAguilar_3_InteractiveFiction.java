
package raymondaguilar_3_interactivefiction;
import java.util.Scanner;
public class RaymondAguilar_3_InteractiveFiction {
static Scanner sc = new Scanner(System.in); 
static int answer; 
static String userpick;
    public static void main(String[] args) {
     
        System.out.println("The Calling...");
        System.out.println("One day you are walking in the wilderness and you stumble upon a dungeon. Do you?...");
        System.out.println("1.Enter the dungeon? or 2.Ignore the dungeon entrance and continue on your way?");
        answer = sc.nextInt();
        if(answer == 1){
         dungeon();   
        }
        
        else if(answer == 2){
        ignore();    
        } 
        
    }
    public static void dungeon(){
        System.out.println("You enter the dungeon and you end up stumbling across two corridors, "
                + "One on the left and you notice it has blood on the floor of the entrance");
System.out.println("and the one on the right that is full of spiderwebs but is lit by torches");
inside();
    }  

public static void inside(){
      System.out.println("Do you?... 1.Take the left corridor or 2.Take the right corridor");
Scanner userchoice = new Scanner(System.in);
answer = sc.nextInt();
if (answer == 1){
    left();

}else if (answer == 2){
    two();
}

System.out.println("....");
System.out.println("1. Do you kill the bandits and rescue the woman in need? or 2. Do you leave the dungeon in a panic, never to return again?");


    }  
    
    

    
    public static void ignore(){
        System.out.println("You ignore the dungeon entrance "
                + "and you dont have an adventure. Goodbye");
    }

    public static void left () {
        System.out.println("You enter the dark and scary left corridor and you begin to hear sounds. You get mauled to death.");
    }

    public static void two () {
        System.out.println("You enter the right corridor, completely intact and alive. You begin to hear a woman screaming for help, she is being bombarded by bandits trying to rob her.");
    }
    
}
    
    
    
    


    