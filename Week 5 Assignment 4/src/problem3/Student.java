package problem3;

import java.io.*;

public class Student {
	
	private String name;
	private int grade;
	private double gpa;
	
	public Student(String name, int grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	
//======================= Getters ===================================	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}

	public double getGpa() {
		return this.gpa;
	}
	
		
//======================= Setters ===================================
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setGrade(int newGrade) {
		this.grade = newGrade;
	}

	public void setGpa(double newGpa) {
		this.gpa = newGpa;
	}


//===================== Static Methods ===========================================	
	public static String getNameInput() {
		
		System.out.print("Please enter the students name: ");
		String name = null;
		try {
			name = input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}
	
	public static int getGradeInput() {
		
		System.out.print("Please enter the students grade: ");
		Integer grade = 0;
		try {
			grade = new Integer(input());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return grade;
	}
	
	public static double getGpaInput() {
		
		System.out.print("Please enter the students gpa: ");
		Double gpa = 0.0;
		try {
			gpa = new Double(input());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gpa;
	}
	
	
	public static String input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		return br.readLine();
	}
	
	@SuppressWarnings("resource")
	public static void output(String output, File fileName) throws IOException, UnsupportedEncodingException {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(output.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeNameToFile(Student stud) {
		File fileName = new File("C:\\Users\\brian\\Desktop\\Name.txt");
		
		if(!fileName.exists()) {
			try {
				fileName.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			output(stud.getName(),fileName);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeGradeToFile(Student stud) {
		File fileName = new File("C:\\Users\\brian\\Desktop\\Grade.txt");
		
		if(!fileName.exists()) {
			try {
				fileName.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			output(Integer.toString(stud.getGrade()), fileName);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeGpaToFile(Student stud) {
		File fileName = new File("C:\\Users\\brian\\Desktop\\GPA.txt");
		
		if(!fileName.exists()) {
			try {
				fileName.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			output(Double.toString(stud.getGpa()),fileName);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//======================== Main ===========================================
	public static void main(String[] args) {
		String name = getNameInput();
		int grade = getGradeInput();
		double gpa = getGpaInput();
		
		Student s1 = new Student(name, grade, gpa);
		
		writeNameToFile(s1);
		writeGradeToFile(s1);
		writeGpaToFile(s1);

	}
}
