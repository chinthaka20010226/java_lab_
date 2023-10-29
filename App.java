import java.util.*;

public class App{
    public static void printArray(char[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void takeIntoArray(String str,char[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
    }

    public static char[] createAnArray(String str){
        char[] strArr=new char[str.length()];

        return strArr;
    }

    public static int countLength(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != 32){ //str.charAt(i) != ' '
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=input.nextLine();
        System.out.println("Your name is : "+name);
        
        // with ' '
        System.out.println("No.of charaters in your name : "+name.length());
        //without ' '
        System.out.println("No.of charaters in your name : "+countLength(name));

        char[] strArr=createAnArray(name);

        takeIntoArray(name,strArr);

        printArray(strArr);

    }
}