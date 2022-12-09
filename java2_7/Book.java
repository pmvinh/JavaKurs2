package java2_7;

public class Book {
    private String name;
    private String author;
    private int year;

//    public Book(){}

    public Book(String name, String author, int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }

    // Сеттеры
    public void setAuthor(String author) { this.author = author; }
    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }

    // Геттеры
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public String toString(){
        return String.format("Book \"%s\" was written by the author %s in %d year", name, author, year);
    }
}