package us.mdtech.CalcBackend;

public class InvalidArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String BadArg;
	
	public String ArgVal;
	
	public Exception Problem;
	
	
	public InvalidArgumentException(String ArgName, String ArgVal, Exception problem) {
		this.BadArg = ArgName;
		this.ArgVal = ArgVal;
		this.Problem = problem;
	}
	
}