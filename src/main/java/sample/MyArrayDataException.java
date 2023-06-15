package sample;

public class MyArrayDataException extends Exception {
    private int x;
    public int getX() {
        return x;
    }
    private int y;

    public int getY() {
        return y;
    }
    public MyArrayDataException(int x, int y) {
        super("Invalid format of data in cell [" + x + ", " + y + "]");
        this.x = x;
        this.y = y;
    }




}
