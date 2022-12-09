package java4_2;

public class WomanClothes extends Clothes {
    public WomanClothes(Studio sizeClothing, int priceClothing, String colorClothing, String name) {
        super(sizeClothing, priceClothing, colorClothing, name);
    }

    @Override
    public String go(){
        return "woman wears " + getName() + "\n";
    }

}
