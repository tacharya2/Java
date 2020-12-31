package udemy;

import java.util.Comparator;

class DecendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id
	 * @param name
	 */
//Constructors
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override // @ because we are overriding the actual toString method to the way we need for
				// this one
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student other) {// can also use that in place of other

		return Integer.compare(this.id, other.id);// this.id.compareTo(other.id);//does not work with primitive type

	}

}
