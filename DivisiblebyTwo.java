public class DivisiblebyTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int c = 0;
        for(int i : arr){
            if(i % 2 == 0)
            c ++;
        }
        System.out.println(c);
    }
}
