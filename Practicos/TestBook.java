
public class TestBook {
public static void main(String[] Args){
		
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		System.out.println(aBook);   // call toString()
		System.out.println(anAuthor);
		
		Book anotherBook = new Book("more Java for dummy", new Author("Fulano","mengano@somewhere.com",'f'), 29.95, 888);
		System.out.println(anotherBook);
		
		System.out.println(aBook.getAuthor().getName()); //Printing the name and email of the author from a Book instance using Author methods
		System.out.println(aBook.getAuthorName()); //Printing the name and email of the author from a Book instance using book methods
	}
	
}
