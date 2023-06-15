package sample;

public class ArrayCounter {
    String[][] array;

    public ArrayCounter(String[][] arr) {
        this.array = arr;
    }

    /**
     * Проход двойным циклом с преобразованием каждой строки в int и суммированием с sum.
     * @return sum, сумму всех преобразованных элементов
     * @throws MyArrayDataException
     */
    public int sumArray() throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    /**
     * проверка длины массива и проверка длины каждого подмассива. Если какой-то элемента не равен "4", пробрасывается
     * исключение MyArraySizeException
     * @return true, если все длины равны 4
     * @throws MyArraySizeException
     */
    public boolean isArraySizeValid() throws MyArraySizeException {
        int size = 4;
        if (array.length != size) {
            throw new MyArraySizeException();
        }
        for (String[] r : array) {
            if (r.length != size) {
                throw new MyArraySizeException();
            }
        }
        return true;
    }
}
