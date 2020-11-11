package pac1;

public class Test {
	public static final int paystart=5000;
	public static double ownfee(doctorants doctor){
		double ownfee=doctor.getFee()*12;
		return ownfee;
	}
	public static double ownSalary(doctorants doctor){
		double ownSalary=doctor.getSalary()*12;
		return ownSalary;
	}
	public static double imbalance(doctorants doctor){
		doctor.getFee();
		doctor.getSalary();
		double imbalance=doctor.getSalary()*12-doctor.getFee();
		return imbalance;
	}
	public static void taxa(doctorants stu) {
		stu.getSalary();
		double ownwage = stu.getSalary() - paystart;    //起缴
	    double tax = 0;   
	    if(ownwage > 0){
			if(ownwage <= 1500){
				tax = ownwage * 0.03;
			}else if(ownwage <= 4500){
				tax = 1500*0.03 + (ownwage-1500)*0.1;
			}else if(ownwage <= 9000){
				tax = 1500*0.03 + 3000*0.1 + (ownwage-4500)*0.2;
			}else if(ownwage <= 35000){
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + (ownwage-9000)*0.25;
			}else if(ownwage <= 55000){
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + (ownwage -35000)*0.3;
			}else if(ownwage <= 80000){
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + (ownwage-55000)*0.35;
			}else {
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + 25000*0.35 + (ownwage-80000)*0.45;
			}
			System.out.println("你应交的税为："+tax);
		}else{
			System.out.println("不需要缴税！");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doctorants doctor1=new doctorants("li","女",30);
		doctorants doctor2=new doctorants("zhang","男",19);
		Judge judge=new Judge();
		try {
				doctor1.setFeeWagearg(args[0], args[1]);
				doctor2.setFeeWagearg(args[2], args[3]);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			judge.judge(doctor1.salary,doctor1.fee,doctor2.salary,doctor2.fee);
		}catch(Myexception e){
			System.out.println("用户可能出现的问题：");
			System.out.println(e.Warn());
			System.exit(0);
		}
		System.out.println("姓名:"+doctor1.name+"性别"+doctor1.sex+"年龄"+doctor1.age+"学费"+doctor1.fee+"工资"+doctor1.salary);
		System.out.println("姓名:"+doctor2.name+"性别"+doctor2.sex+"年龄"+doctor2.age+"学费"+doctor2.fee+"工资"+doctor2.salary);
		
	}

}
