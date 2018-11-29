package problem5;

public class TenToTwenty {
	
	public static void method1() {
		for (int i=10; i<=20; i=i+2) {
			if (i == 16) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static void method2() {
		for (int i=10; i<=20; i++) {
			if (!(i%2 == 0) || i==16) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static void method3() {
		int i = 10;
		while (true) {
			if(i != 16) {
				System.out.println(i);
			}
			if (i>=20) {
				break;
			} 
			i=i+2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
		method3();
	}

}
