package advance.dev;

import java.util.Scanner;

public class MainApp {
	static Student[] input() {
		Student[] stu = new Student[10];
		for(int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao ten sinh vien: ");
			String name = sc.next();
			System.out.println("Nhap vao tuoi:");
			int age = sc.nextInt();
			System.out.println("Nhap vao dia chi:");
			String address = sc.next();
			System.out.println("Nhap vao so dien thoai:");
			String number = sc.next();
			System.out.println("Nhap vao diem trung binh = ");
			float markAverage = sc.nextFloat();
			Student std = new Student(name, age, address, number, markAverage);	
			stu[i] = std;
		}
		return stu;
	}
	static void print(Student[] std) {
		for (int i = 0; i < 10; i++) {
			String str = String.format("Ten sinh vien: %s, Tuoi: %d, Dia chi: %s, So dien thoai: %s, Diem TB: %f", std[i].getName(), std[i].getAge(), std[i].getAddress(), std[i].getNumber(), std[i].getMarkAverage());
			System.out.println(str);
			}
		}
	
	static void sort(Student[] std) {
		Student temp = std[0];
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if (std[i].getMarkAverage() > std[j].getMarkAverage() ) {
					temp = std[i];  
					std[i] = std[j];
					std[j] = temp;
				}
			}
		}
		System.out.println("Mang sau khi sap xep la:");
		print(std);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[10];
		student = input();
		print(student);
		sort(student);
	}

}
