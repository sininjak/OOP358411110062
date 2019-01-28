package lab7;

public class StudentApp {
    public static void main(String[] args) {
        //opject creation
        //การสร้าง opject
        Student std1 = new Student();
        System.out.println(std1.getName());
        std1.setName("Boy");
        System.out.println(std1.getName());
        System.out.println(std1.getGender());
        std1.setGender('M');
        System.out.println(std1.getGender());
        std1.setId("s358411110062");
        System.out.println(std1.getId());
        ///////////////////////////////
        Student std2 = new Student("22222222222","Girl",'F');

        System.out.println(std1.getName());
        System.out.println(std2.getName());



    }
}//class
