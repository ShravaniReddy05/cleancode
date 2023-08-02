package casestudy;

public class User
{
	public void userLogin(String userName, String password)
	{
		System.out.println("Enter the username"+userName+"and password"+password);
		System.out.println("Successfully logged in");
	}
	public static void main(String[] args)
	{
		User object=new User();
		object.userLogin("Shravani", "Shravani@123");
	}
}