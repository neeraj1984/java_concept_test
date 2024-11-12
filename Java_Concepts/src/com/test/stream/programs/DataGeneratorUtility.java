package com.test.stream.programs;

import java.util.ArrayList;
import java.util.List;

public class DataGeneratorUtility {
	
	public static List<EmployeeData> getAllEmployee(){
		
		List<EmployeeData> empList = new ArrayList<EmployeeData>();
		
		empList.add(getEmployee(1, "Neeraj", 120000d, "IT", "A", "M"));
		empList.add(getEmployee(2, "Ramesh", 35000d, "Finance", "B", "M"));
		empList.add(getEmployee(3, "Rajesh", 26000d, "HR", "A", "M"));
		empList.add(getEmployee(4, "Kishore", 5000d, "IT", "B", "M"));
		empList.add(getEmployee(5, "Amit", 90000d, "Marketting", "C", "M"));
		empList.add(getEmployee(6, "Ram", 85000d, "HR", "B", "M"));
		empList.add(getEmployee(7, "Praveen", 170000d, "IT", "A", "M"));
		empList.add(getEmployee(8, "Haritha", 82000d, "Finance", "B", "F"));
		empList.add(getEmployee(9, "Swati", 58000d, "IT", "A", "F"));
		empList.add(getEmployee(10, "Prakash", 189000d, "Admin", "A", "M"));
		empList.add(getEmployee(11, "Sai", 29000d, "Marketting", "B", "M"));
		empList.add(getEmployee(12, "Ramya", 77000d, "HR", "C", "F"));
		
		
		return empList;
	}
	
	public static List<EmployeeData> getAllEmployee2(){
		
		List<EmployeeData> empList = new ArrayList<EmployeeData>();
		empList.add(getEmployee(1, "Alice Johnson", 60000.0, "IT", "A", "F"));
        empList.add(getEmployee(2, "Bob Smith", 55000.0, "IT", "B", "M"));
        empList.add(getEmployee(3, "Charlie Brown", 45000.0, "IT", "C", "M"));
        empList.add(getEmployee(4, "David Wilson", 70000.0, "Sales", "A", "M"));
        empList.add(getEmployee(5, "Eva Green", 80000.0, "IT", "A", "F"));
        empList.add(getEmployee(6, "Frank White", 48000.0, "HR", "C", "M"));
        empList.add(getEmployee(7, "Grace Lee", 52000.0, "IT", "B", "F"));
        empList.add(getEmployee(8, "Hannah Adams", 62000.0, "Finance", "A", "F"));
        empList.add(getEmployee(9, "Ivy Martinez", 75000.0, "Sales", "A", "F"));
        empList.add(getEmployee(10, "Jack Thompson", 49000.0, "Marketing", "C", "M"));
        empList.add(getEmployee(11, "Kathy Miller", 53000.0, "IT", "B", "F"));
        empList.add(getEmployee(12, "Leo Harris", 67000.0, "IT", "A", "M"));
        empList.add(getEmployee(13, "Mia Clark", 71000.0, "Finance", "A", "F"));
        empList.add(getEmployee(14, "Nina Lewis", 72000.0, "Sales", "A", "F"));
        empList.add(getEmployee(15, "Oscar Walker", 58000.0, "Marketing", "B", "M"));
        empList.add(getEmployee(16, "Paul Hall", 60000.0, "IT", "A", "M"));
        empList.add(getEmployee(17, "Quinn Young", 65000.0, "Finance", "B", "O"));
        empList.add(getEmployee(18, "Rita King", 40000.0, "HR", "C", "F"));
        empList.add(getEmployee(19, "Steve Scott", 72000.0, "Sales", "A", "M"));
        empList.add(getEmployee(20, "Tina Hill", 50000.0, "IT", "B", "F"));
        empList.add(getEmployee(21, "Uma Wright", 55000.0, "HR", "B", "F"));
        empList.add(getEmployee(22, "Vera Lopez", 63000.0, "IT", "A", "F"));
        empList.add(getEmployee(23, "Will Harris", 58000.0, "Finance", "B", "M"));
        empList.add(getEmployee(24, "Xena Turner", 47000.0, "Sales", "C", "F"));
        empList.add(getEmployee(25, "Yara Nelson", 59000.0, "Finance", "B", "F"));
        empList.add(getEmployee(26, "Zane Carter", 61000.0, "IT", "A", "M"));
        empList.add(getEmployee(27, "Alice Brown", 64000.0, "HR", "A", "F"));
        empList.add(getEmployee(28, "Brian Davis", 56000.0, "Finance", "B", "M"));
        empList.add(getEmployee(29, "Catherine Miller", 49000.0, "Sales", "C", "F"));
        empList.add(getEmployee(30, "Daniel Lee", 72000.0, "IT", "A", "M"));
        empList.add(getEmployee(31, "Eva Johnson", 50000.0, "Finance", "C", "F"));
        empList.add(getEmployee(32, "Felix Martinez", 69000.0, "IT", "A", "M"));
        empList.add(getEmployee(33, "Grace Wilson", 63000.0, "Finance", "A", "F"));
        empList.add(getEmployee(34, "Henry Lee", 56000.0, "Sales", "B", "M"));
        empList.add(getEmployee(35, "Isabella Clark", 73000.0, "Marketing", "A", "F"));
        empList.add(getEmployee(36, "James White", 48000.0, "HR", "C", "M"));
        empList.add(getEmployee(37, "Kylie Harris", 71000.0, "IT", "A", "F"));
        empList.add(getEmployee(38, "Leo Carter", 54000.0, "Finance", "B", "M"));
        empList.add(getEmployee(39, "Mia Thompson", 63000.0, "Sales", "A", "F"));
        empList.add(getEmployee(40, "Noah Johnson", 75000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(41, "Olivia Scott", 68000.0, "HR", "A", "F"));
        empList.add(getEmployee(42, "Paul Young", 70000.0, "IT", "A", "M"));
        empList.add(getEmployee(43, "Quinn Brown", 56000.0, "IT", "C", "O"));
        empList.add(getEmployee(44, "Rita Lee", 60000.0, "Sales", "B", "F"));
        empList.add(getEmployee(45, "Steve Harris", 49000.0, "Marketing", "C", "M"));
        empList.add(getEmployee(46, "Tina King", 57000.0, "HR", "B", "F"));
        empList.add(getEmployee(47, "Uma Martinez", 62000.0, "IT", "A", "F"));
        empList.add(getEmployee(48, "Victor Carter", 53000.0, "Finance", "B", "M"));
        empList.add(getEmployee(49, "Wendy Wilson", 71000.0, "Sales", "A", "F"));
        empList.add(getEmployee(50, "Xander Davis", 80000.0, "IT", "A", "M"));
        empList.add(getEmployee(51, "Yara Smith", 49000.0, "IT", "C", "F"));
        empList.add(getEmployee(52, "Zara White", 56000.0, "IT", "B", "F"));
        empList.add(getEmployee(53, "Alice King", 60000.0, "Finance", "A", "F"));
        empList.add(getEmployee(54, "Brad Lee", 67000.0, "IT", "A", "M"));
        empList.add(getEmployee(55, "Cathy Martinez", 53000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(56, "David Harris", 60000.0, "HR", "A", "M"));
        empList.add(getEmployee(57, "Eva Young", 72000.0, "IT", "A", "F"));
        empList.add(getEmployee(58, "Frank Thompson", 54000.0, "Finance", "B", "M"));
        empList.add(getEmployee(59, "Grace Johnson", 67000.0, "Sales", "A", "F"));
        empList.add(getEmployee(60, "Hannah Brown", 59000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(61, "Ian White", 80000.0, "HR", "A", "M"));
        empList.add(getEmployee(62, "Jack Wilson", 59000.0, "IT", "C", "M"));
        empList.add(getEmployee(63, "Kathy Harris", 65000.0, "Finance", "A", "F"));
        empList.add(getEmployee(64, "Leo King", 72000.0, "Sales", "A", "M"));
        empList.add(getEmployee(65, "Mia Davis", 56000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(66, "Nina Martinez", 48000.0, "HR", "C", "F"));
        empList.add(getEmployee(67, "Oscar Lee", 63000.0, "IT", "A", "M"));
        empList.add(getEmployee(68, "Paul Clark", 70000.0, "Finance", "A", "M"));
        empList.add(getEmployee(69, "Quinn White", 75000.0, "Sales", "A", "O"));
        empList.add(getEmployee(70, "Rita Brown", 57000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(71, "Sam Johnson", 60000.0, "HR", "B", "M"));
        empList.add(getEmployee(72, "Tina Harris", 72000.0, "IT", "A", "F"));
        empList.add(getEmployee(73, "Uma Lee", 49000.0, "Finance", "C", "F"));
        empList.add(getEmployee(74, "Victor King", 65000.0, "Sales", "A", "M"));
        empList.add(getEmployee(75, "Wendy Young", 58000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(76, "Xena Smith", 60000.0, "HR", "A", "F"));
        empList.add(getEmployee(77, "Yara Wilson", 67000.0, "IT", "B", "F"));
        empList.add(getEmployee(78, "Zane Martinez", 49000.0, "Finance", "C", "M"));
        empList.add(getEmployee(79, "Alice Thompson", 55000.0, "Sales", "A", "F"));
        empList.add(getEmployee(80, "Brian Clark", 80000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(81, "Catherine Brown", 52000.0, "IT", "B", "F"));
        empList.add(getEmployee(82, "Daniel White", 59000.0, "IT", "A", "M"));
        empList.add(getEmployee(83, "Eva Harris", 63000.0, "Finance", "A", "F"));
        empList.add(getEmployee(84, "Felix Young", 74000.0, "Sales", "A", "M"));
        empList.add(getEmployee(85, "Grace Wilson", 61000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(86, "Hannah Johnson", 60000.0, "HR", "C", "F"));
        empList.add(getEmployee(87, "Ian Martinez", 72000.0, "IT", "A", "M"));
        empList.add(getEmployee(88, "Jack King", 55000.0, "Finance", "B", "M"));
        empList.add(getEmployee(89, "Kathy Brown", 68000.0, "Sales", "A", "F"));
        empList.add(getEmployee(90, "Leo Davis", 64000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(91, "Mia Harris", 50000.0, "IT", "C", "F"));
        empList.add(getEmployee(92, "Nina White", 67000.0, "IT", "B", "F"));
        empList.add(getEmployee(93, "Oscar Lee", 72000.0, "Finance", "A", "M"));
        empList.add(getEmployee(94, "Paul Martinez", 49000.0, "Sales", "C", "M"));
        empList.add(getEmployee(95, "Quinn Clark", 60000.0, "Finance", "B", "F"));
        empList.add(getEmployee(96, "Rita Johnson", 56000.0, "Finance", "A", "F"));
        empList.add(getEmployee(97, "Steve Brown", 60000.0, "IT", "A", "M"));
        empList.add(getEmployee(98, "Tina Harris", 65000.0, "Finance", "A", "F"));
        empList.add(getEmployee(99, "Uma Wilson", 72000.0, "Sales", "A", "F"));
        empList.add(getEmployee(100, "Victor Young", 58000.0, "Marketing", "B", "M"));
        empList.add(getEmployee(101, "Wendy Smith", 59000.0, "HR", "C", "F"));
        empList.add(getEmployee(102, "Xena Johnson", 70000.0, "IT", "A", "F"));
        empList.add(getEmployee(103, "Yara Brown", 54000.0, "Finance", "B", "F"));
        empList.add(getEmployee(104, "Zane Clark", 48000.0, "Sales", "C", "M"));
        empList.add(getEmployee(105, "Alice Miller", 67000.0, "Marketing", "A", "F"));
        empList.add(getEmployee(106, "Brad Davis", 62000.0, "Finance", "A", "M"));
        empList.add(getEmployee(107, "Cathy Lee", 56000.0, "IT", "B", "F"));
        empList.add(getEmployee(108, "David Young", 68000.0, "Finance", "A", "M"));
        empList.add(getEmployee(109, "Eva Brown", 74000.0, "Sales", "A", "F"));
        empList.add(getEmployee(110, "Felix Harris", 50000.0, "Marketing", "B", "M"));
        empList.add(getEmployee(111, "Grace Smith", 61000.0, "IT", "C", "F"));
        empList.add(getEmployee(112, "Hannah Wilson", 62000.0, "IT", "A", "F"));
        empList.add(getEmployee(113, "Ian Martinez", 57000.0, "Finance", "B", "M"));
        empList.add(getEmployee(114, "Jack Thompson", 70000.0, "Sales", "A", "M"));
        empList.add(getEmployee(115, "Kathy Lee", 59000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(116, "Leo Young", 74000.0, "Finance", "A", "M"));
        empList.add(getEmployee(117, "Mia Brown", 67000.0, "IT", "B", "F"));
        empList.add(getEmployee(118, "Nina Johnson", 62000.0, "Finance", "A", "F"));
        empList.add(getEmployee(119, "Oscar Smith", 49000.0, "Sales", "C", "M"));
        empList.add(getEmployee(120, "Paul Wilson", 70000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(121, "Quinn Lee", 58000.0, "HR", "B", "O"));
        empList.add(getEmployee(122, "Rita Brown", 54000.0, "IT", "C", "F"));
        empList.add(getEmployee(123, "Steve Martinez", 63000.0, "Finance", "A", "M"));
        empList.add(getEmployee(124, "Tina Harris", 71000.0, "Sales", "A", "F"));
        empList.add(getEmployee(125, "Uma Davis", 59000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(126, "Victor White", 65000.0, "HR", "A", "M"));
        empList.add(getEmployee(127, "Wendy Young", 58000.0, "IT", "B", "F"));
        empList.add(getEmployee(128, "Xena Brown", 49000.0, "Finance", "C", "F"));
        empList.add(getEmployee(129, "Yara Clark", 72000.0, "Sales", "A", "F"));
        empList.add(getEmployee(130, "Zane Davis", 60000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(131, "Alice King", 68000.0, "HR", "B", "F"));
        empList.add(getEmployee(132, "Brian Thompson", 70000.0, "IT", "A", "M"));
        empList.add(getEmployee(133, "Catherine Lee", 54000.0, "Finance", "C", "F"));
        empList.add(getEmployee(134, "Daniel White", 66000.0, "Sales", "A", "M"));
        empList.add(getEmployee(135, "Eva Harris", 50000.0, "Marketing", "B", "F"));
        empList.add(getEmployee(136, "Felix Johnson", 63000.0, "HR", "A", "M"));
        empList.add(getEmployee(137, "Grace Martinez", 55000.0, "IT", "B", "F"));
        empList.add(getEmployee(138, "Hannah Brown", 72000.0, "Finance", "A", "F"));
        empList.add(getEmployee(139, "Ian Smith", 49000.0, "Sales", "C", "M"));
        empList.add(getEmployee(140, "Jack Wilson", 70000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(141, "Kathy Young", 59000.0, "HR", "B", "F"));
        empList.add(getEmployee(142, "Leo White", 67000.0, "IT", "A", "M"));
        empList.add(getEmployee(143, "Mia Davis", 64000.0, "Finance", "A", "F"));
        empList.add(getEmployee(144, "Nina Clark", 58000.0, "Sales", "C", "F"));
        empList.add(getEmployee(145, "Oscar Martinez", 74000.0, "Marketing", "A", "M"));
        empList.add(getEmployee(146, "Paul Johnson", 60000.0, "HR", "B", "M"));
        empList.add(getEmployee(147, "Quinn Smith", 63000.0, "IT", "A", "O"));
        empList.add(getEmployee(148, "Rita Brown", 68000.0, "Finance", "A", "F"));
        empList.add(getEmployee(149, "Steve Harris", 57000.0, "Sales", "B", "M"));
        empList.add(getEmployee(150, "Tina Wilson", 49000.0, "Marketing", "C", "F"));
		
        return empList;
	}
	
	public static EmployeeData getEmployee(Integer employeeId,String empName,Double salary,String department,String grade,String gender) {
		
		EmployeeData emp = new EmployeeData();
		emp.setEmployeeId(employeeId);
		emp.setEmpName(empName);
		emp.setSalary(salary);
		emp.setDepartment(department);
		emp.setGrade(grade);
		emp.setGender(gender);		
		
		return emp;
	}
	
	public static List<PersonData> getAllPeople(){
		
		List<PersonData> peopleList = new ArrayList<PersonData>();
		
		peopleList.add(getPerson("Neeraj", "PJR Enclave", "Hyderabad", "500050", 32, true, "M"));
		peopleList.add(getPerson("Tinu", "Sarita Vihar", "Delhi", "100150", 41, true, "M"));
		peopleList.add(getPerson("Gopal", "Road number 2", "Mumbai", "201060", 28, false, "M"));
		peopleList.add(getPerson("Pooja", "Sivaji Road", "Pune", "200230", 29, true, "F"));
		peopleList.add(getPerson("Manish", "Kondapur", "Hyderabad", "500035", 21, false, "M"));
		peopleList.add(getPerson("Sneha", "Lodi Colony", "Delhi", "100025", 22, true, "F"));
		peopleList.add(getPerson("Rajeev", "Miyapur", "Hyderabad", "500040", 35, true, "M"));
		peopleList.add(getPerson("Rani", "Malad Road", "Mumbai", "200010", 25, true, "F"));
		peopleList.add(getPerson("Swati", "Laxmi Nagar", "Delhi", "120190", 32, true, "F"));
		peopleList.add(getPerson("Mandy", "Netaji Marg", "Kolkata", "300040", 28, false, "M"));
		peopleList.add(getPerson("Prakash", "Chanda Nagar", "Hyderabad", "500050", 30, true, "M"));
		peopleList.add(getPerson("Satish", "Road number 10", "Pune", "200110", 34, true, "M"));
		peopleList.add(getPerson("Jugal", "Vasant Vihar", "Delhi", "110040", 28, false, "M"));
		peopleList.add(getPerson("Neha", "Madhapur", "Hyderabad", "500030", 30, true, "F"));
		peopleList.add(getPerson("Hansal", "Gandhi Nagar", "Pune", "200110", 49, true, "M"));
		
		return peopleList;
	}
	
	public static List<PersonData> getAllPeople2(){

		List<PersonData> peopleList = new ArrayList<PersonData>();
		
        peopleList.add(getPerson("Alice", "123 Maple St", "Springfield", "12345", 28, true, "F"));
        peopleList.add(getPerson("Bob", "456 Oak St", "Rivertown", "23456", 34, true, "M"));
        peopleList.add(getPerson("Charlie", "789 Pine St", "Hilltop", "34567", 22, false, "M"));
        peopleList.add(getPerson("David", "135 Cedar St", "Lakeview", "45678", 45, true, "M"));
        peopleList.add(getPerson("Eva", "246 Birch St", "Sunnyvale", "56789", 30, true, "F"));
        peopleList.add(getPerson("Frank", "357 Elm St", "Greenville", "67890", 27, true, "M"));
        peopleList.add(getPerson("Grace", "468 Spruce St", "Easttown", "78901", 24, false, "F"));
        peopleList.add(getPerson("Hannah", "579 Ash St", "Westfield", "89012", 39, true, "F"));
        peopleList.add(getPerson("Ian", "680 Willow St", "Northtown", "90123", 41, true, "M"));
        peopleList.add(getPerson("Jack", "791 Chestnut St", "Southside", "01234", 36, true, "M"));
        peopleList.add(getPerson("Kathy", "902 Poplar St", "Seaside", "12356", 29, true, "F"));
        peopleList.add(getPerson("Leo", "213 Maple St", "Hometown", "23467", 32, false, "M"));
        peopleList.add(getPerson("Mia", "324 Oak St", "Clearwater", "34578", 27, true, "F"));
        peopleList.add(getPerson("Noah", "435 Pine St", "Porttown", "45689", 50, true, "M"));
        peopleList.add(getPerson("Olivia", "546 Cedar St", "Woodville", "56790", 22, false, "F"));
        peopleList.add(getPerson("Paul", "657 Birch St", "Mountainview", "67801", 33, true, "M"));
        peopleList.add(getPerson("Quinn", "768 Elm St", "Valleytown", "78912", 26, false, "F"));
        peopleList.add(getPerson("Rita", "879 Spruce St", "Beachside", "89023", 37, true, "F"));
        peopleList.add(getPerson("Steve", "980 Ash St", "Forest City", "90134", 31, true, "M"));
        peopleList.add(getPerson("Tina", "101 Chestnut St", "Hillside", "01245", 29, true, "F"));
        peopleList.add(getPerson("Uma", "202 Maple St", "Oceanside", "12367", 28, false, "F"));
        peopleList.add(getPerson("Victor", "303 Oak St", "Newtown", "23478", 42, true, "M"));
        peopleList.add(getPerson("Wendy", "404 Pine St", "Hillcrest", "34589", 34, true, "F"));
        peopleList.add(getPerson("Xander", "505 Cedar St", "Shady Grove", "45690", 25, false, "M"));
        peopleList.add(getPerson("Yara", "606 Birch St", "Sunny Hills", "56701", 30, true, "F"));
        peopleList.add(getPerson("Zane", "707 Elm St", "Riverbend", "67812", 39, true, "M"));
        peopleList.add(getPerson("Alice", "819 Spruce St", "Cedar City", "78923", 41, true, "F"));
        peopleList.add(getPerson("Brad", "920 Ash St", "Lakewood", "89034", 55, true, "M"));
        peopleList.add(getPerson("Cathy", "101 Maple St", "Mountain City", "90145", 38, true, "F"));
        peopleList.add(getPerson("Daniel", "112 Oak St", "Southlake", "01256", 29, true, "M"));
        peopleList.add(getPerson("Eva", "123 Pine St", "Westlake", "12367", 31, false, "F"));
        peopleList.add(getPerson("Felix", "234 Cedar St", "Eastlake", "23478", 36, true, "M"));
        peopleList.add(getPerson("Gina", "345 Birch St", "Northlake", "34589", 23, false, "F"));
        peopleList.add(getPerson("Hank", "456 Elm St", "Center City", "45690", 48, true, "M"));
        peopleList.add(getPerson("Ivy", "567 Spruce St", "Hills City", "56701", 30, true, "F"));
        peopleList.add(getPerson("Jake", "678 Ash St", "Valley City", "67812", 42, false, "M"));
        peopleList.add(getPerson("Kelly", "789 Chestnut St", "Ocean City", "78923", 35, true, "F"));
        peopleList.add(getPerson("Leo", "890 Maple St", "Spring City", "89034", 29, false, "M"));
        peopleList.add(getPerson("Mona", "901 Oak St", "Sunrise", "90145", 31, true, "F"));
        peopleList.add(getPerson("Nate", "123 Pine St", "Riverside", "01256", 27, false, "M"));
        peopleList.add(getPerson("Ollie", "234 Cedar St", "Greenwood", "12367", 45, true, "M"));
        peopleList.add(getPerson("Pam", "345 Birch St", "Pleasant Valley", "23478", 36, true, "F"));
        peopleList.add(getPerson("Quinn", "456 Elm St", "Eagle Town", "34589", 38, true, "O"));
        peopleList.add(getPerson("Randy", "567 Spruce St", "Forest Grove", "45690", 50, true, "M"));
        peopleList.add(getPerson("Sara", "678 Ash St", "Hillview", "56701", 30, false, "F"));
        peopleList.add(getPerson("Tom", "789 Chestnut St", "Lakeside", "67812", 60, true, "M"));
        peopleList.add(getPerson("Ursula", "890 Maple St", "Clear Creek", "78923", 25, false, "F"));
        peopleList.add(getPerson("Vince", "901 Oak St", "Stone Ridge", "89034", 41, true, "M"));
        peopleList.add(getPerson("Will", "123 Pine St", "Sunset", "90145", 32, true, "M"));
        peopleList.add(getPerson("Xena", "234 Cedar St", "Maplewood", "01256", 26, false, "F"));
        peopleList.add(getPerson("Yasmin", "345 Birch St", "Brookstone", "12367", 27, true, "F"));
        peopleList.add(getPerson("Zach", "456 Elm St", "Canyon Creek", "23478", 34, true, "M"));
        peopleList.add(getPerson("Alice", "567 Spruce St", "Silver Lake", "34589", 29, true, "F"));
        peopleList.add(getPerson("Brian", "678 Ash St", "Cedar Grove", "45690", 42, true, "M"));
        peopleList.add(getPerson("Clara", "789 Chestnut St", "Pine Valley", "56701", 39, true, "F"));
        peopleList.add(getPerson("Daniel", "890 Maple St", "Oak Hill", "67812", 31, true, "M"));
        peopleList.add(getPerson("Ella", "901 Oak St", "Mapleton", "78923", 28, false, "F"));
        peopleList.add(getPerson("Finn", "123 Pine St", "Lakeshore", "89034", 45, true, "M"));
        peopleList.add(getPerson("Grace", "234 Cedar St", "Windsor", "90145", 37, true, "F"));
        peopleList.add(getPerson("Henry", "345 Birch St", "Green Valley", "01256", 50, false, "M"));
        peopleList.add(getPerson("Ivy", "456 Elm St", "Sunnyside", "12367", 34, true, "F"));
        peopleList.add(getPerson("Jack", "567 Spruce St", "Riverwalk", "23478", 39, true, "M"));
        peopleList.add(getPerson("Kylie", "678 Ash St", "Summit", "34589", 26, false, "F"));
        peopleList.add(getPerson("Leo", "789 Chestnut St", "Cedar Springs", "45690", 42, true, "M"));
        peopleList.add(getPerson("Maya", "890 Maple St", "Sunshine", "56701", 30, true, "F"));
        peopleList.add(getPerson("Nina", "901 Oak St", "Sierra", "67812", 32, true, "F"));
        peopleList.add(getPerson("Oscar", "123 Pine St", "Riverbend", "78923", 28, false, "M"));
        peopleList.add(getPerson("Paula", "234 Cedar St", "Clear Springs", "89034", 31, true, "F"));
        peopleList.add(getPerson("Quinn", "345 Birch St", "Mountain View", "90145", 49, true, "M"));
        peopleList.add(getPerson("Rita", "456 Elm St", "Eagle Valley", "01256", 55, true, "F"));
        peopleList.add(getPerson("Steve", "567 Spruce St", "Hilltop", "12367", 38, false, "M"));
        peopleList.add(getPerson("Tina", "678 Ash St", "Forest Park", "23478", 45, true, "F"));
        peopleList.add(getPerson("Ursula", "789 Chestnut St", "Lakewood", "34589", 27, false, "F"));
        peopleList.add(getPerson("Vera", "890 Maple St", "Pine Hill", "45690", 26, true, "F"));
        peopleList.add(getPerson("Wes", "901 Oak St", "Spring Garden", "56701", 35, true, "M"));
        peopleList.add(getPerson("Xander", "123 Pine St", "Cedar Falls", "67812", 40, true, "M"));
        peopleList.add(getPerson("Yara", "234 Cedar St", "Riverstone", "78923", 33, true, "F"));
        peopleList.add(getPerson("Zane", "345 Birch St", "Meadow Creek", "89034", 48, true, "M"));
        peopleList.add(getPerson("Amy", "456 Elm St", "Valley Heights", "90145", 29, false, "F"));
        peopleList.add(getPerson("Ben", "567 Spruce St", "Sunnydale", "01256", 39, true, "M"));
        peopleList.add(getPerson("Cathy", "678 Ash St", "Lakeside", "12367", 27, true, "F"));
        peopleList.add(getPerson("Dan", "789 Chestnut St", "Westwood", "23478", 36, true, "M"));
        peopleList.add(getPerson("Eve", "890 Maple St", "Oakview", "34589", 28, false, "F"));
        peopleList.add(getPerson("Fred", "901 Oak St", "Greenfield", "45690", 42, true, "M"));
        peopleList.add(getPerson("Gina", "123 Pine St", "Hillview", "56701", 33, true, "F"));
        peopleList.add(getPerson("Hank", "234 Cedar St", "Cedar Valley", "67812", 30, true, "M"));
        peopleList.add(getPerson("Ivy", "345 Birch St", "Mountain Ridge", "78923", 39, false, "F"));
        peopleList.add(getPerson("Jack", "456 Elm St", "Sunset Valley", "89034", 34, true, "M"));
        peopleList.add(getPerson("Kathy", "567 Spruce St", "Forest Grove", "90145", 45, true, "F"));
        peopleList.add(getPerson("Leo", "678 Ash St", "Riverbank", "01256", 29, false, "M"));
        peopleList.add(getPerson("Mia", "789 Chestnut St", "Woodland", "12367", 32, true, "F"));
        peopleList.add(getPerson("Nina", "890 Maple St", "Springfield", "23478", 37, true, "F"));
        peopleList.add(getPerson("Oscar", "901 Oak St", "Mountain View", "34589", 55, true, "M"));
        peopleList.add(getPerson("Pam", "123 Pine St", "Cedar Springs", "45690", 60, true, "F"));
        peopleList.add(getPerson("Quinn", "234 Cedar St", "Sunny Grove", "56701", 49, false, "M"));
        peopleList.add(getPerson("Rita", "345 Birch St", "Riverbend", "67812", 31, true, "F"));
        peopleList.add(getPerson("Steve", "456 Elm St", "Maple Heights", "78923", 28, false, "M"));
        peopleList.add(getPerson("Tina", "567 Spruce St", "Spring Valley", "89034", 26, true, "F"));
        peopleList.add(getPerson("Uma", "678 Ash St", "Clearview", "90145", 30, true, "F"));
        peopleList.add(getPerson("Victor", "789 Chestnut St", "Cedar Lake", "01256", 34, true, "M"));
        peopleList.add(getPerson("Wendy", "890 Maple St", "Lakewood", "12367", 41, true, "F"));
        peopleList.add(getPerson("Xena", "901 Oak St", "Hilltop", "23478", 29, false, "F"));
        peopleList.add(getPerson("Yara", "123 Pine St", "Forest City", "34589", 35, true, "F"));
        peopleList.add(getPerson("Zane", "234 Cedar St", "Green Valley", "45690", 50, true, "M"));
        peopleList.add(getPerson("Alice", "345 Birch St", "River City", "56701", 28, true, "F"));
        peopleList.add(getPerson("Brian", "456 Elm St", "Valley Heights", "67812", 36, true, "M"));
        peopleList.add(getPerson("Cathy", "567 Spruce St", "Cedar Valley", "78923", 29, false, "F"));
        peopleList.add(getPerson("David", "678 Ash St", "Sunnydale", "89034", 45, true, "M"));
        peopleList.add(getPerson("Ella", "789 Chestnut St", "Hillview", "90145", 34, true, "F"));
        peopleList.add(getPerson("Frank", "890 Maple St", "Greenwood", "01256", 26, false, "M"));
        peopleList.add(getPerson("Gina", "901 Oak St", "Canyon City", "12367", 37, true, "F"));
        peopleList.add(getPerson("Hank", "123 Pine St", "Clearwater", "23478", 50, true, "M"));
        peopleList.add(getPerson("Ivy", "234 Cedar St", "Sunshine", "34589", 32, true, "F"));
        peopleList.add(getPerson("Jack", "345 Birch St", "Meadowvale", "45690", 28, false, "M"));
        peopleList.add(getPerson("Kathy", "456 Elm St", "Lakeview", "56701", 35, true, "F"));
        peopleList.add(getPerson("Leo", "567 Spruce St", "Maplewood", "67812", 39, true, "M"));
        peopleList.add(getPerson("Mia", "678 Ash St", "Cedar Springs", "78923", 30, true, "F"));
        peopleList.add(getPerson("Nina", "789 Chestnut St", "Pine Grove", "89034", 29, false, "F"));
        peopleList.add(getPerson("Oscar", "890 Maple St", "Forest Hills", "90145", 33, true, "M"));
        peopleList.add(getPerson("Pam", "901 Oak St", "Sunny Valley", "01256", 40, true, "F"));
        peopleList.add(getPerson("Quinn", "123 Pine St", "Hillcrest", "12367", 41, true, "M"));
        peopleList.add(getPerson("Rita", "234 Cedar St", "Cedar Valley", "23478", 38, true, "F"));
        peopleList.add(getPerson("Steve", "345 Birch St", "Riverwood", "34589", 36, true, "M"));
        peopleList.add(getPerson("Tina", "456 Elm St", "Meadow Creek", "45690", 29, false, "F"));
        peopleList.add(getPerson("Uma", "567 Spruce St", "Canyon Heights", "56701", 34, true, "F"));
        peopleList.add(getPerson("Victor", "678 Ash St", "Green City", "67812", 30, true, "M"));
        peopleList.add(getPerson("Wendy", "789 Chestnut St", "Sunshine", "78923", 28, false, "F"));
        peopleList.add(getPerson("Xena", "890 Maple St", "Maplewood", "89034", 35, true, "F"));
        peopleList.add(getPerson("Yara", "901 Oak St", "Sunny Heights", "90145", 37, true, "F"));
        peopleList.add(getPerson("Zane", "123 Pine St", "River Valley", "01256", 44, true, "M"));
        
        return peopleList;

	}
	
	public static PersonData getPerson(String name,String address,String city,String zipCode,Integer age,boolean employed,String gender) {
		
		PersonData person = new PersonData();
		person.setName(name);
		person.setAddress(address);
		person.setCity(city);
		person.setZipCode(zipCode);
		person.setAge(age);
		person.setEmployed(employed);
		person.setGender(gender);
		
		return person;
	}

}
