import java.util.*;
public class third{
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,1};
        int n=arr.length;
        int first=-1;
        int sec=-1;
        int third=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                third=sec;
                sec=first;
                first=arr[i];
            }
            else if(arr[i]>sec){
                third=sec;
                sec=arr[i];

            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.print("third largest element is:"+third);
        }
}