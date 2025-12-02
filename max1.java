public class max1 {
    public static void main(String[] args) {
        int max=0;
        int count=0;
        int[] arr={0,1,0,1,1,0,1,1,1,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        
        System.out.print(max);
    }
    
}
