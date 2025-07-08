public abstract class Book {
    private String ISPN;
    private String name;
    private String author;
    private int year;
    private int outdated_duration;
    private double price;

    public Book(String ISPN, String name, String author, int year, int outdated_duration, double price) {
        this.ISPN = ISPN;
        this.name = name;
        this.author = author;
        this.year = year;
        this.outdated_duration = outdated_duration;
        this.price = price;
    }

    public void setISPN(String ISPN) {
        this.ISPN = ISPN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOutdated_duration(int outdated_duration) {
        this.outdated_duration = outdated_duration;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISPN() {
        return ISPN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getOutdated_duration() {
        return this.outdated_duration;
    }
    public int endDate()
    {
        return this.year + this.outdated_duration;
    }

    public double getPrice() {
        return price;
    }

    public boolean checkOutdated(int year)
    {
        return year > endDate();
    }
    public abstract boolean ValidateBook(int Quantity, int year);

}
