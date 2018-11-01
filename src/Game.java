import java.util.Scanner;

public class Game {
    public static void main(String[]args){
         //use array to pull users choice\
        //scor keeping variable with feedback of score to players
        //loop to start game over
        //use if else statementsto build game's core

       /* int paper>rock+<scissors;
        int scissors>paper+<rock;
        int rock<scissors;


        String choice;
        Scanner keyboard;
        keyboard=new Scanner(System.in);

        for(int name=1;name<4;name++) {
            System.out.println("We are going to play a game of Rock Paper,Scissors.Ready set GO.Rock,Paper,Scissors...");
            choice=keyboard.nextLine();
            if(choice==)
        }*/

      int choices[]={0,1,2};
       String answer;
        Scanner keyboard=new Scanner(System.in);
       int score=80;

       System.out.println("We are going to play a game of Rock,Paper,Scissor");

        System.out.println("Here's the rubric 0=Rock 1=Paper 2=Scissors");
        System.out.println("You'll get 60 points guess right gain 20 points ,guess wrong lose 20 points");

        System.out.println("Are you Ready?");

            for(int mag=1;mag<4;mag++){
            System.out.println("Rock,Paper scissors,Shoot!!!(enter your answer below,Capitals)");
            answer=keyboard.nextLine();




                    if(answer.equals(choices[0]))
                    System.out.println("Try again ");
                    System.out.println(score-20 +" points left");

                    if(answer.equals(choices[1}))
                    System.out.println("Pdd ");
*/
                     elseif(answer.equals(choices[1]))
                     System.out.println("Nice Try");
                     System.out.println(score-20+ "points left");

             elseif(answer.equals(choices[2]))
             System.out.println("GOOD JOB");
             System.out.println(score+20+ "points left");


        }








    }
}
