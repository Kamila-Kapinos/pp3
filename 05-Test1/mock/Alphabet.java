import java.util.Arrays;
public class Alphabet {
   public static boolean isAlphabet(String t){
      char arr[] = t.toCharArray();
      Arrays.sort(arr);
      String t2 = "";
      for(int i = 0; i < arr.length; i++){
         t2+=arr[i];
      }
      return t2.equals(t);
   } 
   public static void main(String[] args){
      System.out.println(Alphabet.isAlphabet("abcmhsw"));
   }
}
