package Day01_Day_02;
public class Hw5 {
	public static void main(String[] arg) {
		Pet myCat = new Pet("?å°?å°");
		Pet myDog = new Pet("?ë∏?ì§","?ùº?ñº" ,2);

	
	}
}

class Pet {
	
	public Pet(String pname) {
		type=pname;
	}
	public Pet(String ptype, String pname, int page) {
		type=ptype;
		name=pname;
		age=page;
	}
	String type;
	String name;
	int age;
}