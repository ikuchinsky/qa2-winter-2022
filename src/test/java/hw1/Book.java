package hw1;

public class Book {
    private String author;
    private String nameOfBook;
    private long quantityOfPaper;
    private String material;
    private String quality;

    //-------------GETTERS/SETTERS-----------


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public long getQuantityOfPaper() {
        return quantityOfPaper;
    }

    public void setQuantityOfPaper(long quantityOfPaper) {
        this.quantityOfPaper = quantityOfPaper;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
