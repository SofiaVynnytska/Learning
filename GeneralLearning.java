package learning;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GeneralLearning {
	static List<String> listOfTests;
	static double maxTestResult, testResult, markReceived;
	static Map<String, Double> maxTestMark;
	static int numbOfExercise;
	static String activityDone;

	static String searchTheInternet(Human human){
		return human.getName();
	}
	static double analyseTestResult(Human human, String numbOfExercise, double markReceived){
		testResult = markReceived/getMaxTestResult(numbOfExercise);
		return testResult*100;
	}
	static double getMaxTestResult(String testName){
		for(Map.Entry<String, Double> entry : maxTestMark.entrySet()){
			if(entry.getKey().trim().equals(testName.trim())){
				maxTestResult = entry.getValue();
			}
		}
		return maxTestResult;
	}
	static String writingTestMarks(Human human, String date, int numbOfTests){
		Scanner scan = new Scanner(System.in);
		Map<String, Double> testData = new TreeMap<>();
		for(int i = 0; i < numbOfTests; i++){
			String testName = scan.next();
			testName += scan.nextLine();
			double mark = scan.nextDouble();
			testData.put(testName, mark);
		}
		human.setNotesForMarks(date, testData);
		return "Додано бали за пройденi тести за : " + date + " ," + testData.toString();
	}
}
