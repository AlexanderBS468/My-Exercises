package HomeEdition.java1.lesson4;

/**
 * Created by AlexBS on 31.01.2018. ver 2.1
 */
public class Employee {
    private String fio;
    private String position;
    private String telephone;
    private float salary;
    private byte age;
    boolean isSalaryCanged;

    Employee(String fio, String position, String telephone, float salary, byte age) {
        this.fio = fio;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary += salary;
    }

    public byte getAge() {
        return age;
    }

    String getFullInfo() {
        return  this.getFio() + " years old " +
                this.getAge() + ", " +
                this.getTelephone() + " Phone number: " +
                this.getTelephone() + " Salary: " +
                this.getSalary() + "$";
    }
}
