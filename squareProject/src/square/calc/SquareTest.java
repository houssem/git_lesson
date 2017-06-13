package square.calc;

public class SquareTest {

	public static void main(String[] args) {

		if (args.length > 0) {
			Integer value = Integer.valueOf(args[0]);
			System.out.println(value * value);
		} else {
			System.out.println("No value introduced !");
		}

	}

}
