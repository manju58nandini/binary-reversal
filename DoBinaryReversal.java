
public class DoBinaryReversal {


	public static void main(String[] args) {
		System.out.println(doBinaryReversal(args[0]));
	}

	private static int doBinaryReversal(String num) {
		String binaryValue = Integer.toBinaryString(Integer.parseInt(num)).toString();
		return Integer.parseInt(new StringBuilder(binaryValue.length() < 8 ? fillZeroes(binaryValue) : binaryValue)
				.reverse().toString(), 2);
	}

	private static String fillZeroes(String binVal) {
		int bitValue = 8 - binVal.length();
		String result = "";
		for (int index = 0; index < bitValue; index++) {
			result = result + "0";
		}
		result = result + binVal;

		return result;
	}

}
