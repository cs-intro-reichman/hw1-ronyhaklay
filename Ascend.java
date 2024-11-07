import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        Random rand = new Random();
        int a = rand.nextInt(lim);
        int b = rand.nextInt(lim);
        int c = rand.nextInt(lim);

        System.out.println(a + ", " + b + ", " + c);
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        int middle = sum - max - min;
        System.out.println(min + " " + middle + " " + max);
	}
}
