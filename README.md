# interfacetext
11月9日Java实验课作业
# 实验内容
1.project：Interfacetext 
2.Package: pac1
3.Class:doctorants   Judge   Myexception   Test    Teamaninter  Stumaninter

(1)Stumaninter接口
* 定义学生管理接口。   
* 定义了两个抽象的方法，缴纳学费和查询学费的方法。  

(2)Teananinter接口
* 定义学生管理接口。     
* 定义了两个抽象的方法，发放薪水和查询薪水的方法。       

(3)doctorants类  
* doctorants类中先定义doctorants的属性：name sex age fee salary
* 建立doctorants的构造方法
* 得到属性相关的set和get方法用来传值
* 创建setFeeWagearg（String a,String b）方法，用来通过args进行输入值
* 实现Stumaninter和Teananinter的接口 

(4)Myexception类
*　创建一个异常类继承自异常。
*  创建Myexception()和Warn()方法，返回异常类型。

(5) Judge类
* 创建judge()方法，当不满足条件是，new一个自己的异常。    

(5)Tst类   
* Test类中分别实例化doctorants  Judge  
* 通过调用get和set方法，构造方法进行传值   
* 创建ownfee(),ownSalary(),imbalance(),taxa()四个方法  
* ownfee()用来返回年花费  
* ownSalary()用来返回年薪资  
* imbalance()用来获得花费与薪资之间的差值  
* taxa()用来算是否需要缴税，缴税费用是多少  

## 实验目的
1.Java中抽象类和抽象方法的定义； 
2.Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3.异常的使用方法，并在程序中根据输入情况做异常处理

## 实验过程
1.分析题目的相关需求。  
2.首先建立两个接口，再建立四个不同的类。  
3.完善类中的内容。   
4.调用类中的相关信息。  
5.运行程序，展示结果。  
## 核心方法
(1)接口定义抽象方法
```
	public abstract void select(double r);
```
(2)自动重写接口中的方法
```
public void getsalsry(double z) {
		// TODO Auto-generated method stub
		
	}
```
  (3)通过args数组传入数据
```
	public void setFeeWagearg(String a,String b) {           
		  fee = Double.parseDouble(a);
		  salary = Double.parseDouble(b);
		 }
```
(4)new一个自己的异常
```
	public void judge(double salary,double fee,double salary1,double fee1) throws Myexception {// 抛出自己的异常类 
	    if (salary < 0 ) { 
	      // 金额不合法时抛出异常 
	      throw new Myexception(salary);// new一个自己的异常类 
	    }
```
(5)返回自己的异常
```
public Myexception(double salary) {
 	mesage = "工资不能为负";
}
public String Warn() { 
	return message; 
} 
```
(6)求缴税费用
```
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
```

## 实验结果
(1)    
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/45NBuzDIW489QBoVep5mcSQ3w6maRFJlTfiVHkCPxMIQGCDh4YLZGDkuimWKwckKEJxFVhi7mnBstERLGQrDMIPSJjZDiESwVDn.whGH9Oc!/b&bo=JwJvAAAAAAADF3g!&rf=viewer_4)    
(2)    
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/45NBuzDIW489QBoVep5mccBdxxdd*PZOgzA7Iiq1ekumnzBlaMAFVssbN3O2WPGexmcwKk79RswjXISq7hEz2wi7WeDAHQzmqo9EFvCfKF8!/b&bo=0QFzAAAAAAADF5E!&rf=viewer_4)    
(3)     
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/45NBuzDIW489QBoVep5mccBdxxdd*PZOgzA7Iiq1ekuNPGi3GqzmhwfLtwIV2LxkxKqaheTXzR9Bwjq5VBgFJMpAtKHnD815zfibxjiifgU!/b&bo=8gFnAAAAAAADF6Y!&rf=viewer_4)   

## 实验感想 
在该实验中，我掌握final和static使用要求，掌握了接口的定义，学会了异常的处理。希望在以后的学习中能够了解到更多的编程信息.   
