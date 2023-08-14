public class clearIthBit {
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1));

        // 10 = 1010. ith element ie 1 is changed into 0 and final ans is 1000 which is 8 in decimal. 
    }
}
