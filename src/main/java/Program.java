import sample.ArrayCounter;
import sample.MyArrayDataException;
import sample.MyArraySizeException;

public class Program {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        ArrayCounter arrayCounter = new ArrayCounter(new String[][] {{"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1","2", "1"},{"1", "1", "1", "2"}});
        System.out.println(arrayCounter.isArraySizeValid());
        System.out.print(arrayCounter.sumArray());
    }



}
