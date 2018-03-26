package classes;

import java.util.ArrayList;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 
		SLLStack<Character> stack = new SLLStack<Character>(); 
		    for (int i=0; i < s.length(); i++) { 
		        char c = s.charAt(i); 
		        if (Character.isLetter(c))
		           if (Character.isUpperCase(c))
		        	   			stack.push(c); 
		           else if (Character.isLowerCase(c) && stack.isEmpty())
		                 return false; 
		            else {
		                 char t = stack.top() ; 
		                 if (t == Character.toUpperCase(c))
		                     	stack.pop();  
		                 else 
		                    return false; 
		                }
		            else 
		                return false; 
		    } 
		    if(stack.isEmpty())
		    return true; 
		    else
		    	return false;
		}

	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		// ADD MISSING CODE
		if(!isValidContent()) throw new StringIsNotSymmetricException("Action cannot be performed, String is not Symetric.");
		//ArrayList<String>exp=new ArrayList<>();
		String exp="";
		for (int i=0; i < s.length(); i++) { 
	        char c = s.charAt(i); 
	        if (Character.isLetter(c))
	           if (Character.isUpperCase(c))
	        	   			exp=exp+"<"+c;
	           else if (Character.isLowerCase(c))
	        	   exp=exp+c+">";
	                  
		}       
		return exp;  // need to change if necessary....
		
	}

}
