
public class TestAuthor {

	public static void main(String[] Args){
		
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor);   // call toString()
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);
	}
	
}
