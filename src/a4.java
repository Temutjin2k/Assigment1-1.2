class Book{
    private String name;
    private String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}

class Reader{
    String fullName;
    String faculty;
    String phone;
    String birthday;
    int cardNumber;

    public Reader(String fullName, String faculty, String phone, String birthday, int cardNumber){
        this.fullName = fullName;
        this.faculty = faculty;
        this.phone = phone;
        this.birthday = birthday;
        this.cardNumber = cardNumber;
    }

    public Reader(String fullName){
        this.fullName = fullName;
    }

    public void takeBook(int amount){
        System.out.println(fullName + " took " + amount + " books");
    }

    public void takeBook(String... title){
        System.out.print(fullName + " took books: ");
        for(String s: title){
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... book){
        System.out.print(fullName + " took books: ");
        for(Book s: book){
            System.out.print(s.getName() + "(" + s.getAuthor() + ")" + ", ");
        }
        System.out.println();
    }


    public void returnBook(int amount){
        System.out.println(fullName + " returned " + amount + " books");
    }

    public void returnBook(String... title){
        System.out.print(fullName + " returned the books: ");
        for(String s: title){
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... book){
        System.out.print(fullName + " returned the books: ");
        for(Book s: book){
            System.out.print(s.getName() + "(" + s.getAuthor() + ")" + ", ");
        }
        System.out.println();
    }

}

public class a4 {
    public static void main(String[] args){
        Reader s = new Reader("Erasyl");
        Book a = new Book("Metro", "Dmitriy");

        s.takeBook(3);
        s.takeBook("Metro", "Bekazat");
        s.takeBook(a);

        s.returnBook(3);
        s.returnBook("Metro", "Bekazat");
        s.returnBook(a);
    }
}