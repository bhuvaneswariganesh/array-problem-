public class three {
    public static void main(String[] args){
        int[] arr={1,-4,3,-6,7,0};
        int n=arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]>max1){
            max3=max2;
            max2=max1;
            max1=arr[i];
           }
           else if(arr[i]>max2){
            max3=max2;
            max2=arr[i];
           }
           else if(arr[i]>max3){
            max3=arr[i];
           }
           if(arr[i]<min1){
            min2=min1;
            min1=arr[i];
           }
           else if(arr[i]<min2){
            min2=arr[i];
           }
        }
       int pro1=max1*max2*max3;
       int pro2=max1*min1*min2;
       int result=Math.max(pro1,pro2);
       System.out.println(result);
    }
    
}
