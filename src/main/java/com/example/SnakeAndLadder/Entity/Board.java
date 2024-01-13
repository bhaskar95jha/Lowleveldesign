package com.example.SnakeAndLadder.Entity;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell [][] cells;

    public Board(int bSize, int nSnake, int nLadder) {
        initializeCells(bSize);
        addSnakesLadders(cells,nSnake,nLadder);
    }

    private void initializeCells(int bSize) {
        cells = new Cell[bSize][bSize];

        for(int i=0; i<bSize; i++) {
            for(int j=0; j<bSize; j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }


    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders){

        while(numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-2);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,snakeHead);

            Jump snakeObj = new Jump();
            snakeObj.setStart(snakeHead);
            snakeObj.setEnd(snakeTail);

            if(!jumpAvail(snakeObj)){
                continue;
            }

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(ladderStart,cells.length*cells.length-1);

            Jump ladderObj = new Jump();
            ladderObj.setStart(ladderStart);
            ladderObj.setEnd(ladderEnd);

            if(!jumpAvail(ladderObj)){
                continue;
            }

            Cell cell = getCell(ladderStart);
            cell.setJump(ladderObj);

            numberOfLadders--;
        }

    }

    private boolean jumpAvail(Jump snakeObj) {
        Cell cell = getCell(snakeObj.getStart());
        if(cell.getJump() == null){
            return true;
        }
        return false;
    }


    public Cell getCell(int playerNewPosition) {
        int row = playerNewPosition/cells.length;
        int col = playerNewPosition% cells.length;

        return cells[row][col];
    }
}
