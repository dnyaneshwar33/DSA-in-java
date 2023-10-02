//Linear search-in array
// public class searchingalgo{

//     static int linearsearch(int[] nums ,int target){
//          for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 return i;
//             }
//          }
//          return -1;

//     }
//     public static void main(String args[]){

//         int [] arr ={2,45,76,34,98,65};
//         int x =98;

//         int index =linearsearch(arr,x);
//         if(index == -1){
//             System.out.println("Element not found");
//         }
//         else{
//            System.out.println("Element found at:"+index);
//         }

    
//         }
//     }
//Searching element in 2-D array
// import java.util.*;
// public class searchingalgo{

//     static int[]search2darray(int arr[][],int x){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j]==x){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};
//     }
//        public static void main(String args[]){
//         int nums [][]={
//             {12,23,45},
//             {2,4,6},
//             {11,22,77},
//             {89,98,65,34,45}
//         };
//         int target =3;
//         int[]ans=search2darray(nums,target);
//         System.out.println(Arrays.toString(ans));
        
//     }
    
// }
//Returnning max element from the 2-D array
import java.util.*;
public class searchingalgo{

    static int max(int arr[][]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max= arr[i][j];
                }
            }
        }
        return max;
    }
       public static void main(String args[]){
        int nums [][]={
            {12,23,45},
            {2,4,6},
            {11,22,77},
            {89,98,65,34,45}
        };
      
        int ans=max(nums);
        System.out.println("The max element from the array is:"+ans);
        
    }
    
}








//Linear search-string
//For a single char

// public class searchingalgo{

//     static int searchstring(String str,char x){
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==x){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         String name ="kunal";
//         char target = 'a';

//         int index = searchstring(name,target);
//         if(index==-1){
//             System.out.println("char not found");
//         }
//         else
//           System.out.println("Char found at:"+index);
//     }
// }
