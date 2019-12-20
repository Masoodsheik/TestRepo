
public class stringtesting {

	public static void main(String[] args) {
		
		int num=153;
		int numofdigit=String.valueOf(num).length();
		int sum=0;
		while(num !=0) {
			
			int lastdigit=num%10;
			int powerofdigit=1;
			
			for(int i=0;i<numofdigit;i++) {
				powerofdigit=powerofdigit*lastdigit;
			}
			sum=sum+powerofdigit;
			num=num/10;
		}
		
		if(sum==num) {
			System.out.println("armstrong");
		}else {
			System.out.println("Not a armstong");
		}
		
		
		
	}
	
}
