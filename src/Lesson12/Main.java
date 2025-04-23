package Lesson12;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "x", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };

        try {
            int result = ArrayUtils.sumArray(validArray);
            System.out.println("Сумма значений: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка при обработке массива: " + e.getMessage());
        }

        // Генерация исключения MyArrayDataException
        try {
            ArrayUtils.sumArray(invalidDataArray);
        } catch (Exception e) {
            System.err.println("Ошибка при обработке массива с некорректными данными: " + e.getMessage());
        }

        // Генерация исключения MyArraySizeException
        try {
            ArrayUtils.sumArray(invalidSizeArray);
        } catch (Exception e) {
            System.err.println("Ошибка при обработке массива неправильного размера: " + e.getMessage());
        }

        // Генерация ArrayIndexOutOfBoundsException вручную
        try {
            int[] array = new int[3];
            array[5] = 100; // ошибка
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
