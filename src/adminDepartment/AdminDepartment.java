package adminDepartment;
import superClass.*;

public class AdminDepartment extends superDepartment {
	//method1
	public String departmentName() {
		String a1 = "Admin Department";
		return a1;
	}
	//method2
	public String getTodaysWork() {
		String a2 = "Complete your documents submission";
		return a2;
	}
	//method3
	public String getWorkDeadline() {
		String a3="Complete by EOD";
		return a3;
	}
}
