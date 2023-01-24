package com.example.SpringInitilized.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("look up");
    }

    public void down() {
        System.out.println("sit");
    }

    public void left() {
        System.out.println("block");
    }

    public void right() {
        System.out.println("shoot");
    }
}
