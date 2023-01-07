package mock3;

public class Numbers implements Ok {
    private int[] nums;

    public Numbers(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return this.nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    @Override
    public boolean ok() {

        for (int i = 0; i < getNums().length; i++) {
            if (i % 2 == 0 && getNums()[i] % 2 == 0) {
                continue;
            } else if (i % 2 != 0 && getNums()[i] % 2 != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
