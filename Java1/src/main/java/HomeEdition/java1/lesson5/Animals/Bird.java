package HomeEdition.java1.lesson5.Animals;

/**
 * Created by AlexBS on 01.02.2018.
 */
public class Bird extends Animals{
    public Bird(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        type="Птица";
    }
    @Override
    public String run(String name, int i) {
        if (i < 5) return str = "Пробежит";
        return str = "Не пробежит";
    }

    @Override
    public String jump(String name, double i) {
        if (i < 0.2) return str = "Перепрыгнет";
        return str = "Не перепр-ет";
    }

}