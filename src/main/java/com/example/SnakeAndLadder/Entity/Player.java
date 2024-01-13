package com.example.SnakeAndLadder.Entity;

public class Player {
    private String id;
    private int currPos;

    public Player(String id, int currPos) {
        this.id = id;
        this.currPos = currPos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrPos() {
        return currPos;
    }

    public void setCurrPos(int currPos) {
        this.currPos = currPos;
    }
}
