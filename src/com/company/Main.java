package com.company;

import java.util.Scanner;

import static com.company.Player.*;
import static com.company.Player.Choices.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(folksDev);
        System.out.println("Welcome to Paper-Rock-Scissors game");
        System.out.print("Please enter your name : ");

        Scanner sc = new Scanner(System.in);

        Player player1=new Player("Computer");
        Player player2=new Player(sc.nextLine());

        System.out.print("How many times do you want to play the game? : ");
        int times=0,i=0;
        times=sc.nextInt();


        while (i<times){//while statement for the game round
            System.out.print("Enter your move : ");
            player1.setChoice(player1.playRandom());
            player2.setChoice(player2.getPlayerMove());
            System.out.println("\n"+player1.getName()+" played : "+player1.getChoise()+" ------- "+player2.getName()+" played : "+player2.getChoise());

            if (player1.getChoise() == player2.getChoise())//if choises are same
            {
                System.out.println("It is a tie");
            } else {//if choises are not same
                switch (player1.getChoise()) {
                    case ROCK:
                        if (player2.getChoise() == SCISSORS){
                            System.out.println(player1.getName() + " wins!");
                            player1.earnPoints();
                        }
                        else{
                            System.out.println(player2.getName() + " wins!");
                            player2.earnPoints();
                        }
                        break;
                    case SCISSORS:
                        if (player2.getChoise() == PAPER){
                            System.out.println(player1.getName() + " wins!");
                            player1.earnPoints();
                        }
                        else{
                            System.out.println(player2.getName() + " wins!");
                            player2.earnPoints();
                        }
                        break;
                    case PAPER:
                        if (player2.getChoise() == ROCK){
                            System.out.println(player1.getName() + " wins!");
                            player1.earnPoints();
                        }
                        else{
                            System.out.println(player2.getName() + " wins!");
                            player2.earnPoints();
                        }
                        break;
                }//end of switch statement
            }//end of else statement
            i++;//to increase the round
            System.out.println(i+". result is : "+player1.getName()+" = "+player1.getScore()+" ------- "+player2.getName()+" = "+player2.getScore()+"\n");
        }//end of while
        System.out.println("Game result is : "+player1.getName()+" = "+player1.getScore()+" ------- "+player2.getName()+" = "+player2.getScore());
        if(player1.getScore()==player2.getScore()){
            System.out.println("The game ended in a draw");
        }else{
            System.out.println(((player1.getScore() > player2.getScore()) ? player1.getName() :player2.getName())+" win the game.");
        }

    }


    private static final String folksDev =
            """
                    ███████╗░█████╗░██╗░░░░░██╗░░██╗░██████╗██████╗░███████╗██╗░░░██╗
                    ██╔════╝██╔══██╗██║░░░░░██║░██╔╝██╔════╝██╔══██╗██╔════╝██║░░░██║
                    █████╗░░██║░░██║██║░░░░░█████═╝░╚█████╗░██║░░██║█████╗░░╚██╗░██╔╝
                    ██╔══╝░░██║░░██║██║░░░░░██╔═██╗░░╚═══██╗██║░░██║██╔══╝░░░╚████╔╝░
                    ██║░░░░░╚█████╔╝███████╗██║░╚██╗██████╔╝██████╔╝███████╗░░╚██╔╝░░
                    ╚═╝░░░░░░╚════╝░╚══════╝╚═╝░░╚═╝╚═════╝░╚═════╝░╚══════╝░░░╚═╝░░░""";
}
