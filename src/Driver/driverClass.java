package Driver;
import techDepartment.*;
import hrDepartment.*;
import adminDepartment.*;



public class driverClass {
	public static void main(String[] args) {
	//
	//object of AdminDepartment class
	AdminDepartment o1 = new AdminDepartment();
	//
	//object of HrDepartment class
	HrDepartment o2 = new HrDepartment();
	//
	//object of TechDepartment class
	TechDepartment o3 = new TechDepartment();
	//
	//
	//Using functionalities of AdminDepartment class
	System.out.println(" Welcome to "+ o1.departmentName());
	System.out.println(o1.getTodaysWork());
	System.out.println(o1.getWorkDeadline());
	//Using isTodayAHoliday method from superDepartment class by extending it for sub class AdminDepartment
	//Super method - isTodayAHoliday
	//Super class - superDepartment
	//Child class - AdminDepartment
	System.out.println(o1.isTodayAHoliday());
	System.out.println(); //blankline
	//
	//
	//Using functionalities of HrDepartment class
	System.out.println(" Welcome to "+ o2.departmentName());
	System.out.println(o2.doActivity());
	System.out.println(o2.getTodaysWork());
	System.out.println(o2.getWorkDeadline());
	//Using isTodayAHoliday method from superDepartment class by extending it for sub class HrDepartment
	//Super method - isTodayAHoliday
	//Super class - superDepartment
	//Child class - HrDepartment
	System.out.println(o2.isTodayAHoliday());
	System.out.println(); //blankline
	//
	//
	//Using functionalities ofTechDepartment class
	System.out.println(" Welcome to "+ o3.departmentName());
	System.out.println(o3.getTodaysWork());
	System.out.println(o3.getWorkDeadline());
	System.out.println(o3.getTechStackInformation());
	//Using isTodayAHoliday method from superDepartment class by extending it for sub class TechDepartment
	//Super method - isTodayAHoliday
	//Super class - superDepartment
	//Child class - TechDepartment
	System.out.println(o3.isTodayAHoliday());
	System.out.println(); //blankline
	//
	//
	}
}
