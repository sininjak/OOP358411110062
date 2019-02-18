package lab8;

public class PersonApp {
    public static void main(String[] args) {

        //create object
        Person person1,person2,person3;
        person1 = new Person("PID001","Rung","1996");
        person2 = new Sheriff("PID002","jirapong","1998","ทุ่งสง");
        person3 = new Police("PID003","Ko","1997","ทุ่งใหญ่");

        person1.introduce();
        person2.introduce();
        person3.introduce();



    }
}