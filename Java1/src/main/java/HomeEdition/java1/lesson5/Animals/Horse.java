package HomeEdition.java1.lesson5.Animals;

/**
 * Created by AlexBS on 01.02.2018.
 */
public class Horse extends Animals{

    public Horse(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        type="Лошадь";
    }
    @Override
    public String run(String name, int i) {
        if (i < 1500) return str = "Пробежит\t";
        return str = "Не пробежит";
    }

    @Override
    public String jump(String name, double i) {
        if (i < 3) return str = "Перепрыгнет";
        return str = "Не перепр-ет";
    }

    @Override
    public String swim(String name, int i) {
        if (i < 100) return str = "Проплывет";
        return str = "Не проплывет";
    }
}
