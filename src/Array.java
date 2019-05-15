public class Array {
    public static void main(String[] args) {

        int[] myList = {12, 54, 3, 76, 100, 34, 54, 6, 124};

        int sum = 0;
        for (int e: myList) {
            sum = sum + e;
        }
        System.out.println(sum);
    }

}
