public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else flowerColor = "белый";
    }


    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else country = "Россия";
    }

    public void setCost(double cost) {
        if (cost <= 0){
            cost = 1;
        }
        else { this.cost = cost;
        }
    }
}

