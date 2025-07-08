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
            if (book.getISPN() == book.getISPN())
            {
                b = book;
                return;
            }
        }
        Books.add(book);
    }
    public void removeBooks()
    {
        for (Book b: Books)
        {
            if (!b.checkOutdated(Year.now().getValue()))
            {
                Books.remove(b);
            }
        }
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
