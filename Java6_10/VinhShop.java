package Java6_10;

public interface VinhShop {
    Computer searchComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads);
    void delComputer(String name);
    int addComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads);
}
