public class reversegroup {
    public static void main(String[] args) {
       

    
        int[] arr={12,35,1,10,34,1};
        int n=arr.length;
        int k=3;
        for(int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    
}
