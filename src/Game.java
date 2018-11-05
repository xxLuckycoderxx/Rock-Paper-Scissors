import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[]args){
         //use array to pull users choice\
        //scor keeping variable with feedback of score to players
        //loop to start game over
        //use if else statementsto build game's core


        int number []={0,1,2};
        int answer;
        Scanner keyboard=new Scanner(System.in);

       System.out.println("We are going to play a game of Rock,Paper,Scissor");

        System.out.println("Here's the rubric 0=Rock 1=Paper 2=Scissors");
        System.out.println("You'll get 80 points guess right gain 20 points ,guess wrong lose 20 points");

        System.out.println("Are you Ready?");


            for(int mag=1;mag<2;mag++){
            System.out.println("Rock,Paper scissors,Shoot!!!(enter your answer below,Capitals)");
            answer=keyboard.nextInt();
            int score=80;

                if(answer==0)
                    System.out.println("Try again ");
                    System.out.println(score - 20);

                  else if(answer==1)
                      System.out.print("Game 0ver");
                      System.out.print(score-20+" poinhts");

                  else(answer==2)
                    System.out.println("WINNER");
                    System.out.println(score+"points");
            }













    }
}
