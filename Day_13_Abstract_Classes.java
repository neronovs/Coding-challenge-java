//Write MyBook Class
class MyBook extends Book
{
    int price;
    
    public MyBook(String _title, String _author, int _price) {
        super(_title, _author);
        price = _price;
    }
    
    public void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}
