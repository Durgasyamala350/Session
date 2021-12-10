package Tasks;

import Tasks.Problem.Inner;

public class Problem1 {
	
	    static String s;
	    static class Inner {
	        void testMethod() {
	           s = "Set from Inner";
	           System.out.println(s);
	        }
	    }
	    public static void main(String[] args){
//	    	Problem1 obj=new Problem1();
	    	Problem1.Inner obj1=new Problem1.Inner();
	    	
	    	
	    	 obj1.testMethod();
	    	
	    }
		
	

}
