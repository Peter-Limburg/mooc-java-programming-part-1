
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {

        int i = 0;
        int sum = 0;
        while (i < array.length) {
            int numbers = array[i];
            sum += numbers;
            i++;
        }
        return sum;
    }
}
