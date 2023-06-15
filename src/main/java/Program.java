import sample.ArrayCounter;
import sample.MyArrayDataException;
import sample.MyArraySizeExeption;

public class Program {
    public static void main(String[] args) throws MyArraySizeExeption, MyArrayDataException {
        ArrayCounter arrayCounter = new ArrayCounter(new String[][] {{"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},{"1", "1", "1", "a"}});
        System.out.println(arrayCounter.isArraySizeValid());
        System.out.print(arrayCounter.sumArray());
    }



}
