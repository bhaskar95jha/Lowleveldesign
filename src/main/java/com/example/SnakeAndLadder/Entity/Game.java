package com.example.SnakeAndLadder.Entity;

import java.util.Deque;
import java.util.LinkedList;


public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(int bSize, int nSnake, int nLadder) {
        initializeGame(bSize,nSnake,nLadder);
    }

    private void initializeGame(int bSize, int nSnake, int nLadder) {
        board = new Board(bSize,nSnake,nLadder);
        dice = new Dice(1);
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("Bhaskar", 0);
        Player player2 = new Player("Rishika", 0);
        Player player3 = new Player("Simran", 0);
        Player player4 = new Player("Khushbu", 0);

        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);
        playersList.add(player4);
    }

    public void startgame(){

        while(playersList.size()>1){

            //check the player turn
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.getId() + " current position is: " + playerTurn.getCurrPos());

            //roll the dice
            int diceNum = dice.rollDice();

            //move to the new position
            int playerNewPosition = playerTurn.getCurrPos()+diceNum;

            //check new position has snake or ladder or not
            playerNewPosition = jumpCheck(playerNewPosition,playerTurn.getCurrPos());
            playerTurn.setCurrPos(playerNewPosition);

            System.out.println("player turn is:" + playerTurn.getId() + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition == board.cells.length * board.cells.length){
                System.out.println("Player : "+playerTurn.getId()+" win the game and hold position : "+(5-playersList.size()));
                playersList.removeLast();
            }
        }
        System.out.println(playersList.getFirst().getId() +" : Loose the game");

    }

    private int jumpCheck(int playerNewPosition,int playerCurrPos) {
       if(playerNewPosition == board.cells.length * board.cells.length){
           return playerNewPosition;
       }else if(playerNewPosition > board.cells.length * board.cells.length){
           System.out.println("Bad luck you can not move to new position "+playerNewPosition);
           return playerCurrPos;
       }

       Cell cell = board.getCell(playerNewPosition);

       if(cell.jump != null && cell.jump.getStart()==playerNewPosition){
           String jumpBy = (cell.jump.getStart()>cell.jump.getEnd()) ? "Snake" : "Ladder";
           System.out.println("Jump Done by : "+jumpBy);
           return cell.jump.getEnd();
       }

       return playerNewPosition;

    }

    private Player findPlayerTurn() {
        Player player = playersList.removeFirst();
        playersList.addLast(player);
        return player;
    }
}
