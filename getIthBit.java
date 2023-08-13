public class getIthBit {
    public static int getithbit(int n, int i){
        int bitmask = 1<<i;

        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
 }
 public static void main(String[] args) {
    System.out.println(getithbit(10, 2));
 }
}


// binary of 10  = 1010 
// its second position from left side starting from 0 is 0