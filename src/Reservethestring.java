
public class Reservethestring {

	public static void main(String[] args) {
		
		String str="Java concept of the day";
		String [] words=str.split("\\s");
		String output="";
		
		for(int i=words.length-1;i>=0;i--) {
			
			output=output+words[i];
		}
		
		System.out.println("Reverse the words"+output);
		
	//	System.out.println("+++++++++++++++++++++++++++++++++++++\n");
		
		
		for(int j=str.length()-1;j>=0;j--) {
			
			output=output+str.charAt(j)+"";
		}
		System.out.println("Reverse the character "+output);
		
		
	}
	
	

	
}
