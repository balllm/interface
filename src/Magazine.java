import java.awt.print.Printable;

public class Magazine implements IPrintable{

    private String title;
    public Magazine(String title){
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
        return "Magazine: " + title;
    }
}
