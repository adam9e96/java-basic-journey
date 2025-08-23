package ch08_Class.sec02_Constructor;

// 생성자 오버로딩 예제
class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book() {
        this("미정", "미정", 0);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}


public class Constructor05 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("그것", "스티븐 킹");
        Book book3 = new Book("그린 마일", "스티븐 킹", 20000);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

    }
}
