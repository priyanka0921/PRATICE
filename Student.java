package Prink;

public class Student {
	String name;
	Student(String name)
	{
		this.name=name;
	}
	public boolean equals(Object o)
	{
		String n1=this.name;
		Student s=(Student)o;
		String n2=s.name;
		if(n1.equals(n2))// we only use in non-primitive data type.
		{
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("abc");
		Student s2= new Student("abc");
		System.out.println(s1.equals(s2));

	}
	

}
