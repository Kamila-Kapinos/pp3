public class BasicStatistic {
    
    public static double itemsNumInRange(int start, int end){
        
        int counter = 0;
        int i = start;
        while (i < end) {
            i++;
            counter++;
            }
        return counter;
    }

    public static double calculateSum(int start, int end){

        int counter = 0;
        for(int i = start; i <= end; i++){
           counter += i;
        }
        
        return counter;
    }

    public static double calculateAvg(int start, int end){

        return Math.round(calculateSum(start, end)/itemsNumInRange(start, end));

    }

    public static void main(String[] args){

        System.out.println(itemsNumInRange(5, 10));
        System.out.println(calculateSum(5, 10));
        System.out.println(calculateAvg(5, 10));
    }

}



