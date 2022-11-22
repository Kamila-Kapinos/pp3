public class PrimeNums {
    
    public static boolean checkPrime(int num){
        for (double i = 2; i < num; i++){
            if (num%i == 0){
                return false;
            }
        } return true;
    }

    public static int countProduct(int[] arr) {
        int product = 1;
        for (int number : arr) {
            product *= number;
        } return product;
    }

    public static boolean arePrimeFactors(int n, int[] arr) {
        if (countProduct(arr) != n){
            return false;
        }
        for (int number : arr){
            if (!checkPrime(number)){
                return false;
            }
        } return true;
    }

    public static void main(String[] args){
        int[] array = {5, 7};
        System.out.println(PrimeNums.arePrimeFactors(35, array));
    }

}
