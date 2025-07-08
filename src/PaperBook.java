public class PaperBook extends Book{
    private int stock;
    public PaperBook(String ISPN, String name, String author, int year, int stock, int outdated_duration, double price) {
        super(ISPN, name, author, year, outdated_duration, price);
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }


    public boolean ValidateBook(int Quantity, int year) {
        if (Quantity > this.stock || !checkOutdated(year)) {
            throw new Error("Not Enough Stock");
        }
        return true;
    }

}
