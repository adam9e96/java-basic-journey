package ch08_class.sec02_constructor.constructor_study;

public class Book02 {
	String title;
	String author;
	
	public Book02(String title) {
		this(title,"작자미상");
	}
    public Book02(String title, String author) {
		this.title = title;
		this.author = author;
	}

    public Book02() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    void show() {
        System.out.println(title + " " + author);
    }

	public static void main(String[] args) {
		Book02 littlePrince = new Book02("어린왕자", "생텍쥐페리");
		Book02 loveStory = new Book02("춘향전");
		Book02 emptyBook = new Book02();

		loveStory.show();
		System.out.println("=====");
		littlePrince.show();

	}
}
