package _1_RahulShettyClasses;

public class StringReversal {
	
	public static void main(String[] args) {
		String Name = "nusuj";
		String Rev = "";
		   for( int i = Name.length()-1;i>=0;i--) {
	            Rev = Rev+Name.charAt(i);
	        }
	        System.out.println(Rev);
	        if(Name.equalsIgnoreCase(Rev)){
	            System.out.println("palindrome");
	        }
	        else{
	            System.out.println("not palidrome");
        }
	}

}
