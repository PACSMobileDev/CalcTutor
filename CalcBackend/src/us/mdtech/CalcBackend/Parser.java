package us.mdtech.CalcBackend;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	/** A regular expression matching numeric expressions (floating point numbers) */
	private static final String REGEX_NUMERIC = "(((?<=[-+*/(])|(?<=^))-)?\\d+(\\.\\d+)?";
	/** A regular expression matching a valid variable name */
	private static final String REGEX_VARIABLE = "\\$[a-zA-Z][a-zA-Z0-9]*";
	/** A regular expression matching a valid operation string */
	public static final String REGEX_OPERATION = "[a-zA-Z][a-zA-Z0-9]+|[-*/+|?:@&^<>'`=%#]";
	/** A regular expression matching a valid parenthesis */
	private static final String REGEX_PARANTHESIS = "[()]";
	
	
	/**
	 * @since 2.0
	 * 
	 * Parts of the Expression provided,
	 */
	List<String> expr = new ArrayList<String>();
	
	public String BeginParse(String Expression) throws InvalidArgumentException {
		// Remove the spaces from the expression.
		String s = Expression.replaceAll(" ", "");
		
		// Compile the regular expression.
        Pattern p = Pattern.compile(REGEX_NUMERIC + "|" + REGEX_OPERATION + "|" + REGEX_VARIABLE + "|" + REGEX_PARANTHESIS);
        
        // Generate a Matcher of the Pattern.
        Matcher m = p.matcher(s);
        
        // Find the next match to the RegEx. 
        while (m.find()) {
        	// Get the match and add it to List.
        	expr.add(m.group());
            //System.out.println(m.group());
        }
        
        if (expr.size() == 0) {
        	throw new InvalidArgumentException("Expression", Expression, new IllegalArgumentException("The passed expression"));
        }
        
        // The Expression is now splitted. Lets now see what is inside...
	}
}