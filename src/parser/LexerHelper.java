package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static Character lexemeToChar(String text) {
		if (text == null || text.length() < 2) {
			throw new IllegalArgumentException("Invalid character constant: " + text);
		}

		// Strip the enclosing single quotes
		String inner = text.substring(1, text.length() - 1);

		// If there's only one character and it's not a backslash, return it
		if (inner.length() == 1 && inner.charAt(0) != '\\') {
			return inner.charAt(0);
		}

		// Handle the escape sequences
		switch (inner) {
			case "\\n":
				return '\n';
			case "\\t":
				return '\t';
			case "\\r":
				return '\r';
			case "\\'":
				return '\'';
			case "\\\\":
				return '\\';
			default:
				// Handle octal escape sequences
				if (inner.matches("\\\\[0-7]{1,3}")) {
					try {
						int octalValue = Integer.parseInt(inner.substring(1), 8);
						return (char) octalValue;
					} catch (NumberFormatException e) {
						throw new IllegalArgumentException("Invalid octal escape sequence: " + inner, e);
					}
				} else {
					throw new IllegalArgumentException("Unknown escape sequence: " + inner);
				}
		}
	}
}
