package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	String synomymn;
	
	public Dictionary(String find)
	{
		Map<String,String> dctnry = new HashMap<String,String>();   
		dctnry.put("van", "box car");   
		dctnry.put("omni", "box car"); 
		dctnry.put("ecco", "box car"); 
		dctnry.put("hatchback", "compact car"); 
		dctnry.put("sedan", "long car"); 
		dctnry.put("suv", "big car"); 
		
		
		for(Map.Entry<String, String> m: dctnry.entrySet()) {
		    if(m.getKey().equals(find)) {
		        System.out.println(m.getKey() + " - " + m.getValue());
		        synomymn = m.getValue();
		    }           
		}
		
		for(Map.Entry<String, String> m: dctnry.entrySet()) {
		    if(m.getValue().equals(synomymn)) {
		        System.out.println("synomymn - " + m.getKey());
		    }           
		}
		
		/*for (String word : dctnry.keySet())
		{
			if(find==word)
			{
				for (String meaning : dctnry.values())
				{
					
					System.out.println("meaning is: " + meaning);
				}		
			} 
		}	*/
	}
	

}
