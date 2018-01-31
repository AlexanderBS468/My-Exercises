package HomeEdition.java1.lesson5.Animals;

/**
 * Created by AlexBS on 31.01.2018.
 */

public class Dog extends Animals{

    public Dog(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        type="Собака";
    }

    @Override
    public String run(String name, int i) {
        if ("Мухтар".equals(name)) {
            if (i < 700) return str = "Пробежит\t";
            return str = "Не пробежит";
        } else if ("Тузик".equals(name)) {
            if (i < 500) return str = "Пробежит\t";
            return str = "Не пробежит";
        } else {
            return str = "Нет данных собаки";
        }
    }

    @Override
    public String jump(String name, double i) {
        if ("Мухтар".equals(name)) {
            if (i < 1.8) return str = "Перепрыгнет";
            return str = "Не перепрыгнет";

        } else if ("Тузик".equals(name)) {
            if (i < 0.5) return str = "Перепрыгнет";
            return str = "Не перепр-ет";

        } else {
            return str = "Нет данных собаки";
        }
    }

    @Override
    public String swim(String name, int i) {
        if ("Мухтар".equals(name)) {
            if (i < 20) return str = "Проплывет";
            return str = "Не проплывет";

        } else if ("Тузик".equals(name)) {
            if (i < 10) return str = "Проплывет ";
            return str = "Не проплывет";

        } else {
            return str = "Нет данных собаки";
        }
    }
}
