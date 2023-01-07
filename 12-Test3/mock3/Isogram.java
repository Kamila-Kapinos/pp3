package mock3;

public class Isogram {

    public static boolean isogram(String words) {
        char[] letters = words.toCharArray();
        java.util.Arrays.sort(letters);
       
        System.out.println(java.util.Arrays.toString(letters));
        for (int i = 0; i < letters.length-1; i++) {
            if (letters[i] != letters[i + 1] || letters[i] == ' ') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(isogram("my bluE water"));
    }
}
