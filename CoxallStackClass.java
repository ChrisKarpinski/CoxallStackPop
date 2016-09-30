*
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This is the class where stack operations happen
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class MCoxallStack {

	private List<String> stackArray = new ArrayList<String>();
	
	public void push (String someString) {
		
		stackArray.add(someString);
		
	}
	
	public String pop () {
		
		String lastString = stackArray.get(stackArray.size()-1);
		return lastString;
		
	}
	
}
