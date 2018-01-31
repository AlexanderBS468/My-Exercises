package HomeEdition.java1.lesson4;

/**
 * Created by AlexBS on 31.01.2018. ver 2.1
 */
public class Homework4 {
    private final static byte k = 5;
    private static Employee[] employee = new Employee[k];

    /**
     * 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Метод должен принимать в качестве
     *    параметра массив сотрудников. Вывести в main() возраст и зарплату сотрудника до и после вызова метода;
     */
    private static void upsurge(Employee[] employee, byte age, float increment) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() >= age) {
                employee[i].setSalary(increment);
                employee[i].isSalaryCanged = true;
            }
        }
    }
    /**
     * 7. ** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и
     * среднюю зарплату сотрудников, вывести результаты работы в консоль.
     */
    private static float calculationAge(Employee[] employee) {
        int ageAv = 0;
        for (int i = 0; i < employee.length; i++)
            ageAv += employee[i].getAge();
        return ageAv / employee.length;
    }
    private static float calculationSal(Employee[] employee) {
        int salAv = 0;
        for (int i = 0; i < employee.length; i++)
            salAv += employee[i].getSalary();
        return salAv / employee.length;
    }

    public static void main(String[] args) {
        /**
        * 1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
        * 2. Конструктор класса должен заполнять эти поля при создании объекта;
        * 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        */
        Employee emp = new Employee("Alex","Proger30","666", 100000,(byte)30);

        /**
         * 4. Вывести при помощи методов из пункта 3 ФИО и должность.
         */
        System.out.println("*****TASK # 4*****************************************************************************");
        System.out.println("FIO: " + emp.getFio() + ", position: " + emp.getPosition());
        /**
         * 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
         */
        System.out.println("*****TASK # 5*****************************************************************************");
        employee[0] = new Employee("Alex","Proger30","666", 100000,(byte)30);
        employee[1] = new Employee("Ivan","Proger40","999", 100000,(byte)40);
        employee[2] = new Employee("Andrey","Proger50","777", 100000,(byte)50);
        employee[3] = new Employee("Anton","Proger25","888", 100000,(byte)25);
        employee[4] = new Employee("Dmitry","Proger70","555", 100000,(byte)70);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() >= 40) System.out.println(employee[i].getFullInfo());
        }
        System.out.println("*****TASK # 6*****************************************************************************");
        System.out.println("Вывод до вызова");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() >= 45) System.out.println("ФИО: " + employee[i].getFio() + " Возраст: " + employee[i].getAge() + " Зарплата: " + employee[i].getSalary());
        }
        upsurge(employee, (byte)45, 5000.0f);
        System.out.println("Вывод после вызова");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].isSalaryCanged) System.out.println(employee[i].getFullInfo());
        }
        System.out.println("*****TASK # 7*****************************************************************************");
        System.out.println("Средний возраст -> " + calculationAge(employee));
        System.out.println("Средняя зарплата -> " + calculationSal(employee));

    }
}