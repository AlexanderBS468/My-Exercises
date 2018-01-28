package HomeEdition.java1.lesson4;

/**
 * Created by AlexBS on 28.01.2018.
 */
public class Homework4 {
    private final static byte k = 5;
    private static Employee[] employee = new Employee[5];



    public static void main(String[] args) {
        employee[0] = new Employee("Alex","Proger30","666", 100000,(byte)30);
        employee[1] = new Employee("Ivan","Proger40","999", 100000,(byte)40);
        employee[2] = new Employee("Andrey","Proger50","777", 100000,(byte)50);
        employee[3] = new Employee("Anton","Proger25","888", 100000,(byte)25);
        employee[4] = new Employee("Dmitry","Proger70","555", 100000,(byte)70);
        System.out.println("Вывод до вызова");
        for (int i = 0; i < k; i++) {
            if (employee[i].getAge() >= 45) System.out.println("ФИО: " + employee[i].getFio() + " Возраст: " + employee[i].getAge() + " Зарплата: " + employee[i].getSalary());
        }
        Employee.upsurge(employee);
        System.out.println("Вывод после вызова");
        for (int i = 0; i < k; i++) {
            if (employee[i].getAge() >= 45) System.out.println("ФИО: " + employee[i].getFio() + " Возраст: " + employee[i].getAge() + " Зарплата: " + employee[i].getSalary());
        }
        Employee.calculation(employee);
    }
}