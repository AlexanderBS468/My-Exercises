package HomeEdition.java1.lesson1;

/**
 * Created by AlexBS on 06.01.2018.
 */
public class Main {

    /**
     * 1 Создать пустой проект в IntelliJ IDEA и прописать метод main();
     */
    public static void main (String[] args){
        createVarible();
        System.out.println("Task #3 : " + calculate(1, 2, 3, 4));
        System.out.println("Task #4 : " + checkSum(10, 5));
        System.out.print("Task #5 : "); checkNum(10);
        System.out.print("Task #5 : "); checkNum(-10);
        System.out.println("Task #6 : " + сheckNegative(10));
        System.out.println("Task #6 : " + сheckNegative(-10));
        System.out.print("Task #7 : "); welcomeName("Alex");
        System.out.print("Task N7 : "); checkLeapYear(2018);
    }

    /**
     * 2. Создать переменные byte, short, int, long, float, double, char, boolean
     */
    static  void createVarible() {
        byte pByte = 127;
        short pShort = 32767;
        int pInt = 2147483647;
        long pLong = 9223372036854775807L;
        float pFloat = 120.0f;
        double pDouble =  15.72775;
        char pChar = 'A';
        boolean pBoolean = true;
        String pString = "String";
    }

    /**
     * 3. Написать метод вычисляющий выражение  a * (b + (c / d)) и возвращающий результат,
     *    где a, b, c, d – входные параметры этого метода
     */
    static int calculate(int a, int b, int c, int d){
        if (d == 0) return 0;
        return a * (b + (c / d));
    }

    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма
     *    лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     *    в противном случае – false
     */
    static boolean checkSum(int a, int b) {
        return  ((a + b >= 10) && (a + b <= 20));
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число, метод
     *    должен напечатать в консоль положительное ли число передали, или отрицательное.
     *    Замечание: ноль считаем положительным числом
     */
    static void checkNum(int a) {
        if (a < 0) System.out.println(a + " is Negitive");
        else System.out.println(a + " is a Positive");
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число,
     *    метод должен вернуть true, если число отрицательное
     */
    static boolean сheckNegative(int a) {
        if (a < 0) return true;
        return false;
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка,
     *    обозначающая имя, метод должен вывести в консоль сообщение
     *    «Привет, указанное_имя!»
     */
    public static void welcomeName(String name) {
        System.out.println("Hello, " + name + "!");
    }
    /**
     * 8* Написать метод, который определяет является ли год високосным, и выводит
     *    сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
     *    при этом каждый 400-й – високосный.
     */
    static void checkLeapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            System.out.println(y + " year is a leap");
        else
            System.out.println(y + " year isn't a leap");
    }
}

