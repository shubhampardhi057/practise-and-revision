package com.prowings.revision;

public class Employee {

	int id;
	String name;
	long salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {

		int res = 0;

		res = (int)(id * 31 + name.hashCode() * 31 + salary* 31);

		return res;

	}

	@Override
	public boolean equals(Object obj) {
		
		Employee obj1 = (Employee)obj;
		
		boolean res = false;
		
		if(this.id == obj1.id)
		{
			if(this.name.equals(obj1.name))
			{
				if(this.salary == obj1.salary)
				{
					res = true;
					
				}
				
			}
		}
		else {
			
			res = false;
		}
		
		return res;
		
		
	}

}
