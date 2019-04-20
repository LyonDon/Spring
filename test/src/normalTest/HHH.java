package normalTest;

public class HHH {
	public static void main(String[] args) {
		String str = "[sub](sss)";
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(str);
		System.out.println(sBuffer);
		for (int i = 0; i < sBuffer.length(); i++) {
			if (sBuffer.charAt(i) == '[') {
				sBuffer.deleteCharAt(i);
			}
			if (sBuffer.charAt(i) == ']') {
				sBuffer.deleteCharAt(i);
			}
			for (int j = i; j < sBuffer.length(); j++) {
				if (sBuffer.charAt(i) == '(' && sBuffer.charAt(j) == ')') {
					sBuffer.delete(i, j + 1);
				}
			}
		}
		
		System.out.println(sBuffer.toString());

	}
}
