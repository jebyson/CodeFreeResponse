package com.company;

public class Main {

    public static void main(String[] args) {

        Code myWord = new Code("nullify");
        myWord.hide(2, 6);
        System.out.println(myWord.getCode());
        myWord.recover(2, 6);
        System.out.println(myWord.getCode());
    }
}