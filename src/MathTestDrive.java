
public class MathTestDrive {
	public static void main(String[] args) {
		MathSingleton m1 = MathSingleton.getInstance();
//		System.out.println("316 + 13 = "+m1.add(316, 13));
//		System.out.println("316 - 13 = "+m1.subtract(316, 13));
//		System.out.println("3 * 3 = "+m1.multiply(3, 3));
//		System.out.println("15 / 3 = "+m1.divide(15, 3));
//		MathSingleton m2 = MathSingleton.getInstance();
//		System.out.println(m1.equals(m2));
		
		
		m1.setVariable1 (15);
		m1.setVariable2(3);
		System.out.println(m1.add());
		MathSingleton m2 = MathSingleton.getInstance();
		System.out.println(m1.equals(m2));
		m2.setVariable2(5);
		System.out.println(m1.add());
	}
}
