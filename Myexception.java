package pac1;

public class Myexception extends Exception {
	private static final long serialVersionUID = 1L;
	String message; 
	public Myexception(double salary) {
		  message = "工资不能为负";
	}
	public String Warn() { 
	     return message; 
	} 
	public Myexception() {
	     super();
	}
	public Myexception(String str) {
	     super(str);
	}
}
