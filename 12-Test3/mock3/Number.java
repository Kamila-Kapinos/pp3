package mock3;

public class Number {

    private int system;
    private String value;

    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }

    public int getSystem() {
        return this.system;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int get10() {
        char[] arr = this.value.toCharArray();
        int suma = 0;
        int power = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= getSystem() + 48) {
                return -1;
            }
            suma += (arr[i] - 48) * Math.pow(getSystem(), power);
            power--;
        }
        return suma;
    }
}
