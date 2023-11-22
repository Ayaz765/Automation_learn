package array_list;

import java.util.HashMap;
import java.util.Map;

public class hashumapu {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> Hm= new HashMap<Integer,String>();
		Hm.put(1,"Ayaz");
		Hm.put(2,"Aayaz");
		Hm.put(3,"Abyaz");
		Hm.put(5,"Aysaz");
		Hm.put(1,"Ayazqwert");
		
		   for(Map.Entry m : Hm.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
			}  
			
	}


