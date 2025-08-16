package rahul;

import java.util.HashSet;

public class ab {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	    public static void main(String[] args) {
	        
	      String str= "Rahuuliii";
	      str=str.toLowerCase();
	      char [] ch =str.toCharArray();
	      
	      
	      int count=0;
	      
	      
	      HashSet<Character> duplicates= new HashSet<Character>();
	     
	      HashSet<Character> seen = new HashSet<Character>();
	      	
	      	for(int i=0;i<ch.length;i++){
	          
//	      		if(!seen.add(ch[i]))
	      			
	      			duplicates.add(ch[i]);
	      	
	       
	      }
	      System.out.println(duplicates);
	      System.out.println(duplicates.size());
	    
	    }}  
	    


