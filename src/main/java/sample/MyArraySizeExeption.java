package sample;

public class MyArraySizeExeption extends ArrayIndexOutOfBoundsException{
    public MyArraySizeExeption() {
        super("Array size is not 4 x 4!");
    }
}
