package Day01_Day_02;
public class Hw4{
    public static void main(String args[]) {
        
        Student s=new Student();
        s.name="�̿���";
        s.classs=14;
        s.number=1;
        System.out.println("�̸� : "+s.name+"�� : "+s.classs+"��ȣ : "+s.number);
    }
}

class Student  {    //Ŭ����
    String name; //�������
    int classs; //�������
    int number; //�������
}
