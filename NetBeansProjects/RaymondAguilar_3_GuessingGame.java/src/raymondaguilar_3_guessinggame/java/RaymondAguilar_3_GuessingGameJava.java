
package raymondaguilar_3_guessinggame.java;

import java.util.Scanner;
import java.util.Random;


public class RaymondAguilar_3_GuessingGameJava {
static int rightnumber;
static int userguess;
static String username;
static Random randy = new Random();
static boolean playagain;
static int counter;
private static Object userimputnumber;
    
    public static void main(String[] args) {
playagain = true;
rightnumber = randy.nextInt(100);
counter = 5;
System.out.println("Hello, would you like to play?");
System.out.println("What's your name?");
Scanner userinputname = new Scanner(System.in);
username = userinputname.nextLine();
System.out.println("Hello " + username + "Let's play a game!");


while (counter > 0 &&playagain){
playthegame();
guess3Times();
counter--;
if(counter<1){
System.out.println("You lose!");
}
}
}

static void playthegame() {
Scanner userinputnumber = new Scanner(System.in);
System.out.println("Pick a number between 1-100.");
userguess = userinputnumber.nextInt();
if(rightnumber==userguess){
System.out.println("You win! Good Job!");
playagain = false;
}else if(rightnumber<userguess){
System.out.println("Too High. Try again :(");
}else if (rightnumber>userguess){
System.out.println("Too low. Try Again:(");
}
}
static void guess3Times(){
Scanner guessesfromuser = new Scanner(System.in);
if(userguess >1){
System.out.println("You have " + counter +" guess(es) left!");
}
}
}