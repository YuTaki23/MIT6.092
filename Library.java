public class Library {
    // Add the missing implementation to this class
    String address;
    Book[] Book;
    int BooksNumber;

    public Library(String libraryAddress){
        address = libraryAddress;
        Book = new Book[4];
        BooksNumber = 0;
    }

    public void addBook(Book newbook){
        Book[BooksNumber] = newbook;
        BooksNumber++;
    }

    //所有人都一样 用static method
    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm");
    }

    public void printAddress(){
        System.out.println(address);
    }

    public void borrowBook(String name){
        for(int i = 0; i < BooksNumber; i++){
            if(Book[i].getTitle().equals(name)){
                if(Book[i].isBorrowed()){
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
                else{
                    System.out.println("You successfully borrowed The Lord of the Rings");
                    Book[i].borrowed();
                    return;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks(){
        if(BooksNumber == 0){
            System.out.println("No book in catalog");
        }

        for(int i = 0; i < BooksNumber; i++){
            if(!Book[i].isBorrowed()){
                System.out.println(Book[i].getTitle());
            }
        }
    }

    public void returnBook(String name){
        for(int i = 0; i < BooksNumber; i++){
            if(Book[i].getTitle().equals(name)){
                if(Book[i].isBorrowed()){
                    System.out.println("You successfully returned" + name);
                    Book[i].returned();
                    return;
                }
                else{
                    System.out.println("This book was not borrowed");
                }
            }
        }
    }

    public static void main(String[] args){
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); }
}
