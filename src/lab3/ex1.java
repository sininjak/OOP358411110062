package lab3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is you nickname? : ");
        name = sc.nextLine();
        System.out.println("Hello,"+name);

        String age;
        System.out.println("how old are you: ");
        age = sc.nextLine();
        System.out.println("you are"+age+"years old");

        //if-else-if
        int score=1;
        if (score>=1&&score<=30)
            System.out.println("เด็กเกิน");
        else if (score>=31&&score<=60)
            System.out.println("แก่จัง");
        else
            System.out.println("Invalid score.");

    }
}
