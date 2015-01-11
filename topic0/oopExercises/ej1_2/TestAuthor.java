package oopExercises.ej1_2;

public class TestAuthor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Author anAuthor = new Author("German Martinez", "german@martinez.com", 'm');
		System.out.println(anAuthor);
		anAuthor.setEmail("daniel@nowhere.com");
		System.out.println(anAuthor);

	}

}
