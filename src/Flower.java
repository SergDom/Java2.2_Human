import java.time.LocalDate;

public class Flower {

    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else this.flowerColor = flowerColor;

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else this.country = "Россия";

        this.cost = cost;

        if (lifeSpan <= 0) {
            this.lifeSpan = Math.abs(3);
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
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
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else this.country = "Россия";
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = Math.abs(3);
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }


    }


    @Override
    public String toString() {
        return "Название: " + flowerName + ". Цвет: " + flowerColor + ". Страна: " + country + " Стоимость: "
                + cost + " Срок стояния: " + lifeSpan;
    }
}

class FlowerTest {
    public static void main(String[] args) {

        Flower first = new Flower("Роза обыкновенная", null, "Голландия", 35.00, -1);
        Flower second = new Flower("Хризантема", null, null, 15.00, 5);
        Flower third = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower fours = new Flower("Гипсофила", null, "Турция", 19.50, 10);


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fours);
    }


}
