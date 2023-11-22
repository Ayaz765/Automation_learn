package string_programs;

public class Remove_White_speaces

	

{   
    public static void main(String[] args) {    
            
        String str1="Remove white spaces                       ljjjjjjjj             kkk";    
            
        //Removes the white spaces using regex  
        
      //  str1 = str1.replaceAll("\\s+", ""); 
        
        str1=str1.replaceAll(" ", "");
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}    
