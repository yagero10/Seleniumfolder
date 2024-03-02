package java_package;

public class WebsitePortal extends UserCredentails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void logindetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter the username and password ");
	}

}




abstract class UserCredentails
{
	abstract void logindetails();
	
	void profileDetails()
	{
		System.out.println("The name of the username is Gerad");
	}
	
}