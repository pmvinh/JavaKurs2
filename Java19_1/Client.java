package Java19_1;

public class Client {
    private String name;
    private int inn;
    {
        this.name = "Vinh";
        this.inn = 123;
    }

    public String getName() {
        return name;
    }

    public int getInn() {
        return inn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }
}