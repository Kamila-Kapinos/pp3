public class MyArrays {
    public static int even(int[] array){
        int counter = 0;
        for(int i : array){
            if(i%2==0){
                counter++;
            }
        }
        return counter;
    }
    
    public static int positiveOdd(int[] array){
        int counter = 0;
        for(int i : array){
            if(i%2!=0 && i > 0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        int[] array = {3,2,-5,4,1,-7};
        System.out.println(MyArrays.positiveOdd(array));
    }
}
