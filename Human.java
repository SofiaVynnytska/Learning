package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Human {
	private String name;
	private int age;
	private double balanceOfMoney;
	private double testResult;
	private List<String> booksForLearning, testsDone, exercisesDone;
	private Map<String, List<String>> notesForHomework;
	private Map<String, Map<String, Double>> notesForMarks;

	public Human(String name, int age, double balanceOfMoney) {
		this.name = name;
		this.age = age;
		this.balanceOfMoney = balanceOfMoney;
		this.booksForLearning = new ArrayList<>();
		this.testsDone = new ArrayList<>();
		this.exercisesDone = new ArrayList<>();
		this.notesForHomework = new TreeMap<>();
		this.notesForMarks = new TreeMap<>();
	}
	public Human() {
		this.booksForLearning = new ArrayList<>();
		this.testsDone = new ArrayList<>();
		this.exercisesDone = new ArrayList<>();
		this.notesForHomework = new TreeMap<>();
		this.notesForMarks = new TreeMap<>();
	}
	public void setNotesForMarks(String date, Map<String, Double> testData){
		this.notesForMarks.put(date, testData);
	}
	public Map<String, Map<String, Double>> getNotesForMarks(){
		return notesForMarks;
	}
	public void setNotesForHomework(String date, List<String> task){
		this.notesForHomework.put(date, task);
	}
	public Map<String, List<String>> getNotesForHomework(){
		return notesForHomework;
	}
	public List<String> getTestsDone() {
		return testsDone;
	}
	public void setTestsDone(String testsDone) {
		this.testsDone.add(testsDone);
	}
	public List<String> getExercisesDone() {
		return exercisesDone;
	}
	public void setExercisesDone(String exercisesDone) {
		this.exercisesDone.add(exercisesDone);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalanceOfMoney() {
		return balanceOfMoney;
	}
	public void setBalanceOfMoney(double balanceOfMoney) {
		this.balanceOfMoney = balanceOfMoney;
	}
	public double getTestResult() {
		return testResult;
	}
	public void setTestResult(double testResult) {
		this.testResult = testResult;
	}
	public List<String> getBooksForLearning() {
		return booksForLearning;
	}
	public void setBooksForLearning(String books) {
		booksForLearning.add(books);
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", balanceOfMoney=" + balanceOfMoney + ", testResult="
				+ testResult + ", booksForLearning=" + booksForLearning + ", testsDone=" + testsDone
				+ ", exercisesDone=" + exercisesDone + ", notesForHomework=" + notesForHomework + "]";
	}
}
