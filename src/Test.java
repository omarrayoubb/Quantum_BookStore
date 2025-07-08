public class Test {
    Inventory inventory;

    public Test() {
        inventory = new Inventory();
    }

    public void addTest()
    {
        Book PaperBook = new PaperBook("Miracles", "Miracle in cell no7", "ahmed morad", 2024, 50, 3, 51.0);
        Book EBook = new EBook ("m6", "Miracle in cell no7", "ahmed morad", 2024, 50, 100, "PDF");
        Book PaperBooks = new PaperBook("omar", "M60", "ahmed morad", 2024, 50, 3, 51.0);
        inventory.addBook(PaperBook);

        System.out.println("Before Adding 2 books: " + inventory.Books.size());

        printInventory();
        System.out.println("--------------------------------------------------------------------");


        inventory.addBook(EBook);
        inventory.addBook(PaperBooks);

        System.out.println("After Adding 2 books: " + inventory.Books.size());
        printInventory();


    }

    public void TestRemove()
    {



        PaperBook book1 = new PaperBook("123", "Book A", "ahmed",2020, 3, 3, 51.5);
        EBook book2 = new EBook("456", "Book B", "seuf", 2015,5, 15.0, "docx");
        DemoBook book3 = new DemoBook("789", "Book C", "ahmed",2024, 3); // Valid

        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);

        System.out.println("Before removeBooks(): " + inventory.Books.size());
        printInventory();


        inventory.removeBooks();

        System.out.println("After removeBooks(): " + inventory.Books.size());
        printInventory();

    }


    public void printInventory()
    {
//        System.out.println(inventory.Books.size());
        for (Book b: inventory.Books)
        {
            System.out.println(b.getISPN());
        }
    }


}
