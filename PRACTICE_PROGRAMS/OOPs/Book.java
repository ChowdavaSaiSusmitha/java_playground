package basics;

public class Book {
  int bookId;
  String bookName;
  String author;
  int price;
   
  
  public int getBookId() {
    return bookId;
  }
  public void setBookId(int bookId) {
    this.bookId = bookId;
  }
  public String getBookName() {
    return bookName;
  }
  public void setBookName(String bookName) {
    this.bookName = bookName;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public static void main(String[] args) {
    Book b = new Book();
    String s=  b.getBookName();
    System.out.println("bookname is:" + s);
  }
}
