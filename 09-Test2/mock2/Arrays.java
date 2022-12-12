public class Arrays {

    public static int countNums(int[] arr) {

        int counter = 0;
        for (int el : arr) {
            if (el >= 10 && el <= 99) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean arr(int[] arr1, int[] arr2) {

        if (countNums(arr1) == countNums(arr2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};

        System.out.println(arr(arr1, arr2));

    }

}
