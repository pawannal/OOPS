package CompanyPWN.Inc.parentClass;

public class Driver {
	public static void main(String[] args) {
	
		
		adminDepartment obj2 = new adminDepartment();
		HrDepartment obj3 = new HrDepartment();
		TechDepartment obj4 = new TechDepartment();
		obj2.departmentName();
		System.out.println("Welcome to " + obj2.departmentName());
		obj2.getTOdayWork();
		System.out.println(obj2.getTOdayWork());
		obj2.getWorkDeadline();
		System.out.println(obj2.getWorkDeadline());
		obj2.isTodayAHoliday();
		System.out.println(obj2.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + obj3.departmentName());
		obj3.doActivity();
		System.out.println(obj3.doActivity());
		obj3.getTodaysWork();
		System.out.println(obj3.getTodaysWork());
		obj3.getWorkDeadline();
		System.out.println(obj3.getWorkDeadline());
		obj3.isTodayAHoliday();
		System.out.println(obj3.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + obj4.departmentName());
		obj4.getTodaysWork();
		System.out.println(obj4.getTodaysWork());
		obj4.getWorkDeadline();
		System.out.println(obj4.getWorkDeadline());
		obj4.getTechStackInformation();
		System.out.println(obj4.getTechStackInformation());
		obj3.isTodayAHoliday();
		System.out.println(obj4.isTodayAHoliday());

	}

}
