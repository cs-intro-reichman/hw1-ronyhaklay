
public class FVCalc {
	public static void main(String[] args){
			int current = Integer.parseInt(args[0]);
			double rate  = Double.parseDouble(args[1]);
			int num  = Integer.parseInt(args[2]);
		rate = rate / 100;  
		double futureValue = current * Math.pow((1 + rate), num);
		System.out.print("After " + num + " years, " + current + "$ saved at " + (rate * 100) + "% will yield " + (int)futureValue + "$ ");
	}
}