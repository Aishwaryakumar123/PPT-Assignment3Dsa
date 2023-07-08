public class closestSum3 {
    public static void main(String[] args) {
        int []nums={ 1,-4,2,-1};
        int target=1;
        int closum=0;
        /// solution start from here
        int mindiff= Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int p1=i+1; int p2=nums.length-1;
            while(p1<p2){
               // int sum=nums[i]+nums[p1]+nums[p2];
                int sum=nums[i]+nums[p1]+nums[p2];
                if(sum>target){
                    p2--;
                }
                else if(sum<target){
                    p1++;
                }
                else{
                    System.out.println( sum);
                    return;
                }
                int diff=Math.abs(sum-target);
                if(diff<mindiff){
                    mindiff= diff;
                    closum=sum;
                }


            }
        }
        System.out.println(closum);
    }
}
