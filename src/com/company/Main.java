package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Code myWord = new Code("rainbow");
        myWord.hide(2, 5);
        System.out.println(myWord.getCode());
        myWord.recover(2, 5);
        System.out.println(myWord.getCode());
    }
}
