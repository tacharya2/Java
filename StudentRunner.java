package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {

		// instance of students
		List<Student> students = List.of(new Student(3, "Ranga"), new Student(1, "Tek"), new Student(2, "Hema"));
		// Arrays.toString(students);

		// We wanted to sort the students using their id
		List<Student> studentsAl = new ArrayList<>(students);

		Collections.sort(studentsAl);// need to implement comparable interface
		System.out.println((studentsAl));

		Collections.sort(studentsAl, new DecendingStudentComparator());
		System.out.println("Decending: " + studentsAl);
	}
}
