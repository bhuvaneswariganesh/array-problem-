public class anegz {
    public static void main(String[] args) {
        int arr[]={1,4,2,0,3,0,4,6};
        int n=arr.length;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                break;
              }
        int j=i+1;
        while(j<n){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    
}
