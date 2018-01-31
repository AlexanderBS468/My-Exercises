package HomeEdition.java1.lesson5.Animals;

/**
 * Created by AlexBS on 31.01.2018.
 */
public abstract class Animals {
    private String name;
    private int run;
    private double jump;
    private int swim;
    public String type;
    public String str;

    protected Animals(String name, int run, double jump, int swim) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim =  swim;
        type = "Animal";
    }

    @Override
    public String toString() {
        return type + "\t " + name + "\t run  : " + run + "m.,\t\t\t jump  : " + jump + "m\t\t\t swim  : " + swim + "m.";
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public double getJump() {
        return jump;
    }

    public String run(String name, int i) {
        str = "Не умеет бегать";
        return str.toString();
    }

    public String jump(String name, double i) {
        str = "Не умеет прыгать";
        return str.toString();
    }

    public String swim(String name, int i) {
        str = "Не умеет плавать";
        return str.toString();
    }
}
