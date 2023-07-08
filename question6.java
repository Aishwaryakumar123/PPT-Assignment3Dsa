public class question6 {
    public static void main(String[] args) {
        int []nums={1,2,2};

        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans^= nums[i];
        }
        System.out.println(ans);
        return ;


    }
}
