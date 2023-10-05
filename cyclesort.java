import java.util.*;
public class cyclesort{
   
     static void cyclesort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp = arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                }
                else{
                    i++;
                }
            }
        }
    
    public static void main(String args[]){
         
         int [] nums={5,6,3,4,2,1};
     
        cyclesort(nums);
         System.out.println(Arrays.toString(nums));

    }
}