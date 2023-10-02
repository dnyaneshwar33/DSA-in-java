// //swapping values in array
// import java.util.*;
// public class Arraydsque{
//     static void swap(int[]arr,int index1,int index2){
//             int temp = arr[index1];
//             arr[index1]=arr[index2];
//             arr[index2]=temp;
//             System.out.println(Arrays.toString(arr));

//     }
//     public static void main(String [] args){

//         int nums[]={1,4,5,6,7,3};
//         System.out.println(Arrays.toString(nums));

//         swap(nums,1,3);
        
//         //    {
//         //     int temp = nums[1];
//         //     nums[1]=nums[3];
//         //     nums[3]=temp;
//         //     }
        
//         // System.out.println(Arrays.toString(nums));

        

//     }
// }

//FINDING MAX ELEMENT OF ARRAY
// import java.util.*;

// public class Arraydsque{
//     public static void main(String args[]){
//         int nums[] = {1,2,993,45,44};
      
//         System.out.println(Arrays.toString(nums));
//         int max =0;

//         for(int i=0;i<nums.length;i++){

//             if(nums[i]>max){
//                 max=nums[i];
//             }

//         }
//         System.out.println("maximum elementfrom the array is:" +max);
//     }
// }

//REVERSING THE ARRAY
// import java.util.*;
// public class Arraydsque{
//    static void reverse(Integer a[])
//     {
//         Collections.reverse(Arrays.asList(a));
//         System.out.println(Arrays.asList(a));
//     }
//     public static void main(String args[]){
//         Integer nums[] ={3,5,8,2,5,78,33,22};
//        reverse(nums);
       

//     }
// }
 
 //METHOD 2**
// import java.util.*;
// public class Arraydsque{
//     public static void main(String args[]){
//         int nums[]={1,44,65,22,78,433};
//         System.out.println("Array before swapping:"+Arrays.toString(nums));

//         for(int i=nums.length-1;i>=0;i--){
//             System.out.print(nums[i]+" ");
            
//         }
        
//     }
// }

//COPY ELEMENT OF ONE ARRAY INTO OTHER
// import java.util.*;

// public class Arraydsque{
//     public static void main(String args[]){
//         int []arr1 ={2,6,7,3,2,66,99,34,56};
//          System.out.println("Original array:" + Arrays.toString(arr1));


//         int []arr2 = new int[arr1.length];
//         for(int i=0;i<arr1.length;i++){
           
//                 arr2[i]=arr1[i];
            
//         }

//      System.out.println("Copied array:"+Arrays.toString(arr2));
//     }
// }

//Print the duplicate elements from the array
// public class Arraydsque{
//     public static void main(String args[]){
//         int[]values ={12,45,23,99,43,12,45,99,78,33};

//         for(int i=0;i<values.length;i++){
//             for(int j=i+1;j<values.length;j++){
//                 if(values[i]==values[j]){
//                     System.out.println("The duplicate element found at index "+ i +" and "+j+" is:"+values[i]);
//                 }
//             }
//         }
//     }

// }

//Find second smallest number in array
// import java.util.*;
// public class Arraydsque{
//     public static void main(String args[]){
//         int nums[]={1,46,22,87,23,76,98};
//         Arrays.sort(nums);
//         System.out.println("Second smallest element is: "+nums[1]);


//     }
// }

//Find second largest element in array
// import java.util.*;
// public class Arraydsque{
//     public static void main(String args[]){
//         Integer nums[]={1,46,22,87,23,76,98};
//         Arrays.sort(nums,Collections.reverseOrder());
//         System.out.println("Second smallest element is: "+nums[1]);


//     }
// }

//Sorting elements without method-Ascending
// import java.util.*;
// public class Arraydsque{
//     public static void main(String args[]){
//         int nums[]={1,46,22,87,23,76,98};
//         System.out.println("Array before sorting:"+Arrays.toString(nums));


//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
                
//                 if(nums[i]>nums[j]){
//                     int temp=nums[i];
//                     nums[i]=nums[j];
//                     nums[j]=temp;
//                 }
//             }
//         }
//         System.out.println("Array after sorting:"+Arrays.toString(nums));


//     }
// }

//Odd and even elements from the array
import java.util.*;
public class Arraydsque{
    public static void main(String args[]){
        int nums[]={1,46,22,87,23,76,98};
        System.out.print("Even elements from array are:");
        for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            System.out.print(nums[i]+" ");
        }
        }
        System.out.println();
        System.out.print("Odd elements from array are:");
        for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0){
            System.out.print(nums[i]+" ");
        }
        }


    }
}
