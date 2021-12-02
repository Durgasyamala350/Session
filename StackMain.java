package Assignment;

public class StacKMain {
public static void main(String[] args){
	Stack st=new Stack();
	System.out.println("size of stack before adding data:"+st.size());
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	System.out.println("size of stack after adding data:" +st.size());
	st.pop();
	System.out.println("size of stack after adding data:" +st.size());
	st.peek();
	System.out.println("Data at peek is:" +st.peek());
	st.display();
	
	
	
}

}