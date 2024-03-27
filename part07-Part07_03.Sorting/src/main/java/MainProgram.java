
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){

        int smallest = array[0];

        for (int j : array) {
            if (j < smallest) {
                smallest = j;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i; // Update smallest if a smaller value is found
            }
        }
        return smallestIndex;
    }


    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int smallestInd = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[smallestInd]) {
                smallestInd = i; // Update smallest index if a smaller value is found
            }
        }
        return smallestInd;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {

        swap(array, 0, indexOfSmallest(array));
        for (int i = 1; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
