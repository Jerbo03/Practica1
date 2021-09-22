
public class Student {
	public String name;
	public String gender;
	private String cui;
	private int age;
	
	//constructores, completo y sencillo
	public void Student(String pName, String pGender, String pCui, int pAge) {
		name = pName;
		gender = pGender;
		cui = pCui;
		age = pAge;
	}
	
	public void Student(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	
	//getters
	public int getAge() {
		return age;
	}
}
