import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


// ---> find list of files / directories in specific path

// public class Example{
//     public static void main(String args[]){
//         File f1=new File("c:/users/user/documents");
//         String[] arr;
//         arr=f1.list();

//         // for(int i=0;i<arr.length;i++){
//         //     System.out.println(arr[i]);
//         // }

//         for(String s:arr){
//             System.out.println(s);
//         }
//     }
// }



// ---> find specific file name in folder

// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);

//         File f1=new File("c:/users/user/documents/");
//         String[] arr;

//         if(f1.exists()){
//             System.out.println("path is correct");
//         }
//         else{
//             System.out.println("path is incorrect");
//             return;
//         }

//         arr=f1.list();

//         System.out.println("Enter the extension : ");
//         String extension=input.nextLine();
//         for(String s:arr){
//             if(s.endsWith(extension.toLowerCase())){
//                 System.out.println(s);
//             }
//         }
//     }
// }



// ---> reads the file content

// class Example{
//     public static void main(String args[]){
//         try{
//             FileReader f=new FileReader("D:/UOM/L2_S1/OOP/input_output_handling/next_.txt/");
//             BufferedReader bf=new BufferedReader(f);
//             // String s1=bf.readLine();
//             // System.out.println(s1);
//             // String s2=bf.readLine();
//             // System.out.println(s2);

//             String s=bf.readLine();
//             while(s != null){
//                 System.out.println(s);
//                 s=bf.readLine();
//             }
//         }
//         catch(FileNotFoundException e){
//             System.out.println("File does not found");
//         }
//         catch(IOException e){
//             System.out.println("The file is not readable");
//         }

//         // for all Exception Handeling,
//         // catch(Exception e){      
//         //     System.out.println("File does not exists");
//         // }

//     }
// }






// ---> ArrayList


public class Example{
    public static void main(String args[]){
        List<String> arr=new ArrayList<String>();
        
        try{
            FileReader fr=new FileReader("D:/UOM/L2_S1/OOP/input_output_handling/next_.txt");
            BufferedReader fb=new BufferedReader(fr);

            String str;
            str=fb.readLine();
            while(str != null){
                arr.add(str);
                str=fb.readLine();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File does not found");
            return;
        }
        catch(IOException e){
            System.out.println("File is not readable");
        }

        // for(String s:arr){
        //     System.out.println(s);
        // }

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}