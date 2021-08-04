package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SchoolLearning extends GeneralLearning{
	static String activityDone;
	static String doingTests(Human human, int numbOfTest){
		activityDone = listOfTests.get(numbOfTest - 1);
		human.setTestsDone(listOfTests.get(numbOfTest - 1));
		return "Çðîáëåíî : " + activityDone;
	}
	static String writingHomework(Human human, String date, int numbOfTasks){
		Scanner scan = new Scanner(System.in);
		List<String> listOfTasks = new ArrayList<>();

		for(int i = 0; i < numbOfTasks; i++){
			listOfTasks.add(scan.next());
		}
		human.setNotesForHomework(date, listOfTasks);
		return "Äîäàíî äç íà äàòó : " + date + " ," + listOfTasks.toString();
	}
	static String doingHomework(Human human, int numbOfTask){
		Object dateKey = human.getNotesForHomework().keySet().toArray()[numbOfTask - 1];
		Object homeWork = human.getNotesForHomework().get(dateKey);
		return "Çðîáëåíî : " + dateKey + " " + homeWork;
	}
	static Map<String, Map<String, Double>> showAllTests(Human human){
		return human.getNotesForMarks();
	}
	static Map<String, List<String>> showAllTasks(Human human){
		return human.getNotesForHomework();
	}
}
