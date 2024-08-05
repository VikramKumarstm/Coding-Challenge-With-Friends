package Day03;
public class Book {

    String title, author;
    Integer price;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, Integer price) {
        this.title = title;
         this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book b1 = new Book("This is Java Book", "Shashi");
        Book b2 = new Book("This is Python Book", "Ashutosh", 1200);

        System.out.println("Title : "+ b1.title +" and author :"+ b1.author);
        System.out.println("Title : "+ b2.title +", author :"+ b2.author +" and price :"+ b2.price);
    }
}
