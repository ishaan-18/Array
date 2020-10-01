public class SumOfElementsOfArray {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int val : arr1) {
            sum += val;
        }
        System.out.println(sum);
    }
}
