public class ArrayMy {
    public static int odd(int[] array){
        int counter =  0;
        for(int el : array){
            if(el%2!=0 && el>0){
                counter ++;
            }
        } 
        return counter;
    }

    public static int above(int[] array){
        int suma = 0;
        double avg = 0;
        int counter = 0;
        for(int el : array){
            suma += el;
        }

        avg = suma/(double)array.length;

        for(int num : array){
            if(num > avg){
                counter += num;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        int [] a = {};
        System.out.println(ArrayMy.odd(a));
    }

    
}
