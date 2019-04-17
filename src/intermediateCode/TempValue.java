package intermediateCode;

public class TempValue {
	private static int count;
	private int num;

	public TempValue() {
		super();
		num = count++;
	}

	public String toString() {
		return "t" + num;
	}

}
