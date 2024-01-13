package com.example.SnakeAndLadder;

import com.example.SnakeAndLadder.Entity.Game;

import java.io.*;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) throws IOException {

        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("enter the board size");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bSize = Integer.parseInt(st.nextToken());

        System.out.println("enter the number of snake");
        st = new StringTokenizer(br.readLine());
        int nSnake = Integer.parseInt(st.nextToken());

        System.out.println("enter the number of Ladder");
        st = new StringTokenizer(br.readLine());
        int nLadder = Integer.parseInt(st.nextToken());

        Game game = new Game(bSize,nSnake,nLadder);
        game.startgame();
    }
}
