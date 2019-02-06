
public class IncorrectFormat extends Exception {

	String str1;

IncorrectFormat(String str2){
	str1 = str2;
	System.out.println(str1 + " is not a valid format");
}
}
