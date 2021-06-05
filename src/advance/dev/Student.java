package advance.dev;

public class Student {
	private String name;
	public Student(String name, int age, String address, String number, float markAverage) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
		this.markAverage = markAverage;
	}
	private int age;
	private String address;
	private String number;
	private float markAverage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age; 
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public float getMarkAverage() {
		return markAverage;
	}
	public void setMarkAverage(float markAverage) {
		if(markAverage>=0) {
		this.markAverage = markAverage; 
		}
	}
	
}
