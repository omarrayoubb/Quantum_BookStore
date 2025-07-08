public class EBook extends Book{
    String fileType;
    public EBook(String ISPN, String name, String author, int year, int outdated_duration, double price, String fileType) {
        super(ISPN, name, author, year, outdated_duration, price);
        this.fileType = fileType;
    }

    @Override
    public boolean ValidateBook(int Quantity, int year) {
        if (!checkOutdated(year)) throw new Error("Book is not available");
        return true;

    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }
}
