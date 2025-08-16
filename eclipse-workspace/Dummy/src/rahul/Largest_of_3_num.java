package rahul;

public class Largest_of_3_num {
public static void main(String[] args) {
	
	int a=10;
	int b=13;
	int c=17;
	
	int largest= a>b?a:b;
	
	largest =c>largest?c:largest;
	
	System.out.println(largest);
}
}
