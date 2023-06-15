package sample;

public class ArrayCounter {
    String[][] array;
    private final int size = 4;

    public ArrayCounter(String[][] arr) {
        this.array = arr;
    }

    public int sumArray() throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Not a number in coordinates: ", i, j);
                }
            }
        }
        return sum;
    }

    public boolean isArraySizeValid() throws MyArraySizeExeption {
        if (array.length != size) {
            throw new MyArraySizeExeption();
        }
        for (String[] r : array) {
            if (r.length != size) {
                throw new MyArraySizeExeption();
            }
        }
        return true;
    }
}
