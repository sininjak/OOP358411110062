package lab6;

import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        String myMsg = "I am working at RUTS 2018";
        StringBuffer strBut = new StringBuffer(myMsg);

        System.out.println(strBut);
        System.out.println(strBut.reverse());
        strBut.append("Happy New Year' 2019");
        System.out.println(strBut);

        //StringTokenizer
        StringTokenizer token = new StringTokenizer(strBut.toString());

        System.out.print(token);
        System.out.print(token.countTokens());

        while (token.hasMoreElements()) {
            System.out.println(token.nextToken());
        }
    }
}
