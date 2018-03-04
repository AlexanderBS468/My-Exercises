package javaCore.lesson2;

/**
 * Created by AlexBS on 01.03.2018.
 */
public class HomeWork2 {
    static final int SIZE = 4;

    public static void main(String[] args) {
        String[][] data = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "a1"}};
        try {
            System.out.println(calcMatrix(data));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }
    }

    static int calcMatrix(String[][] arr) {
        int sum = 0;
        if (arr.length != 4)
            throw  new MySizeArrayException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MySizeArrayException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(j, i);
                }

            }
        }
        return sum;
    }
}
