package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Player {
    private int score=0;
    private String name;
    public enum Choices {
        PAPER,
        ROCK,
        SCISSORS
    }
    private Choices choice;


    public Player(String name){
        this.name = name;
    }

    public void earnPoints(){
        this.score++;
    }

    public int getScore(){
        return this.score;
    }

    public String getName(){
        return this.name;
    }

    public void setChoice(Choices choice){
        this.choice=choice;
    }

    public Choices getChoise(){
        return this.choice;
    }

    public Choices getPlayerMove(){
        Scanner scan = new Scanner(System.in);
        while (true){
            String choice = scan.nextLine();
            String playerChoice = choice.toUpperCase();
            if(playerChoice.equals("ROCK") || playerChoice.equals("PAPER") || playerChoice.equals("SCISSORS")){
                return Choices.valueOf(playerChoice);
            }else{
                System.out.println("This is not Valid Move, Try again! Paper-Rock-Scissors");
            }
        }
    }

    public Choices playRandom(){
        return Choices.values()[ new SecureRandom().nextInt(Choices.values().length)];
    }

}
