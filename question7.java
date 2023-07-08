
import java.util.*;
public class question7 {
    public static void main(String[] args) {
        int []nums={0,1,2,4,5,7};
        List<String> result = new ArrayList<>();
        int a = 0;
        int b = 0;
        while (b < nums.length) {
            while (b<nums.length - 1 && nums[b]+1== nums[b+1]) {
                b++;
            }
            if (a == b) {
                result.add(""+nums[a]);
            } else {
                result.add(nums[a] + "->" + nums[b]);
            }
            a = b + 1;
            b++;
        }
        System.out.println(result);
        return;
    }
}
