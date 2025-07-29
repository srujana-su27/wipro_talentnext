package collections;

interface WordCount {
	int count(String str);
}
class MyClassWithLambda{
	public static void main(String[] args) {
		WordCount wordCounter = str -> str.split("\\s+").length;
		String text = "This is a sample sentence.";
        int wordCount = wordCounter.count(text);

        System.out.println("The number of words in the string is: " + wordCount);
	}
}
