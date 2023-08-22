package kotlinAlgos;

import java.util.Stack;



public class Reveresed {

    public static void main(String[] args) {
        System.out.print(reverseOnlyLetters("ab-cd"));
    }


    public static String reverseOnlyLetters(String S)
    {
        Stack<Character> letters = new Stack();
        for (char ch: S.toCharArray())
        {
            if (Character.isLetter(ch))
                letters.push(ch);
        }

        String ans = "";

        for (char ch: S.toCharArray())
        {
            if (Character.isLetter(ch))
                ans += letters.pop();
            else
                ans += ch ;
        }

        return ans;
    }
}

