package com.test.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAlternateValue {
	
	public static void main(String args[])
	{
		int seperator = 3;
		int incrementCounter = 0;
		
		int firstCounter = 0;
		int secondCounter = 3;
		
		FindAlternateValue obj = new FindAlternateValue();
		List<Employee> empList = obj.createEmployee();
		
		int nextSeperator = 3;
		
		obj.test();
	}
	
	public void test()
	{
		List<Employee> employeeList = createEmployee();;
		for(int i = 0; i < employeeList.size(); i++)
		{
		    Employee first = employeeList.get(i);
		    Employee second = null;
		    if(employeeList.size() > i + 3){
		        second = employeeList.get(++i); //Change here
		    }
		    System.out.println("First [" + first.getId() + "] - Second ");
		}
	}

	
	class Employee
	{
		int id;
		String name;
		int age;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
	
	public List<Employee> createEmployee()
	{
		List<Employee> eList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("cvd");
		emp1.setAge(23);
		
		eList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("sdsaa");
		emp2.setAge(37);
		
		eList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("vaq");
		emp3.setAge(61);
		eList.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setId(4);
		emp4.setName("fggf");
		emp4.setAge(38);
		eList.add(emp4);
		
		Employee emp5 = new Employee();
		emp5.setId(5);
		emp5.setName("asjjj");
		emp5.setAge(28);
		eList.add(emp5);
		
		Employee emp6 = new Employee();
		emp6.setId(6);
		emp6.setName("sdaa");
		emp6.setAge(76);
		
		eList.add(emp6);
		
		Employee emp7 = new Employee();
		emp7.setId(7);
		emp7.setName("assdsd");
		emp7.setAge(54);
		eList.add(emp7);
		
		Employee emp8 = new Employee();
		emp8.setId(8);
		emp8.setName("jjhjk");
		emp8.setAge(45);
		eList.add(emp8);
		
		Employee emp9 = new Employee();
		emp9.setId(9);
		emp9.setName("copp");
		emp9.setAge(63);
		eList.add(emp9);
		
		Employee emp10 = new Employee();
		emp10.setId(10);
		emp10.setName("jhkjh");
		emp10.setAge(25);
		eList.add(emp10);
		
		Employee emp11 = new Employee();
		emp11.setId(11);
		emp11.setName("2111");
		emp11.setAge(28);
		eList.add(emp11);
		
		Employee emp12 = new Employee();
		emp12.setId(12);
		emp12.setName("asd");
		emp12.setAge(25);
		eList.add(emp12);

		
		return eList;
	}
	
	
	public static <T>List<List<T>> chopIntoParts( final List<T> ls, final int iParts )
	{
	    final List<List<T>> lsParts = new ArrayList<List<T>>();
	    final int iChunkSize = ls.size() / iParts;
	    int iLeftOver = ls.size() % iParts;
	    int iTake = iChunkSize;

	    for( int i = 0, iT = ls.size(); i < iT; i += iTake )
	    {
	        if( iLeftOver > 0 )
	        {
	            iLeftOver--;

	            iTake = iChunkSize + 1;
	        }
	        else
	        {
	            iTake = iChunkSize;
	        }

	        lsParts.add( new ArrayList<T>( ls.subList( i, Math.min( iT, i + iTake ) ) ) );
	    }

	    return lsParts;
	}

}
