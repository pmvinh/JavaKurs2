package Java4_4;

public class Monitor {
    private int size;
    private int Hz;

    public Monitor(int size, int hz) {
        this.size = size;
        Hz = hz;
    }

    public int getSize() {
        return size;
    }

    public int getHz() {
        return Hz;
    }
    public void turnOn(){
        System.out.println("monitor is on");
    }
}
