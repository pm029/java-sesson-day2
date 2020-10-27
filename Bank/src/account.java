public class account {
	static int dollar;
	
	public void amount(int amo) {
		int T=amo*dollar;
		System.out.println("amount:"+T);
	}
	
	public void setdollar(int D) {
		dollar=D;
		
	}
}