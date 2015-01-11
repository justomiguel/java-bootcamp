package oopExercises.ej1_2;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	// Constructor

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;

	}

	// Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	// Methods

	public String toString() {

		return this.getName() + " by " + this.author.toString();

	}

	public String getAuthorName() {
		return this.author.getName();
	}

	public String getAtuthorEmail() {
		return this.author.getEmail();
	}

}
