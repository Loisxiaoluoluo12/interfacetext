package pac1;

public class Judge{

	public void judge(double salary,double fee,double salary1,double fee1) throws Myexception {// 抛出自己的异常类 
	    if (salary < 0 ) { 
	      // 金额不合法时抛出异常 
	      throw new Myexception(salary);// new一个自己的异常类 
	    }
	}

}
