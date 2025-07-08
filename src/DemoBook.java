public class DemoBook extends Book{
    public DemoBook(String ISPN, String name, String author, int year, int outdated_duration) {
        super(ISPN, name, author, year, outdated_duration, 0.0);
    }

    @Override
    public void ValidateBook(int Quantity, int year) {
        throw new Error("Demo Books are not for sale");
    }

    public double getPrice()
    {
        throw new Error("Demo Books are not For sale");
    }


}
