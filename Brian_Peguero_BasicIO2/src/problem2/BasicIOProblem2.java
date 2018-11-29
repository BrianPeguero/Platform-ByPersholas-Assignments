package problem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The program is an extension to the first problem but
 * instead of displaying the letter to the console it is
 * written to a file.
 * 
 * @author Brian
 * */
public class BasicIOProblem2 {
	
	public static String border() {
		String border = "";
		
		border = border + "|";
		for(int i = 0; i < 50; i++) {
			border = border + "-";
		}
		border = border + "|";
		
		return border;
	}
	
	public static String stamp() {
		String stamp = "";
		
		stamp = stamp + "|";
		for(int i = 0; i < 46; i++) {
			if(i >= 42) {
				stamp = stamp + "#";
			}
			stamp = stamp + " ";
		}
		stamp = stamp + "|";
		
		return stamp;
	}
	
	public static String blank() {
		String blank = "";
		
		blank = blank + "|";
		for(int i = 0; i < 50; i++) {
			blank = blank + " ";
		}
		blank = blank + "|";
		
		return blank;
	}
	
	public static String name() {
		String name = "";
		
		name = name + "|";
		for(int i = 0; i < 37; i++) {
			name = name + " ";
			if (i == 30) {
				name = name + "Brian Peguero";
			}
		}
		name = name + "|";
		
		return name;
	}
	
	public static String addressLine1() {
		String address = "";
		
		address = address + "|";
		for(int i = 0; i < 34; i++) {
			address = address + " ";
			if (i == 27) {
				address = address + "884 Riverside Dr";
			}
		}
		address = address + "|";
		
		return address;
	}
	
	public static String addressLine2() {
		String address = "";
		
		address = address + "|";
		for(int i = 0; i < 31; i++) {
			address = address + " ";
			if (i == 24) {
				address = address + "New York, NY, 10032";
			}
		}		
		address = address + "|";
		
		return address;
	}
	
	public static void main(String[] args) {
		BufferedWriter bw  = null;
		
		try {
			bw  = new BufferedWriter(new FileWriter(""));
			
			bw.write(border());
			bw.write(stamp());
			bw.write(stamp());
			bw.write(stamp());
			bw.write(blank());
			bw.write(blank());
			bw.write(name());
			bw.write(addressLine1());
			bw.write(addressLine2());
			bw.write(blank());
			bw.write(blank());
			bw.write(border());
			
			
		} catch (IOException e) {
			System.out.println("could't open file");
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
