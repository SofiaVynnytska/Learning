package learning;

import java.util.List;
import java.util.Map;

public class OwnLearning extends GeneralLearning{
	static List<String> listOfBooks, listOfExercises;
	static int numbOfBook, numbOfExercise;
	static double bookPrice;
	static Map<String, Double> mapOfBooksPrice;

	static String buyBooks(Human human, int numbOfBook){
		String bookName = new String();
		if(human.getBalanceOfMoney() >= getBooksPrice(listOfBooks.get(numbOfBook - 1))){
			human.setBooksForLearning(listOfBooks.get(numbOfBook - 1));
			bookName = listOfBooks.get(numbOfBook - 1);
		} else {
			bookName = "книжка не куплена";
		}
		return bookName;
	}
	static double getBooksPrice(String bookName){
		for(Map.Entry<String, Double> entry : mapOfBooksPrice.entrySet()){
			if(entry.getKey().trim().equals(bookName.trim())){
				bookPrice = entry.getValue();
			}
		}
		return bookPrice;
	}
	static String doingExercises(Human human, int numbOfExercise){
		human.setExercisesDone(listOfExercises.get(numbOfExercise - 1));
		return listOfExercises.get(numbOfExercise - 1);
	}
	static String doingTest(Human human, int numbOfExercise){
		human.setTestsDone(listOfTests.get(numbOfExercise - 1));
		return listOfTests.get(numbOfExercise - 1);
	}
	static String viewAcivityDone(Human human, String activity){
		switch(activity){
		case "exercise":
			activity = "виконані вправи : " + human.getExercisesDone().toString();
			break;
		case "test":
			activity = "виконані тести : " + human.getTestsDone().toString();
		}
		return activity;
	}
}
