// public class binarysearchalgo{
//     static int binarysearch(int []arr,int key){
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid = start+(end-start)/2;

//             if(arr[mid]>key){
//                 end=mid-1;

//             }
//             else if(arr[mid]<key){
//                 start=mid+1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
//     public static void main(String []args){
//         int nums[]={2,5,7,8,9,12,44,56,78};
//         int target = 1;

//         int ans = binarysearch(nums,target);
//         if(ans==-1){
//           System.out.println("The element:"+target +" not found");
          
//         }
//         else
//         System.out.println("The element:"+target +" Found at index:"+ans);

//     }
// }

//Using inbuilt function
// import java.util.*;
// public class binarysearchalgo{
//     public static void main(String args[]){

//         int arr[]={12,45,65,12,44};
//         int key =5;

//         int res =Arrays.linearSearch(arr,key);
//         if(res<0){
//             System.out.println("Element not found");
//         }
//         else
//         System.out.println("Element found at:"+res);
//     }
// }

//Binary search in 2-D matrix
import java.util.*;
public class binarysearchalgo{
    static int[] MatrixSearch(int [][]matrix,int target){
        int row = 0;
        int col =matrix.length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
      return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int nums[][]={
            {10,20,30,40},
            {15,21,32,44},
            {17,27,39,44}
        };
        int key=27;
        System.out.println(Arrays.toString(MatrixSearch(nums,key)));

    }
}