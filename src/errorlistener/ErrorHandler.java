/**
  * Error handler for semantic errors. 
  * All the semantic errors are represented as a new kind of Type: ErrorType.
  * Assigning ErrorType as the type of one expression means that it is erroneous. 
  * In this way, erroneous and correct expressions are treated uniformly.
  * 
  * @author  Francisco Ortin
  */

package errorlistener;

import types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

	private ErrorHandler()  {}

	private static ErrorHandler instance=new ErrorHandler();

	public static ErrorHandler getErrorHandler() { return instance; }

	private List<ErrorType> errors=new ArrayList<ErrorType>();
	
	public void addError(ErrorType error) {
		errors.add(error);
	}
	
	public void showErrors(PrintStream out) {
		for (int i=0;i<errors.size();i++)
			out.println(errors.get(i));
	}
	
	public boolean anyError() {
		return errors.size()>0;
	}
}
