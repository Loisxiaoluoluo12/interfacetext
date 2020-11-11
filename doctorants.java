package pac1;

public class doctorants implements Stumaninter,Teamaninter {
	String name;
	String sex;
	int age;
	double fee;//每学期的学费
	double salary;//每月的薪水

	public void getsalsry(double z) {
		// TODO Auto-generated method stub
		
	}
	public void selectsalary(double r) {
		// TODO Auto-generated method stub
		
	}

	public void pay(double a) {
		// TODO Auto-generated method stub
		
	}

	public void select(double r) {
		// TODO Auto-generated method stub
		
	}
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setFeeWagearg(String a,String b) {           
		  fee = Double.parseDouble(a);
		  salary = Double.parseDouble(b);
		 }
	doctorants(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
}
