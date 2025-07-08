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


        System.out.println("Before");
        printInventory();
        System.out.println("--------------------------------------------------------------------");


        inventory.addBook(EBook);
        inventory.addBook(PaperBooks);

        System.out.println("After");
        printInventory();


    }
    public void printInventory()
    {
        System.out.println(inventory.Books.size());
        for (Book b: inventory.Books)
        {
            System.out.println(b.getISPN());
        }
    }


}
