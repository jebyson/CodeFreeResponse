package com.company;

/**
 * Created by je565 on 11/2/17.
 */
public class Code {

    private String myCode;
    private String part;
    private char[] ch;
    private String myCodeTwo;
    private String myCodeThree;

    public Code(String code)
    {
        myCode = code;
        myCodeTwo = code;
    }

    public void hide(int p1, int p2)
    {
        part = myCode.substring(p1, p2);
        ch = new char[myCode.length()];
        ch = part.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            ch[i] = 'X';
        }

        for (char j : ch)
        {
            myCodeThree += j;
        }

        myCode = myCodeTwo.substring(0, p1) + myCodeThree + myCodeTwo.substring(p2, myCodeTwo.length());
    }

    public void recover(int p1, int p2)
    {
        myCodeTwo += "";
        myCode = myCodeTwo;
    }

    public String getCode()
    {
        return myCode;
    }
}
