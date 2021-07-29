package Day01_Day_02;

public class geter_setter {
	public  void main(String[] args) {
		Student student = new Student();
        student.setName("?´?˜ì¤?");
        student.setGrade(2);
        student.setBan(10);
        student.setBunho(23);
	}



    public  class Student  {
	private String name;
    private int grade;
    private int ban;
    private int bunho;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBan() {
        return this.ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getBunho() {
        return this.bunho;
    }

    public void setBunho(int bunho) {
        this.bunho = bunho;
    }

    }
}