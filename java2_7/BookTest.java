package java2_7;

public class BookTest {
    public static void main(String[] args){
        Book b1=new Book("A Tale of Two Cities", "Charles Dickens", 1859);
        Book b2=new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943);
        Book b3=new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);

        b1.setName("A Tale of Two Cities");
        b2.setAuthor("Antoine de Saint-Exupéry");
        b3.setYear(1997);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}