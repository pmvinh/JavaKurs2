package java4_1;

public enum Season {
    WINTER(-20), SPRING(15), SUMMER(20), AUTUMN(5);
    private double tempereture;

    public void setTempereture(double tempereture) {
        this.tempereture = tempereture;
    }

    public double getTempereture() {
        return tempereture;
    }

    Season(double temperature){
        this.tempereture = temperature;
    }

    public String getDiscription(){
        return "It's cold time now";
    }

    public String getDiscription(Season SUMMER){
        return "It's warm time now";
    }

}
