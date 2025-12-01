public class plusone {
    public static void main(String[] args) {
        int[] arr={9,9,9};
        int whole=0;
        for(int i=0;i<arr.length;i++){
            int digit=arr[i];
            whole=whole*10+digit;
        }
        whole+=1;
        System.out.println(whole);
    }
    
}
