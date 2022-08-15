package testingCenter;

//Creates a class Student. Each object has quiz score, name, and quiz average

public class Student {
	
	private int quizScore;
	private int quizzesTaken;
	private String studentName;
	
	// constructor
	public Student(String name) {
		
		quizScore = 0;
		quizzesTaken = 0;
		studentName = name;
		
	}
	
	// print student name
	public void getName() {
		
		System.out.println(studentName);
		
	}
	
	
	// adds one to number of quizzes taken
	public void addQuiz() {
		
		quizzesTaken++;
		
	}
	
	// adds quiz score
	public void addQuiz(int score) {
		
		quizScore+= score;
		
	}
	
	// returns quiz average of student.
	public double quizAverage() {
		
		return (quizScore/quizzesTaken);
		
	}
	

}
