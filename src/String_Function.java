
public class String_Function {
	public static void main(String[] args) {
		String txt = "Hello";
		String txt2 = "Hello";
		//		charAt()	Returns the character at the specified index (position)	
		System.out.println(txt.charAt(0));
		
		//		codePointAt()	Returns the Unicode of the character at the specified index	
		System.out.println(txt.codePointAt(0));
		
		//		codePointBefore()	Returns the Unicode of the character before the specified index	
		System.out.println(txt.codePointBefore(2));
		
		//		codePointCount()	Returns the number of Unicode values found in a string.	
		System.out.println(txt.codePointCount(1,4));
		
		//		compareTo()	Compares two strings lexicographically   0 = true | -1 = false
		System.out.println(txt.compareTo(txt2));
		
		//		compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	
		System.out.println(txt.compareToIgnoreCase(txt2));
		
		//		concat()	Appends a string to the end of another string	
		System.out.println(txt.concat(txt2));
		
		//		contains()	Checks whether a string contains a sequence of characters	
		System.out.println(txt.contains(txt2));
		
		//		contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	
		System.out.println(txt.contentEquals(txt2));
		
		//		copyValueOf()	Returns a String that represents the characters of the character array	
		
		//		endsWith()	Checks whether a string ends with the specified character(s)	
		//		equals()	Compares two strings. Returns true if the strings are equal, and false if not	
		//		equalsIgnoreCase()	Compares two strings, ignoring case considerations	
		//		format()	Returns a formatted string using the specified locale, format string, and arguments	
		//		getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	
		//		getChars()	Copies characters from a string to an array of chars	void
		//		hashCode()	Returns the hash code of a string	
		//		indexOf()	Returns the position of the first found occurrence of specified characters in a string	
		//		intern()	Returns the canonical representation for the string object	
		//		isEmpty()	Checks whether a string is empty or not	
		//		lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	
		//		length()	Returns the length of a specified string	
		//		matches()	Searches a string for a match against a regular expression, and returns the matches	
		//		offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	
		//		regionMatches()	Tests if two string regions are equal	
		//		replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	
		//		replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	
		//		replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	
		//		split()	Splits a string into an array of substrings	
		//		startsWith()	Checks whether a string starts with specified characters	
		//		subSequence()	Returns a new character sequence that is a subsequence of this sequence	
		//		substring()	Returns a new string which is the substring of a specified string	
		//		toCharArray()	Converts this string to a new character array	
		//		toLowerCase()	Converts a string to lower case letters	
		//		toString()	Returns the value of a String object	
		//		toUpperCase()	Converts a string to upper case letters	
		//		trim()	Removes whitespace from both ends of a string	
		//		valueOf()	Returns the string representation of the specified value
	}
}
