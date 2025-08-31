package datadefinitionsinjava;

//to represent a book in a bookstore
class Book {
	String title;
	Author author;
	int price;
	Publisher publisher;

	// the constructor
	Book(String title, Author author, int price, Publisher publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
}

//to represent a author of a book in a bookstore
class Author {
	String name;
	int yob;

	// the constructor
	Author(String name, int yob) {
		this.name = name;
		this.yob = yob;
	}
}

class Publisher {
	String name;
	String countryOfOperation;
	int openedYear;

	Publisher(String name, String countryOfOperation, int openedYear) {
		this.name = name;
		this.countryOfOperation = countryOfOperation;
		this.openedYear = openedYear;
	}
}

class ExamplesBooks {
	ExamplesBooks() {
	}

	Author pat = new Author("Pat Conroy", 1948);
	Publisher publisher = new Publisher("Penguin Random House", "New York", 2013);
	Book beaches = new Book("Beaches", this.pat, 20, publisher);
}


public class DataDefinitions {

	public static void main(String[] args) {

	}

}
