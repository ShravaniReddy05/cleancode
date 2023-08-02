package casestudy;
public class Book {
	public void viewbooks(String authorName, float price, String publisher)
	{
	System.out.println("Details of the books");
	}
	public static void main(String[] args)
	{
		Book bookObject=new Book();
		bookObject.viewbooks("James",400,"Evans");
	}


}
