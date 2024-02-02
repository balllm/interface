import java.awt.print.Printable;

public class Main{
    public static void main(String[] args) {
        Book book = new Book("book");
        Magazine magazine = new Magazine("magazine");

        // проверка метода с интерфейса IPrintable
        book.print();
        magazine.print();

        IPrintable[] printable = new IPrintable[10];
        // книги
        printable[0] = new Book("book2");
        printable[1] = new Book("book3");
        printable[2] = new Book("book4");

        // журналы
        printable[3] = new Magazine("magazine2");
        printable[4] = new Magazine("magazine3");
        printable[5] = new Magazine("magazine4");


        // цикл который выводит все значение с printable
        for (int i = 0; i < printable.length; i++) {
            // чтобы отсавшиеся printable у которых нет ничего не выводились в консоль
            if(printable[i] != null) {
                System.out.println(printable[i]);
            }
        }

        // проверка instanceof
        book.printBook(printable);
    }
}