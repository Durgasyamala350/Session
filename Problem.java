package Tasks;

public class Problem {
	
	    String s;
	     class Inner {
	        void testMethod() {
	           s = "Set from Inner";
	           System.out.println(s);
	           
	        }
	    }
	     public static void main(String[] args){
	    	 Problem obj=new Problem();
	    	 Problem.Inner obj1=obj. new Inner();
	    	 obj1.testMethod();
	    	 
	     }
	

}
