import java.time.LocalDate;

public class Flower {

    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor == null && flowerColor.isEmpty() && flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;

        if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String GetFlowerName() {
        return flowerName;
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
        if (flowerColor == null && flowerColor.isEmpty() && flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else flowerColor = flowerColor;
    }


    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else country = "Россия";
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public void printInfo() {
        System.out.println("Название: " + flowerName + ". Цвет: " + flowerColor + ". Страна: " + country + " Стоимость: "
                + cost + " Срок стояния: " + lifeSpan);
    }
}

class FlowerTest {
    public static void main(String[] args) {

        Flower first = new Flower("Роза обыкновенная", null, "Голландия", 35.00, 0);

//        System.out.println(first.getFlowerColor());

first.printInfo();
    }


}
