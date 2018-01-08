package HomeEdition.java1.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AlexBS on 07.01.2018.
 * version  2.3
 */
public class HomeWork2 {

    public static void main (String[] args){
        System.out.println("Java 1 Уровень 1 Урок 2 ДЗ№2 	C ПРОВЕРКОй на ввод ОШИБОК!!!! ver 2.3 RusEdition ");
        System.out.println("Заданиe 1 : Поменять значение местами 0 и 1");
        System.out.println("Заданиe 2 : Массив заполняется значения на 3 больше предыдущего");
        System.out.println("Заданиe 3 : Если у заданного массива значение меньше 6, то значение умножается на 2");
        System.out.println("Заданиe 4 : У массива диагональные значения заменяются 1");
        System.out.println("Заданиe 5 : Заданный массив заполняется рандомными значениями и находится Min и Max");
        System.out.println("Заданиe 6 : Заданный массив заполняется значениями и затем сравнивает левые и правые част");
        System.out.println("Заданиe 7 : В заданном массиве смещает массив на заданное число");
        System.out.print("выберите задание 1-7, любое другое число - выход : ");
        swichingTasks(inputKYB());
        System.out.println( "Программа завершила работу.");
    }
    /**
     * 1. Задать целочисленный массив, состоящий из 0 и 1.
     *    Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]. С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    static void replaceBin(int len) {
        int[] array = new int[len];
        System.out.println("Введенный рандомный массив из 0 / 1 ");
        for (int i = 0; i < len; i++) {
            array[i] = (int) (Math.random()+0.5);
            System.out.println(array[i]);
        }
        System.out.println("Полученный массив");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i] = (array[i] == 1) ? 0 : 1);
        }
    }
    /**
     * 2. Задать пустой целочисленный массив размером 8.
     *    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
     */
    static void fillArray(int len) {
        int[] array = new int[len];
        for (int i = 0, k = 0; i < len; i++, k += 3) {
            System.out.println(array[i] = k);
        }
    }
    /**
     * 3. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом,
     *    и числа меньшие 6 умножить на 2
     */
    static void findLessSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
            System.out.println(array[i]);
        }
    }
    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк
     *    и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     */
    static void fillingDiagonally(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
           array[i][i] = 1;
            array[i][size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(array[i]));
    }
    /**
     * 5. ** Задать одномерный массив и найти в нём минимальный и максимальный элементы
     */
    static void findMinMax(int len) {
        int[] array = new int[len];
        System.out.println("Введенный рандомный массив ");
        for (int i = 0; i < len; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
        int max = array[0], min = max;
        for (int i = 0; i < len; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Max = " + max + " Min = " + min);
    }
    /**
     * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     *    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
     *    Примеры: checkBalance([1, 1, 1, || 2, 1]) →  true,
     *    checkBalance ([2, 1, 1, 2, 1]) → false,
     *    checkBalance ([10, || 10]) → true,
     *    граница показана символами ||, эти символы в массив не входят
     */
    static boolean checkBalance(int[] array) {
        int suml;
        int sumr = 0;
        for (int i = array.length-1; i > 0; i--) {
            suml = 0;
            for (int j = 0; j < i; j++) {
                suml += array[j];
            }
            sumr += array[i];
            if (suml == sumr) return true;
        }
        return false;
    }
    /**
     * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
     *    или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     *    Для усложнения задачи нельзя пользоваться вспомогательными массивами
     */
    static int[] shiftArray(int[] array, int shift) {
        if (array == null || array.length < 2 || shift == 0 || shift % array.length == 0)
            return array;
        shift = shift % array.length; // optimization of the number of shifts
        for (int cnt = 0; cnt < Math.abs(shift); cnt++) {
            if (shift > 0) {
                int tmp = array[array.length - 1];
                for (int i = array.length - 1; i > 0; i--)
                    array[i] = array[i - 1];
                array[0] = tmp;
            }
            if (shift < 0) {
                int tmp = array[0];
                for (int i = 1; i < array.length; i++)
                    array[i - 1] = array[i];
                array[array.length - 1] = tmp;
            }
        }
        return array;
    }
    /**
    * -------------------------------ввод с клавиатуры---------------------------------------
    */
    static String inputKYB() {
        String a;
        Scanner sc = new Scanner(System.in);
        return a = sc.next();
    }
    /**
     * ----------------------------------ввод массива------------------------------------------
     */
    static int[] inputArray(int len) {
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            System.out.print("Введите значение " + i + " элемента массива  = ");
            array[i] = Integer.parseInt(inputKYB());
        }
        return array;
    }
    /**
     *
     * выбор задания
     */
    static void swichingTasks(String i) {
            try {
                int j = Integer.parseInt(i);
                switch (j) {
                    case 1: {
                        System.out.print("Для задания 1 введите размерность массива = ");
                        replaceBin(Integer.parseInt(inputKYB()));
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                    case 2: {
                        fillArray(8);
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                    case 3: {
                        findLessSix();
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                    case 4: {
                        System.out.print("Для задания 4 введите размерность 2х-го квадратного массива = ");
                        fillingDiagonally(Integer.parseInt(inputKYB()));
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                    case 5: {
                        System.out.print("Для задания 5 введите размерность массива = ");
                        findMinMax(Integer.parseInt(inputKYB()));
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                    case 6: {
                        System.out.print("Для задания 6 введите размерность массива = ");
                        System.out.println("checkBalance(array[]) -> " + checkBalance(inputArray(Integer.parseInt(inputKYB()))));
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                    case 7: {
                        System.out.print("Для задания 7 введите размерность массива и значение сдвига = ");
                        System.out.println(Arrays.toString(shiftArray(inputArray(Integer.parseInt(inputKYB())), Integer.parseInt(inputKYB()))));
                        System.out.print("Хотите другое задание?  Введите номер 1-6, другое число - выход : ");
                        swichingTasks(inputKYB());
                        break;
                    }
                }
            }
            catch ( NumberFormatException e ) {
                System.out.println("Требуется целочисленный аргумент");
            }
    }
}
