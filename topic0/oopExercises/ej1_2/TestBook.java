package oopExercises.ej1_2;

public class TestBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Author author = new Author("German", "german@martinez.com", 'm');
		Book aBook = new Book("ava for dummies", author, 19.0, 1000);
		Book anotherBook = new Book("more Java for dummies", new Author("Daniel", "dani@dani.com", 'm'), 29.0, 888);

		System.out.println(aBook.getAuthor().getName() + " " + aBook.getAuthor().getEmail());

		System.out.println(anotherBook.getAuthorName() + " " + anotherBook.getAtuthorEmail());

	}

}
