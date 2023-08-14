public class updateIthBit {
    public static int updateithbit(int n, int i, int newBit){

        int bitmask = 1<<i;
        return (n & ~(bitmask) | (newBit<<i)&bitmask);
   

    }
    public static void main(String[] args) {
        System.out.println(updateithbit(10, 2, 1));
    }
}