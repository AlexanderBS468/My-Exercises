package HomeEdition.java1.lesson5.Animals;

/**
 * Created by AlexBS on 31.01.2018.
 */
public class Cat extends Animals {

    public Cat(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        type = "Кот   ";
    }
    @Override
    public String run(String name, int i) {
        if (i < 200) str = "Пробежит";
        return str = "Не пробежит";
    }

    @Override
    public String jump(String name, double i) {
        if (i < 2) return str = "Перепрыгнет";
        return str = "Не перепр-ет";
    }

}
