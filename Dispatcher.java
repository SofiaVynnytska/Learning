package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dispatcher {

	public static void main(String[] args) {
		//Own learning
		Human h = new Human("Sofia", 17, 1000);
		List<String> listOfBooks = new ArrayList<>();
		listOfBooks.add("book 1"); listOfBooks.add("book 2"); listOfBooks.add("book 3"); listOfBooks.add("book 4");
		List<String> listOfExercises = new ArrayList<>();
		listOfExercises.add("ex. 1"); listOfExercises.add("ex. 2"); listOfExercises.add("ex. 3"); listOfExercises.add("ex. 4");
		List<String> listOfTests = new ArrayList<>();
		listOfTests.add("test 1"); listOfTests.add("test 2"); listOfTests.add("test 3"); listOfTests.add("test 4");

		OwnLearning.listOfBooks = listOfBooks;
		OwnLearning.listOfExercises = listOfExercises;
		OwnLearning.listOfTests = listOfTests;

		Map<String, Double> mapOfBooksPrice = new TreeMap<>();
		mapOfBooksPrice.put("book 1", 100.0); mapOfBooksPrice.put("book 2", 200.0); mapOfBooksPrice.put("book 3", 150.0); mapOfBooksPrice.put("book 4", 320.0);
		Map<String, Double> maxTestMark = new TreeMap<>();
		maxTestMark.put("test 1", 50.0); maxTestMark.put("test 2", 100.0); maxTestMark.put("test 3", 20.0); maxTestMark.put("test 4", 12.0);

		OwnLearning.mapOfBooksPrice = mapOfBooksPrice;
		OwnLearning.maxTestMark = maxTestMark;

		Scanner scan = new Scanner(System.in);
		System.out.println("Cкільки книжок купити?");
		int numb = scan.nextInt();
		for(int i = 0; i < numb; i++){
			ResultOutput.chooseBook(OwnLearning.listOfBooks);
			int numbOfBook = scan.nextInt();
			ResultOutput.bookBought( OwnLearning.buyBooks(h, numbOfBook));
		}
		System.out.println("Скільки вправ проходити?");
		numb = scan.nextInt();
		for(int i = 0; i < numb; i++){
			ResultOutput.doingExercisesOutput(OwnLearning.listOfExercises);
			int numbEx = scan.nextInt();
			String activity1 = OwnLearning.doingExercises(h, numbEx);
			ResultOutput.doingExercisesAndTests(activity1);
		}
		System.out.println("Скільки тестів проходити?");
		numb = scan.nextInt();
		for(int i = 0; i < numb; i++){
			ResultOutput.doTests(OwnLearning.listOfTests);
			int numbTest = scan.nextInt();
			String activity2 = OwnLearning.doingTest(h, numbTest);
			ResultOutput.doingExercisesAndTests(activity2);
		}
		System.out.println("Скільки тестів аналізувати?");
		numb = scan.nextInt();
		for(int i = 0; i < numb; i++){
			ResultOutput.getTestDoneNumb();
			ResultOutput.getTestsDone(h);
			String numbTest = scan.next();
			numbTest += scan.nextLine();
			ResultOutput.getMarkReceived();
			double testMark = scan.nextDouble();
			double result = OwnLearning.analyseTestResult(h, numbTest, testMark);
			ResultOutput.analyseTestResult(result);
		}
		String activityDone1 = OwnLearning.viewAcivityDone(h, "exercise");
		ResultOutput.viewActivity(activityDone1);
		String activityDone2 = OwnLearning.viewAcivityDone(h, "test");
		ResultOutput.viewActivity(activityDone2);
		String search = OwnLearning.searchTheInternet(h);
		ResultOutput.searchingInternet(search);
		ResultOutput.getDateOfTestDone();
		String date = scan.next();
		ResultOutput.getNumbOfTestToWrite();
		int numbToWrite = scan.nextInt();
		ResultOutput.getTestData();
		String writingMarks = OwnLearning.writingTestMarks(h, date, numbToWrite);
		ResultOutput.notesSuccessfullyAdded(writingMarks);

		for(int i = 0; i < 5; i++){
			System.out.println();
		}
		//School learning
		Human h1 = new Human("Sofia", 17, 1000);
		System.out.println("Скільки домашніх завдань записати?");
		int numbHomeTask = scan.nextInt();
		for(int i = 0; i < numbHomeTask; i++){
			ResultOutput.getDateOfTestDone();
			String dateDone = scan.next();
			ResultOutput.getNumbOfTestToWrite();
			int numbOfHomework = scan.nextInt();
			ResultOutput.notesSuccessfullyAdded(SchoolLearning.writingHomework(h1, dateDone, numbOfHomework));
		}
		ResultOutput.doingHomeworkOutput(h1);
		int numbOfHWDone = scan.nextInt();
		ResultOutput.notesSuccessfullyAdded(SchoolLearning.doingHomework(h1, numbOfHWDone));
		ResultOutput.doTests(SchoolLearning.listOfTests);
		int numbOfTest = scan.nextInt();
		ResultOutput.notesSuccessfullyAdded(SchoolLearning.doingTests(h1, numbOfTest));

		ResultOutput.getTestDoneNumb();
		ResultOutput.getTestsDone(h1);
		String numbTest = scan.next();
		numbTest += scan.nextLine();
		ResultOutput.getMarkReceived();
		double testMark = scan.nextDouble();
		ResultOutput.analyseTestResult(SchoolLearning.analyseTestResult(h1, numbTest, testMark));
		ResultOutput.searchingInternet(SchoolLearning.searchTheInternet(h1));
		ResultOutput.getDateOfTestDone();
		String date1 = scan.next();
		ResultOutput.getNumbOfTestToWrite();
		int numbOfTestToWrite = scan.nextInt();
		ResultOutput.getTestData();
		ResultOutput.notesSuccessfullyAdded(SchoolLearning.writingTestMarks(h1, date1, numbOfTestToWrite));
		ResultOutput.showAllTasks(SchoolLearning.showAllTasks(h1));
		ResultOutput.showAllTests(SchoolLearning.showAllTests(h1));
		scan.close();
	}

}
