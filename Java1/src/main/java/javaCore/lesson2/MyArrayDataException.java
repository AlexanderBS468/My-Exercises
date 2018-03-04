package javaCore.lesson2;

/**
 * Created by AlexBS on 02.03.2018.
 */
public class MyArrayDataException extends MyException{
    private int col;
    private int row;

    public MyArrayDataException(int col, int row) {
        super("Incorrect date in " + col + ":" + row);
        this.col = col;
        this.row = row;
    }
}
