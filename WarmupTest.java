import org.junit.Assert;

import static org.junit.Assert.*;

public class WarmupTest {

    @org.junit.Test
    public void backtrackingSearch() {
    }

    @org.junit.Test
    public void consistentBinSearch() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        Stack myStack = new Stack();
        int x = Warmup.consistentBinSearch(arr1, 6, myStack);
        Assert.assertEquals("Should be 5", x , 5);
    }
//    public static int isConsistent(int[] arr) {
//        double res = (Math.random()*100)-75;
//        if (res > 0){
//            return (int) Math.round(res / 10);
//        }
//        else {
//            return 0;
//        }
//    }
}