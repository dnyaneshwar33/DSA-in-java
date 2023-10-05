import java.util.*;
public class insertionsort{
    static void insertion(int arr[]){
        for(int i=0;i<arr.length -1;i++){
            for(int j=i+1;j>0;j--){//j loops run previously to check in sorted arrays where key lies
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
  
    
    public static void main(String args[]){
         
         int [] nums={5,6,23,2,1};
         insertion(nums);

         System.out.println(Arrays.toString(nums));

    }
}
