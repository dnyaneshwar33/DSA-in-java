import java.util.*;
public class selectionsort{
    static void selection(int arr[]){
          
            for(int i=0;i<arr.length-1;i++){
                  int small_index =i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[small_index]){
                        small_index=j;

                    }

                    int temp=arr[small_index];
                    arr[small_index]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    public static void main(String args[]){
        int nums[]={23,56,87,234,54};
        System.out.println("given arrays is:"+Arrays.toString(nums));
        selection(nums);
        System.out.println("given arrays is:"+Arrays.toString(nums));

        
    }
}