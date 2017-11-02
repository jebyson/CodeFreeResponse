package com.company;

public class Main {

    public static void main(String[] args) {

        Code myWord = new Code("null");
        myWord.hide(2, 4);
        System.out.println(myWord.getCode());
        myWord.recover(2, 4);
        System.out.println(myWord.getCode());
    }
}