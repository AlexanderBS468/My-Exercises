package javaCore.lesson2;

/**
 * Created by AlexBS on 01.03.2018.
 */
public class MyException extends RuntimeException {
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public MyException(String message) {
        super(message);
    }
}
