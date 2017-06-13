package square.calc;

/**
 * aaaaa
 * @author Houssem KALLEL
 *
 */
public class SquareTest {

	public static void main(String[] args) {

		if (args.length > 0) {
			Integer value = Integer.valueOf(args[0]);
			// use '*' operator to calculate squares
			System.out.println(value * value);
		} else {
			System.out.println("No value introduced !");
		}

		System.out.println("End square calculation");
	}

}
