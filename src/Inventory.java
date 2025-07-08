import java.util.*;
import java.time.Year;
public class Inventory {
    List<Book> Books;

    public Inventory() {
        Books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        for (Book b: Books)
        {
            if (book.getISPN().equalsIgnoreCase(b.getISPN()))
            {
                int index = Books.indexOf(b);
                Books.set(index, book);
                return;
            }
        }
        Books.add(book);
       // System.out.println("A new book has been added successfully");
    }
    public void removeBooks()
    {
        List<Book> old_books = new ArrayList<Book>();
        for (Book b: Books)
        {
            if (!b.checkOutdated(Year.now().getValue()))
            {
                old_books.add(b);
            }
        }
        Books.removeAll(old_books);
    }

    public double BuyBook(String ISBN, int Quantity, String email, String Address)
    {
        Book requiredBook = GetBook(ISBN);
        if (requiredBook == null) throw new Error("Book is not in inventory");
        requiredBook.ValidateBook(Quantity, Year.now().getValue());
        double price = requiredBook.BuyBook(Quantity, email, Address);
        return price;
    }

    public Book GetBook(String ISBN)
    {
        for (Book b: Books)
        {
            if (b.getISPN().equalsIgnoreCase(ISBN))
            {
                return b;
            }
        }
        return null;
    }




}
