//Java Program to count the total number of characters in a string
// public class stringdsque{

//     public static void main(String args[]){

//         String name ="Code with me";
//         System.out.println("Length of string is:"+name.length());
      
//         int count =0;

//         for(int i=0;i<name.length();i++){
//             if(name.charAt(i)!=' '){
//                 count++;
//             }
//         }
//         System.out.println("Number of characters in string are:"+count);
//     }
// }

//Java Program to count the total number of vowels and consonants in a string
// public class stringdsque{
//     public static void main(String args[]){
//         String demo ="a Vowels in tHe String";
//         String lower = demo.toLowerCase();
//         System.out.println(lower);
//         int vcount=0;
//         int ccount=0;
//         for(int i=0;i<lower.length();i++){
//             if(lower.charAt(i)=='a'||lower.charAt(i)=='e'||lower.charAt(i)=='i'||lower.charAt(i)=='o'||lower.charAt(i)=='u'){
//                 vcount++;
//             }
//             else if(lower.charAt(i)>'a' && lower.charAt(i)<'z'){
//                  ccount++;
//             }
//         }
//          System.out.println("Vowels in the string are:" +vcount);
       
//          System.out.println("Consonants in the string are:"+ccount);
//     }
// }

//REVERSE THE STRING
// public class stringdsque{
//     public static void main(String args[]){
//         String original = "examples";
//         String reverse="";
//         int len = original.length();

//         for(int i=len-1;i>=0;i--){
//             reverse=reverse+original.charAt(i);
//         }
//         System.out.println("The original string is:"+original);
//         System.out.println("The reversed string is:"+reverse);
//     }
// }

//Java Program to determine whether a given string is palindrome

// public class stringdsque{
//     public static void main(String args[]){
//         String original = "madam";
//         String reverse="";
//         int len = original.length();

//         for(int i=len-1;i>=0;i--){
//             reverse=reverse+original.charAt(i);
//         }

//         if(original.equals(reverse)){
//             System.out.println("String is palindrome");
//         }
//         else{
//             System.out.println("String is not  palindrome");

//         }
//     }
// }
//Java program to find the duplicate characters in a string
public class stringdsque {    
     public static void main(String[] args) {    
        String string1 = "Great responsibility";    
        int count;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
    }    
}     
