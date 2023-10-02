import java.util.*;

public class Arrayds{
    public static void main(String args[])
    {
        //taking input
        // int nums[]={23,45,66,7};
        // System.out.println(nums[2]);
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
        //dynamic input
        Scanner input = new Scanner(System.in);
        // int nums []=new int[5];
        // System.out.println("Enter the array elements:");
        
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=input.nextInt();
        // }
        //printing array elements
        //1st method-dynamic
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
        //2nd method
        // System.out.println(Arrays.toString(nums));

        //2 D ARRAY
        // int nums [][]={
        //     {2,4,5
        //     },
        //     {6,7,8},
        //     {122,33,55}
        // }
        // System.out.println(nums[1][2]);
        //Taking input dynamically and printing
        // int nums[][]=new int[3][3];
        // System.out.println("Enter the array elements: ");

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //       nums[i][j]=input.nextInt();
        //     }
        // };
        // System.out.println("printing the 2D-array : ");
        //   for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //       System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // };
        
        //Arraylist
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(23);
        nums.add(3);
        nums.add(33);
        System.out.println(nums);
        
        System.out.println(nums.size());
        System.out.println(nums.get(1));
        System.out.println(nums.remove(1));
        System.out.println(nums.size());


        
    }
}