
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




    }  
    static void ignore(){
        System.out.println("You ignore the dungeon entrance "
                + "and you dont have an adventure. Goodbye");
    }

     static void left () {
        System.out.println("You enter the dark and scary left corridor and you begin to hear sounds. You get mauled to death.");
    }

     static void two () {
        System.out.println("You enter the right corridor, completely intact and alive. You begin to hear a woman screaming for help, she is being bombarded by bandits trying to rob her.");
        System.out.println("....");
System.out.println("1. Do you kill the bandits and rescue the woman in need? or 2. Do you leave the dungeon in a panic, never to return again?");
    Scanner userchoice = new Scanner(System.in);
answer = sc.nextInt();
if (answer == 1){
    rescue();

}else if (answer == 2){
    leave();
}
    }
    static void rescue(){
        System.out.println("You come to the rescue like a hero, You slaughter all the bandits one by one until there is no one left but you and the woman.");
        princess();
    }
    static void leave(){
        System.out.println("You panic and you leave the dungeon like a wimp. You lose");
        
    }
    static void princess(){
        System.out.println("You realize that she is the princess of a nearby kingdom and seems to be very rich and carrying a large sum of money on her.");
        System.out.println("Do you?... 1. Kill the princess and steal all of her money? Only to live the rest of your life "
                + "feeling guilty and like a terrible person? or 2. Do you rescue the princess and take her back home like a true hero?");
         Scanner userchoice = new Scanner(System.in);
answer = sc.nextInt();
if (answer == 1){
    kill();

}else if (answer == 2){
    live();
}
    }
    static void kill(){
        System.out.println("You kill the princess and steal all of her gold. You skip town and move far far away to start your new life. "
                + "The guilt gets to you and you just cant take it anymore. You commit suicide. You lose");
    }
    static void live(){
        System.out.println("You saved the princess and she is very grateful, you take her back home and she pays you all of the gold she had on her.");
        System.out.println("You live the rest of your life a wealthy man and live in paradise. "
                + "Congratulations! You Win!");
    }
    
    
}
    
    
    
    


    