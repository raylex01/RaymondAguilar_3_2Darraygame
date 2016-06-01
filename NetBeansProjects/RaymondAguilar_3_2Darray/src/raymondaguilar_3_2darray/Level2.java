
package raymondaguilar_3_2darray;

import java.util.Scanner;
public class Level2 extends RaymondAguilar_3_2Darray {
    public static String movement;
    public static Hero2 hero2;
    public static Enemy1 enemy1;
    public static Enemy2 enemy2;
    public static Enemy3 enemy3;
    public static int treasurex = 2;
    public static int treasurey = 2;
    public static int treasuretrapx = 9;
    public static int treasuretrapy = 4;
    public static int trapx = 3;
    public static int trapy = 3;
    public static boolean letsplay2 = true;
    public static void Level2(){
        while(letsplay2){
            board2();
            move2();
        }
    }
static void board2() {
        char[][] board = new char[10][10];
        board[hero2.hero2x][hero2.hero2y]='@';
        board[enemy1.enemyx][enemy1.enemyy]='o';
        board[enemy2.enemy2x][enemy2.enemy2y]='o';
        board[enemy3.enemy3x][enemy3.enemy3y]='o';
        board[treasurex][treasurey]='T';
        board[treasuretrapx][treasuretrapy]='T';
        board[trapx][trapy]='x';
        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != '@'&& board[i][j] != 'o'&& board[i][j] != 'T'&& board[i][j] != 'o'&& board[i][j] != 'x') {
                        System.out.print(".");
                    } else {
                        System.out.print(board[i][j]);
                    }
                } else if (board[i][j] != '.') {
                    System.out.println(".");
                } else {
                    System.out.println(board[i][j]);
                }
            }
        }
    }

    static void move2() {
        System.out.println("After going exploring you found yourself locked in a dungeon. You must find the treasure chest containing the key "
                + "to escape.");
        System.out.println("                                                                                                           ");
        System.out.println("To move the '@' symbol you must type 'N' to go up 'S' to go down 'E' to go right 'W' to go left "
                + "'NW' to go north west 'NE' to go north east 'SW' to go south west and 'SE' to go south east");

        Scanner compass = new Scanner(System.in);
        movement = compass.nextLine().trim().toLowerCase();            // this move2ment thing is being told that it works for compass
        if (movement.contains("n")) {
            hero2.hero2x--;
            //hero2.hero22y++;
        }      
        if (movement.contains("s")) {
            hero2.hero2x++;
            //hero2.hero22y++;
        }     
        if (movement.contains("e")) {
            //hero2.hero22x--;
            hero2.hero2y++;
        }           
        if (movement.contains("w")) {
            //hero2.hero22x--;
            hero2.hero2y--;
        }           
        if (movement.contains("nw")) {
            hero2.hero2x--;
            hero2.hero2y--;
        }
        if (movement.contains("ne")) {
            hero2.hero2x--;
            hero2.hero2y++;
        }
        if (movement.contains("sw")) {
            hero2.hero2x++;
            hero2.hero2y--;
        }
        if (movement.contains("se")) {
            hero2.hero2x++;
            hero2.hero2y++;
        }
        if(hero2.hero2x>enemy1.enemyx){
            enemy1.enemyx++;   
        }
        if(hero2.hero2x<enemy1.enemyx){
            enemy1.enemyx--;
        }
        if(hero2.hero2y>enemy1.enemyy){
            enemy1.enemyy++;
        }
        if(hero2.hero2x<enemy1.enemyy){
            enemy1.enemyy--;
        }
        if(hero2.hero2x>enemy2.enemy2x){
            enemy2.enemy2x++;
        }
        if(hero2.hero2x<enemy2.enemy2x){
            enemy1.enemyx--;
        }
        if(hero2.hero2y>enemy2.enemy2y){
            enemy2.enemy2y++;
        }
        if(hero2.hero2y<enemy2.enemy2y){
            enemy2.enemy2y--;
        }
        if(hero2.hero2x>enemy3.enemy3x){
            enemy3.enemy3x++;
        }
        if(hero2.hero2x<enemy3.enemy3x){
            enemy3.enemy3x--;
        }
        if(hero2.hero2y>enemy3.enemy3y){
            enemy3.enemy3y++;
        }
        if(hero2.hero2y<enemy3.enemy3y){
            enemy3.enemy3y--;
                    
        }
                
         if(hero2.hero2x==enemy1.enemyx&&hero2.hero2y==enemy1.enemyy){
    letsplay2=false;
    System.out.println("You have fallen into the hands of the O's. You lose.");

            }
          if(hero2.hero2x==enemy2.enemy2x&&hero2.hero2y==enemy2.enemy2y){
    letsplay2=false;
    System.out.println("You have fallen into the hands of the O's. You lose.");

            }
           if(hero2.hero2x==enemy3.enemy3x&&hero2.hero2y==enemy3.enemy3y){
    letsplay2=false;
    System.out.println("You have fallen into the hands of the O's. You lose.");

            }
           if(hero2.hero2x==treasurex&&hero2.hero2y==treasurey){
    letsplay2=false;
    System.out.println("You win!");
 System.out.println("  ____                            _        __   __");          
System.out.println(" / ___|___  _ __   __ _ _ __ __ _| |_ ___  \\ \\ / /__  _   _");
System.out.println("| |   / _ \\| '_ \\ / _` | '__/ _` | __/ __|  \\ V / _ \\| | | |");
System.out.println("| |__| (_) | | | | (_| | | | (_| | |_\\__ \\   | | (_) | |_| |");
 System.out.println(" \\____\\___/|_| |_|\\__, |_|  \\__,_|\\__|___/   |_|\\___/ \\__,_|");
  System.out.println("                  |___/    ");                                 
System.out.println(" __        ___       _ ");
System.out.println(" \\ \\      / (_)_ __ | |");
 System.out.println("  \\ \\ /\\ / /| | '_ \\| |");
 System.out.println("   \\ V  V / | | | | |_|");
     System.out.println("    \\_/\\_/  |_|_| |_(_)");
                      

           }
           if(hero2.hero2x==treasuretrapx&&hero2.hero2y==treasuretrapy){
    letsplay2=false;
  
    
 System.out.println("                        _  _          _"); 
System.out.println(" _   _  ___  _   _    __| (_) ___  __| |");
System.out.println("| | | |/ _ \\| | | |  / _  | |/ _ \\/ _  |");
System.out.println("| |_| | (_) | |_| | | (_| | |  __/ (_| |");
System.out.println("\\__, | \\___/ \\__,_|  \\__,_|_|\\___|\\__,_|");
System.out.println ("|___/");                                  

            }
           if(hero2.hero2x==trapx&&hero2.hero2y==trapy){
    letsplay2=false;
    System.out.println("You stepped on a bear trap and bled out.");

            }
           
         
  
         
}

   
}

