package Day01_Day_02;
public class Hw4{
    public static void main(String args[]) {
        
        Student s=new Student();
        s.name="이영준";
        s.classs=14;
        s.number=1;
        System.out.println("이름 : "+s.name+"반 : "+s.classs+"번호 : "+s.number);
    }
}

class Student  {    //클래스
    String name; //멤버변수
    int classs; //멤버변수
    int number; //멤버변수
}
