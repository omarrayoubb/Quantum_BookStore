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


    public void ValidateBook(int Quantity, int year) {
        if (Quantity > this.stock || !checkOutdated(year)) {
            throw new Error("Not Enough Stock");
        }
    }
    public void reduceStock(int Quantity)
    {
        stock -= Quantity;
    }
    public double BuyBook(int Quantity, String email, String Address)
    {
        reduceStock(Quantity);
        double total_price = getTotalPrice(Quantity);
        System.out.println("Sending By Shipping Service at " + Address);
        return total_price;
    }


}
