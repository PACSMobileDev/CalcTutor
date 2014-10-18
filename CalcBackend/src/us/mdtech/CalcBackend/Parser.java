package us.mdtech.CalcBackend;

public class Parser {
	public String BeginParse(String Expression) throws InvalidArgumentException {
		String num1;
		String num2;
		
		if (Expression.indexOf("+") > -1) {
			num1 = Expression.substring(0, Expression.indexOf("+")).trim();
			num2 = Expression.substring(Expression.indexOf("+") + 1).trim();
			
			try {
				return String.valueOf(Double.valueOf(num1) + Double.valueOf(num2));
			} catch (NumberFormatException ex) {
				throw new InvalidArgumentException("Expression", num2, ex);
			}
		} else if (Expression.indexOf("-") > -1) {
			num1 = Expression.substring(0, Expression.indexOf("+")).trim();
			num2 = Expression.substring(Expression.indexOf("+") + 1).trim();
			
			try {
				return String.valueOf(Double.valueOf(num1) - Double.valueOf(num2));
			} catch (NumberFormatException ex) {
				throw new InvalidArgumentException("Expression", num2, ex);
			}
		} else if (Expression.indexOf("*") > -1) {
			num1 = Expression.substring(0, Expression.indexOf("+")).trim();
			num2 = Expression.substring(Expression.indexOf("+") + 1).trim();
			
			try {
				return String.valueOf(Double.valueOf(num1) * Double.valueOf(num2));
			} catch (NumberFormatException ex) {
				throw new InvalidArgumentException("Expression", num2, ex);
			}
		} else if (Expression.indexOf("/") > -1) {
			num1 = Expression.substring(0, Expression.indexOf("+")).trim();
			num2 = Expression.substring(Expression.indexOf("+") + 1).trim();
			
			try {
				return String.valueOf(Double.valueOf(num1) / Double.valueOf(num2));
			} catch (NumberFormatException ex) {
				throw new InvalidArgumentException("Expression", num2, ex);
			}
		} else if (Expression.indexOf("+") > -1) {
			num1 = Expression.substring(0, Expression.indexOf("+")).trim();
			num2 = Expression.substring(Expression.indexOf("+") + 1).trim();
			
			try {
				return String.valueOf(Double.valueOf(num1) + Double.valueOf(num2));
			} catch (NumberFormatException ex) {
				throw new InvalidArgumentException("Expression", num2, ex);
			}
		}
		
		return "Not Implemented!";
	}
}