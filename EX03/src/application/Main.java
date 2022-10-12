package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter the first note: ");
        student.noteA = sc.nextDouble();
        System.out.println("Enter the second note: ");
        student.noteB = sc.nextDouble();
        System.out.println("Enter the third note: ");
        student.noteC = sc.nextDouble();
        System.out.println(student);
        System.out.println(student.points());
    }
}