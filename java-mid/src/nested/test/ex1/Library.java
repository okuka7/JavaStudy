package nested.test.ex1;

import java.awt.print.Book;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }


    public void addBook(String title, String author) {
        //검증 로직을 먼저 다 처리하고
        if(bookCount > books.length) {
            System.out.println("저장공간이 부족합니다.");
            return;
        }
        //정상 로직을 처리
        books[bookCount] = new Book(title, author);

        //검증로직과 정상로직을 구별하기가 쉽다. 이렇게 실무에서 많이 쓴다.



    }

    public void showBooks() {
        System.out.println("책 목록 출력");
        for (int i = 0; i <bookCount; i++) {
            Book book = books[i];
            System.out.println(book.title+book.author);
        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
