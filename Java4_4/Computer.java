package Java4_4;
import java.util.Arrays;

public class Computer {
    public static void main(String[] args) {
        Processor processor = new Processor(3.7);
        Memory memory = new Memory(4.5, 16);
        Monitor monitor = new Monitor(27, 144);
        ComputerModel[] computerModel = ComputerModel.values();
        System.out.println("All computer models:");
        System.out.println(Arrays.toString(computerModel));
        monitor.turnOn();
        memory.cleaning();
    }
}
