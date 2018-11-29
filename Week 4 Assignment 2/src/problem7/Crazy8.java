package problem7;

public class Crazy8 {
	
	public static void method1() {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=8; j++) {
				System.out.print("8");
			}
			System.out.println("");
		}
	}
	
	public static void method2() {
		for(int i=0; i<4; i++) {
			for(int j=4; j>i; j--) {
				System.out.print("8");
			}
			System.out.println("");
		}
	}
	
	public static void method3() {
		for(int i=0; i<=8; i++) {
			for(int j=8; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println("8");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("");
		method2();
		System.out.println("");
		method3();
	}

}
