package java_package;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		obj.setId(1010);
		System.out.println(obj.getId());
	}

}


class Student 
{
	private int id ;
	
	void setId(int a)
	{
		id=a;
	}
	
	int getId()
	{
		return id;
	}
}