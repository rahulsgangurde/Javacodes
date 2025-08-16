package rahul;

public class r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shree Ram krishna yours";
		
		str=str.toLowerCase();
		
		int Vowels = 0;
		int Consonents =0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
					
					Vowels++;
				}
				else {
					
					Consonents++;
				}
				
			}
			
		 
			
		}
		
		System.out.println("Vow:"+Vowels +" "+"Cons:"+Consonents);
	}

}
