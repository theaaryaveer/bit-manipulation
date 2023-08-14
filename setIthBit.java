public class setIthBit {
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask; 
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10, 2));

        // 10 = 1010. i=2 means its the second element that's to be set as 1 so we did OR operation on ith element i.e. 2nd element
    }
}
