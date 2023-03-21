
class Library1 {

    String[] books;
    int no_of_books = 0;

    Library1() {
        this.books = new String[100];
        this.no_of_books = 0;

    }

    void addBooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "book has been added");
    }

    void showAvailableBooks() {
        System.out.println("Available books are ");
    
    for(String book :this.books){
        if(book==null){
            continue;
        }
            System.out.println("* "+book);
}
    }
    void issuedBooks(String book){
        //for(String b :this.books){
            for(int i=0;i<this.books.length;i++){
               // String b=this.books[i];
        if(this.books[i].equals(book)){
            System.out.println("the book has been issued ");
            this.books[i]=null;
            return;
        }
        //    System.out.println("* "+book);
}
            System.out.println("this book does not exit ");
    }
    
void returnBooks(String book){
///this.books[no_of_books]=book;
addBooks(book);
}
}
public class LIbrary {

    public static void main(String[] args) {

        Library1 centralLib = new Library1();
        centralLib.addBooks("think and grow rich");
        centralLib.addBooks("Algorith");
        centralLib.addBooks("c++");
centralLib.showAvailableBooks();
centralLib.issuedBooks("c++");
centralLib.showAvailableBooks();
centralLib.returnBooks("c++");
centralLib.showAvailableBooks();
    }
}
