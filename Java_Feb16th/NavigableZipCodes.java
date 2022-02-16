package Collections;


import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableZipCodes {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> zip_codes=new TreeMap<>();
		NavigableMap<Integer,String> zip_codes1=new TreeMap<>();
		NavigableMap<Integer,String> zip_codes2=new TreeMap<>();
		
		System.out.println("District Zip codes lists in Andhra Pradesh :  ");
		
		zip_codes.put(534201, "West Godavari");
		zip_codes.put(522601, "Guntur");
		zip_codes.put(517001, "Chittoor");
		zip_codes.put(515001, "Anantapur");
		zip_codes.put(516001, "Kadapa");
		zip_codes.put(521301, "Krishna");
		zip_codes.put(523001, "Prakasam");
		zip_codes.put(533101, "East Godavari");
		
		System.out.println("Ascending order : "); 
		System.out.println(zip_codes); 
		//By default returns ascending order of maps
		
		System.out.println("Descending order : "); 
		System.out.println(zip_codes.descendingMap()); 
		//Returns descending order of maps
		
		System.out.println("Descending keyset order : "); 
		System.out.println(zip_codes.descendingKeySet()); 
		// returns descending order of keys in map
		
		
		System.out.println("Navigable key set  : "); 
		System.out.println(zip_codes.navigableKeySet()); 
		// returns ascending order of keys in map
		
		System.out.println("The first entry : "+zip_codes.firstEntry()); 
		//returns 1st entry 
		
		System.out.println("The last entry : "+zip_codes.lastEntry());  
		// returns last entry
		
		System.out.println("First key in zip_codes : "+zip_codes.firstKey()); 
		//returns 1st key in map
		
		System.out.println("Last key in zip_codes : "+zip_codes.lastKey()); 
		//returns last key in map
		
		System.out.println("The ceiling entry for Guntur : "+ zip_codes.ceilingEntry(522602));
		// //returns key-value entry greater than or equals to 522602.. As 522602 doesn't exists it returns 523001=prakasam
		
		System.out.println("The ceiling key entry for Guntur : "+ zip_codes.ceilingKey(522601));
		//returns key greater than or equals to 522601.. As 522601 exists it returns 522601
		
		System.out.println("The floor entry for Guntur : "+ zip_codes.floorEntry(522602));
		//returns key-value entry less than or equals to 522601.. As 522602 doesn't exists it returns 522601 Guntur
		
		System.out.println("The floor key entry for Guntur : "+ zip_codes.floorKey(522601)); 
		//returns key less than or equals to 522601.. As 522601 exists it returns 522601
		
		System.out.println("The lower key entry  : "+zip_codes.lowerKey(516001));
		// returns greatest key less than 516001 

		System.out.println("The highest key entry  : "+zip_codes.higherKey(516001));
		// returns lowest key greater than 516001 
		
		zip_codes.pollFirstEntry();
		// removes 1st entry in map
		System.out.println("After removing 1st entry using pollFirstEntry()"); 
		System.out.println(zip_codes); 
		
		zip_codes.pollLastEntry();
		//removes last entry in map
		System.out.println("After removing last entry using pollLastEntry()"); 
		System.out.println(zip_codes); 
		
		 zip_codes1 = zip_codes.subMap(517001, true, 523101, true); 
		 // returns submap 
		 System.out.println("Submap of zip_codes in zip_codes1 : ");
		 System.out.println(zip_codes1);
		  
		 zip_codes2 = (NavigableMap<Integer, String>) zip_codes.tailMap(517001); 
		 // returns tailmap 
		 System.out.println("Tailmap of zip_codes in zip_codes2 : ");
		 System.out.println(zip_codes2);
		

	}

}
/*

District Zip codes lists in Andhra Pradesh :  
Ascending order : 
{515001=Anantapur, 516001=Kadapa, 517001=Chittoor, 521301=Krishna, 522601=Guntur, 523001=Prakasam, 533101=East Godavari, 534201=West Godavari}
Descending order : 
{534201=West Godavari, 533101=East Godavari, 523001=Prakasam, 522601=Guntur, 521301=Krishna, 517001=Chittoor, 516001=Kadapa, 515001=Anantapur}
Descending keyset order : 
[534201, 533101, 523001, 522601, 521301, 517001, 516001, 515001]
Navigable key set  : 
[515001, 516001, 517001, 521301, 522601, 523001, 533101, 534201]
The first entry : 515001=Anantapur
The last entry : 534201=West Godavari
First key in zip_codes : 515001
Last key in zip_codes : 534201
The ceiling entry for Guntur : 523001=Prakasam
The ceiling key entry for Guntur : 522601
The floor entry for Guntur : 522601=Guntur
The floor key entry for Guntur : 522601
The lower key entry  : 515001
The highest key entry  : 517001
After removing 1st entry using pollFirstEntry()
{516001=Kadapa, 517001=Chittoor, 521301=Krishna, 522601=Guntur, 523001=Prakasam, 533101=East Godavari, 534201=West Godavari}
After removing last entry using pollLastEntry()
{516001=Kadapa, 517001=Chittoor, 521301=Krishna, 522601=Guntur, 523001=Prakasam, 533101=East Godavari}
Submap of zip_codes in zip_codes1 : 
{517001=Chittoor, 521301=Krishna, 522601=Guntur, 523001=Prakasam}
Tailmap of zip_codes in zip_codes2 : 
{517001=Chittoor, 521301=Krishna, 522601=Guntur, 523001=Prakasam, 533101=East Godavari}



*/
