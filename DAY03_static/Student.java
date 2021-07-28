package DAY03_static;

public class Student {
    static int StudentId=1000;
    int myId;
    String studentName;
    public Student(String studentName){
        this.studentName = studentName;
        StudentId=StudentId + 1;
        myId=StudentId;
    }
    public void showInfo(){
        System.out.println(
            studentName+":"+myId
        );
    }
}
