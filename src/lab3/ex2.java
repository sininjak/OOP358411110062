package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("ชื่ออะไรหรอ? : ");
        name = sc.nextLine();
        System.out.println("สวัสดี,"+name);

        String age;
        System.out.println("อายุเท่าไร: ");
        age = sc.nextLine();
        System.out.println("อายุ"+age+"ปี");

        String sex;
        System.out.println("เพศอะไร: ");
        sex = sc.nextLine();
        System.out.println(" ");

        String address;
        System.out.println("คุณอยู่ที่ไหน: ");
        address = sc.nextLine();
        System.out.println(" ");

        String phone ;
        System.out.println("ใช้เบอร์โทรศัพท์อะไร: ");
        phone = sc.nextLine();
        System.out.println(" ");

    }//main
}//class
