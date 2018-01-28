package HomeEdition.java1.lesson4;

/**
 * Created by AlexBS on 28.01.2018.
 */
public class Employee {
    private String fio;
    private String position;
    private String telephone;
    private int salary;
    private byte age;

    Employee(String fio, String position, String telephone, int salary, byte age) {
        this.fio = fio;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public static void upsurge(Employee[] object) {
        for (int i = 0; i < 5; i++) {
            if (object[i].getAge() >= 45) object[i].setSalary(7000);
        }
    }

    public static void calculation(Employee[] object) {
        int ageAv = 0;
        int salAv = 0;
        for (int i = 0; i < 5; i++) {
            ageAv += object[i].getAge();
            salAv += object[i].getSalary();
        }
        System.out.println("Средний возраст -> " + (ageAv /= 5));
        System.out.println("Средняя зарплата -> " + (salAv /= 5));
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary += salary;
    }

    public byte getAge() {
        return age;
    }
}
