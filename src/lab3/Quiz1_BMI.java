package lab3;

import java.util.Scanner;

public class Quiz1_BMI {
    public static void main(String[] args) {
        double w,h;
        Scanner sc = new Scanner(System.in);

        System.out.print("น้ำหนักเท่าไร");
        w = sc.nextDouble();
        System.out.print("ส่วนสูงเท่าไร(เมตร)");
        h = sc.nextDouble();

        //calculate BMI
        Double bmi =w/(h*h);
        System.out.println("BMI = "+bmi);
            //Test condition
        if (bmi>=18.50)
            System.out.println("ผอม");
        else if (bmi>=18.60&&bmi<=22.90)
            System.out.println("ปกติ");
        else if (bmi>=23&&bmi<=24.90)
            System.out.println("ท้วม");
        else if (bmi>=25&&bmi<=29.90)
            System.out.println("อ้วน");
        else
            System.out.println("อ้วนมาก");

    }//mani
}//class
