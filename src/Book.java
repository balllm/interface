import java.awt.print.Printable;

public class Book implements IPrintable{
    private String title;
    public Book(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Это раздел с " + title);
    }

    @Override
    public String toString() {
        return "Book: " + title;
    }

    public void printBook(IPrintable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Book){
                System.out.println("Только книги: " + printable[i]);
            }
        }
    }

}
