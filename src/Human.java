import java.time.LocalDate;

public class Human {
    int dateOfBirth;
    String name;
    String city;
    String position;


    public Human(int dateOfBirth, String name, String city, String position) {
        if (dateOfBirth > 0) {
            this.dateOfBirth = LocalDate.now().getYear() - dateOfBirth;
        } else {
            this.dateOfBirth = 0;
        }
        if (name == null) {
            this.name = " 'Информация не указана'";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = " 'Информация не указана'";
        } else {
            this.city = city;
        }
        if (position == null) {
            this.position = " 'Информация не указана'";
        } else {
            this.position = position;
        }
    }

    public Human() {

        this.dateOfBirth = 0;
        this.name = " 'Информация не указана'";
        this.city = " 'Информация не указана'";
        this.position = " 'Информация не указана'";
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + (LocalDate.now().getYear() - dateOfBirth) + " году. " +
                "Я работаю на должности " + position + ". Будем знакомы!";
    }

    public static void main(String[] args) {

        Human first = new Human(LocalDate.now().getYear() - 35, "Максим", "Минск", "Бренд-менеджер");
        Human second = new Human(LocalDate.now().getYear() - 29, "Аня", "Москва", "Методист образовательных программ");
        Human third = new Human(LocalDate.now().getYear() - 28, "Катя", "Калининград", "Продакт-менеджер");
        Human fours = new Human(LocalDate.now().getYear() - 27, "Артем", "Москва", "Директор по развитию бизнеса");
        Human five = new Human();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fours);
        System.out.println(five);
    }
}

