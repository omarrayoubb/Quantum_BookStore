public class DemoBook extends Book{
    public DemoBook(String ISPN, String name, String author, int year, int outdated_duration, double price) {
        super(ISPN, name, author, year, outdated_duration, price);
    }

    @Override
    public boolean ValidateBook(int Quantity, int year) {
        return false;
    }
}
