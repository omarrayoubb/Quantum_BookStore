public class EBook extends Book{
    String fileType;

    public EBook(String ISPN, String name, String author, int year, int outdated_duration, double price, String fileType) {
        super(ISPN, name, author, year, outdated_duration, price);
        this.fileType = fileType;
    }

    @Override
    public void ValidateBook(int Quantity, int year) {
        if (!checkOutdated(year)) throw new Error("Book is not available");

    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }
    public double BuyBook(int Quantity, String email, String Address)
    {
        double price = getTotalPrice(Quantity);
        System.out.println( Quantity + 'X' +' '+ this.getISPN() + '.' + fileType + " has Sent to Mail Service to " + email);
        return price;
    }



}
