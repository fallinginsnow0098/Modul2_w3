package bai21.thuchanh._Singleton;


public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();

        haveBook = borrowedBook != null;
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTittle();
        }
        return "I don't have the book";
    }

    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}