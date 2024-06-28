package String;

public class ExpString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Welcome";
		String rev = "" ;
		System.out.println( S.length());
	
for(int i=S.length()-1;i>=0;i--) {
	rev=rev+S.charAt(i);
}
System.out.println(rev);

	}

}
