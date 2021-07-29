package Day04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("태백 산맥 ", "조정래");

        ArrayList<Book> lb =new ArrayList<>();

        lb.add(new Book("데미안", "헤르만 헤세"));

       /* for (int i = 0; i < library.size(); i++) {
            Book book =lb.get(i);
            System.out.println(book.title);
            
        }*/
        for (Book b : lb) {
            System.out.println(b.title + "");
            System.out.println(b.author);
            System.out.println();
            
        }
    }
}
