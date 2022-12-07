package BookSorter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        books.add(new Book("Yaban","Yakup Kadri Karaosmanoğlu",192,1932));
        books.add(new Book("Tutunamayanlar","Oğuz Atay",724,1972));
        books.add(new Book("Huzur","Ahmet Hamdi Tanpınar",383,1948));
        books.add(new Book("Yalnızız","Peyami Safa",343,1951));
        books.add(new Book("Calıkuşu","Reşat Nuri Gültekin",409,1922));

        //Order By Name
        Iterator<Book> itr = books.iterator();
        while(itr.hasNext())
            System.out.println(itr.next().getName());

        TreeSet<Book> books2 = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });
        books2.addAll(books);
        System.out.println("----------------");
        //Order By Page Number
        for(Book element: books2)
            System.out.println(element.getName());

    }
}
