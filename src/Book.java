import java.io.*;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }

    // TODO 6a: Define a static void method named serializeBook with two parameters book of type Book and filePath of type String
    public static void serializeBook(Book book, String filePath) {
        // TODO 6b: Create a try-with-resources block
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            // TODO 6c: Write the object to the file using writeObject()
            out.writeObject(book);

            // TODO 6d: Print a message indicating that the book data was serialized
            System.out.println("Serialized book data is saved in " + filePath);
        } catch (IOException e) {
            // TODO 6e: Handle any IOException that occurs during the process
            e.printStackTrace();
        }
    }

    // TODO 7a: Define the deserializeBook method with the parameter filePath of type String and return type Book
    public static Book deserializeBook(String filePath) {
        Book book = null;  // TODO 7b: Initialize book as null

        // TODO 7c: Create a try-with-resources block
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            // TODO 7d: Read the object from the file and cast it to a Book object
            book = (Book) in.readObject();

            // TODO 7e: Print a message indicating that the book data was deserialized
            System.out.println("Deserialized book data from " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            // TODO 7f: Handle any IOException or ClassNotFoundException
            e.printStackTrace();
        }

        // TODO 7g: Return the deserialized book object
        return book;
    }

}
