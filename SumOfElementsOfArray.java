public class SumOfElementsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        System.out.println(sum);
    }
}
