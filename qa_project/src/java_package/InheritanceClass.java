package java_package;

public class InheritanceClass {
	
	void add(int a)
	{
		System.out.println(a);
	}

	void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceClass  obj = new InheritanceClass();
		// method overloading 
		obj.add(30);
		obj.add(30, 40);
		
		College obj1 = new College();
		// method overriding
        obj1.name();
		obj1.department();
	}

}


class University
{
 void name()
 {
	 System.out.println("The name of university");
 }
 
 protected void department()
 {
	 System.out.println("The IT department");
 }
 
}

class College extends University
{
	void name()
	{
		System.out.println("The name of college is havard");
	}
	
}