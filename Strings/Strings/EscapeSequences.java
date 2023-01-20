package Strings;

public class EscapeSequences {

	public static void main(String[] args) {
		String x = "blah\n\"blah\"\tblah\\\u007e";
		System.out.println(x);
	}

}


// \n new line
// \t tab
// \" means adding quotations to output
// Double back slash "\\" means adding a backslash