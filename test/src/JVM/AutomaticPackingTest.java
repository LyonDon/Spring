package JVM;

public class AutomaticPackingTest {
	public static void main(String[] args) {
		Integer aInteger=1;
		Integer bInteger=2;
		Integer cInteger=3;
		Integer dInteger=3;
		Integer eInteger=321;
		Integer fInteger=321;
		Long g=3L;
		System.out.println(cInteger==dInteger);
		System.out.println(eInteger==fInteger);
		System.out.println(cInteger==(aInteger+bInteger));
		System.out.println(cInteger.equals(aInteger+bInteger));
		System.out.println(g==aInteger+bInteger);
		System.out.println(g.equals(aInteger+bInteger));
	}
}
