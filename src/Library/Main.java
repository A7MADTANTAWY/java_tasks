package Library;

public class Main {

	public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("C++", "Eng taha", "1234567890");
        Book book2 = new Book("Tantawy,s Life", "TAntawy", "123456789");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in library:");
        library.displayBooks();

        library.removeBook("1984");

        System.out.println("Books in library after removal:");
        library.displayBooks();
	}

}
