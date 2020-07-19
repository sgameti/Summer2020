

public class GradeAvg {

	public static void main(String[] args) {
		double quizScore1;
		double quizScore2;
		double quizScore3;
		double testScore1;
		double testScore2;
		double quizScoreAvg;
		double testScoreAvg;
		
		quizScore1 = 75;
		quizScore2 = 50; 
		quizScore3 = 80;
		testScore1 = 98;
		testScore2 = 78;
		
		quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
		testScoreAvg = (testScore1 + testScore2) /2;

		System.out.println("You scored " + quizScore1 + " on the first quiz");
		System.out.println("You scored " + quizScore2 + " on the second quiz");
		System.out.println("You scored " + quizScore3 + " on the third quiz");
		System.out.println("You scored " + testScore1 + " on the first test");
		System.out.println("You scored " + testScore2 + " on the second test");
		System.out.println("Your average quiz score is " + quizScoreAvg);
		System.out.println("Your average test score is " + testScoreAvg);
	}

}
