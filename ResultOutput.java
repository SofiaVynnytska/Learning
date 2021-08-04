package learning;

import java.util.List;
import java.util.Map;

public class ResultOutput {
	static void doingExercisesAndTests(String nameOfExercise){
		System.out.println("Doing : " + nameOfExercise);
	}
	static void searchingInternet(String name){
		System.out.println(name + " is searching the Internet");
	}
	static void bookBought(String bookName){
		System.out.println("Куплено книжку : " + bookName);
	}
	static void analyseTestResult(double result){
		System.out.println("Успішно пройдено " + result + "% тесту");
	}
	static void viewActivity(String activity){
		System.out.println(activity);
	}
	static void notesSuccessfullyAdded(String homeWork){
		System.out.println(homeWork);
	}
	static void showAllTests(Map<String, Map<String, Double>> map){
		System.out.println("Записані тести : " + map.toString());
	}
	static void showAllTasks(Map<String, List<String>> map){
		System.out.println("Записані завдання : " + map.toString());
	}
	static void doTests(List<String>listOfTests){
		int count = 1;
		System.out.println("Виберіть тест: ");
		for(String test : listOfTests){
			System.out.println(test + " : " + count);
			count++;
		}
	}
	static void chooseBook(List<String> listOfBooks){
		int count = 1;
		System.out.println("Виберіть книжку: ");
		for(String book : listOfBooks){
			System.out.println(book + " : " + count);
			count++;
		}
	}
	static void getTestDoneNumb(){
		System.out.println("Виберіть тест, який Ви проходили.");
	}
	static void getMarkReceived(){
		System.out.println("Введіть кількість балів, які Ви набрали.");
	}
	static void doingExercisesOutput(List<String>listOfExercises){
		int count = 1;
		System.out.println("Виберіть вправу: ");
		for(String exercise : listOfExercises){
			System.out.println(exercise + " : " + count);
			count++;
		}
	}
	static void getDateOfTestDone(){
		System.out.println("Введіть дату виконання(dd.mm.yyyy)");
	}
	static void getNumbOfTestToWrite(){
		System.out.println("Скільки записів зробити?");
	}
	static void doingHomeworkOutput(Human human){
		int count = 1;
		System.out.println("Виберіть номер дз");
		for(Map.Entry<String, List<String>> entry : human.getNotesForHomework().entrySet()){
			System.out.println(count + " : " + entry.getKey() + " " + entry.getValue());
			count++;
		}
	}
	static void getTestData(){
		System.out.println("Введіть назву тесту, а далі кількість набраних балів (у іншому рядку)");
	}
	static void getTestsDone(Human human){
		for(String test : human.getTestsDone()){
			System.out.println(test);
		}
	}
}
