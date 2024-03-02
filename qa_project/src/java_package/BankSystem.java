package java_package;

public class BankSystem {
	
	BankSystem(String username,String pass)
	{
		System.out.println("The usrename and password "+username+ " "+pass);
	}

	int amt =1000;
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The amount after deposit "+amt);
	}
	void withdraw(int wt)
	{
	amt = amt-wt;	
	System.out.println("The amount after withdraw "+amt);
	}
	
	int display()
	{
		return amt;
	}
	public static void main(String[] args) {
		// Create a object
		BankSystem bcd =new BankSystem("Gerard12","1234");
		bcd.deposit(1000);
		bcd.withdraw(500);
		System.out.println(bcd.display());

	}

}
