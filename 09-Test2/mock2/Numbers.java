public class Numbers {

    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;

    Numbers(int first, int second, int third, int fourth, int fifth) {

        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    public int getFirst() {
        return this.first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return this.third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return this.fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFifth() {
        return this.fifth;
    }

    public void setFifth(int fifth) {
        this.fifth = fifth;
    }

    public boolean different() {
        int[] arr = { getFirst(), getSecond(), getThird(), getFourth(), getFifth() };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
            
        }

        return true;
    }

    // public static void main(String[] args){
    // Numbers n1 = new Numbers(3, 4, 2, 1, 6);
    // System.out.println(n1.different());
    // }

}
