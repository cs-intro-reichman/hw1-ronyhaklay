public class Bill3 {
	public static void main(String[] args) {

	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2]; 
		int numbill = Integer.parseInt(args[3]);
		double total = Math.ceil((double)numbill/3);
		System.out.print("Dear " + name3 + ", " + name2 + ", and " + name1 + ": " + "pay " + total + " Shekels each");
	}
}
