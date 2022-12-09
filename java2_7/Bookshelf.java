package java2_7;

public class Bookshelf {
    private int numOfBooks;
    private Book[] books;

    public Bookshelf(String[] authors, String[] names, int[] years){
        numOfBooks=names.length;
        books=new Book[numOfBooks];
        for(int i=0;i<numOfBooks;++i)
            books[i]=new Book(authors[i], names[i], years[i]);
    }

    public Book getNewestBook(){
        int max=0;
        Book newestBook=null;
        for(Book i : books){
            if(i.getYear()>max){
                max=i.getYear();
                newestBook=i;
            }
        }
        return newestBook;
    }

    public Book getOldestBook(){
        int min=9999;
        Book oldestBook=null;
        for(Book i : books){
            if(i.getYear()<min){
                min=i.getYear();
                oldestBook=i;
            }
        }
        return oldestBook;
    }
    public static void sortBooksByYear(Bookshelf bs){
        boolean swapd=true;
        while(swapd){
            swapd=false;
            for(int i=0;i<bs.numOfBooks-1;++i){
                if(bs.books[i].getYear()>bs.books[i+1].getYear()){
                    Book tmp=bs.books[i];
                    bs.books[i]=bs.books[i+1];
                    bs.books[i+1]=tmp;
                    swapd=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] names={"A Tale of Two Cities", "The Little Prince", "Harry Potter and the Philosopher's Stone"};
        String[] authors={"Charles Dickens", "Antoine de Saint-Exupéry", "J. K. Rowling"};
        int[] years={1859, 1943, 1997};
        Bookshelf bookshelf=new Bookshelf(names, authors, years);
        System.out.println(bookshelf.getOldestBook());
        System.out.println(bookshelf.getNewestBook());
        System.out.println();
        sortBooksByYear(bookshelf);
        for(Book i : bookshelf.books){
            System.out.println(i);
        }
    }
}