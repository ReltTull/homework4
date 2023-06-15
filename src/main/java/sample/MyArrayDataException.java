package sample;

public class MyArrayDataException extends MyExeption{
    int x;
    int y;
    String message;
    public MyArrayDataException(String message, int x, int y) {
        super(message, x, y);
        this.x = x;
        this.y = y;
        this.message = message;
    }
}
