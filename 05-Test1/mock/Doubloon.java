import java.util.Arrays;
public class Doubloon{

    public static boolean isDoubloon(String t){
        char arr[] = t.toLowerCase().toCharArray();
        if(arr.length == 0 || arr.length%2!=0){
            return false;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i+=2){
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                return false;
            }
        }return true;
    }

    public static void main(String[] args){
        System.out.print(Doubloon.isDoubloon("abba"));
    }
}

// public class Doubloon {
//     public static boolean isDoubloon(String s) {
//         // count the number of times each letter appears
//         int[] counts = new int[26];
//         String lower = s.toLowerCase();
//     for (char letter : lower.toCharArray()) {
//         int index = letter - 'a'; 
//         System.out.println(index);
//         counts[index]++;
//         System.out.println(Arrays.toString(counts));
//     }
// // determine whether the given word is a doubloon
//     for (int count : counts) {
//         if (count != 0 && count != 2) {
//             return false;
//         } 
//     }
//     return true;
// }
// public static void main(String[] args) {
//         System.out.println(isDoubloon("Mama"));  // true
//         System.out.println(isDoubloon("Lama"));  // false
// } }