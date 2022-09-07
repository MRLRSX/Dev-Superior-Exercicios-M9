package ExercicioDois.entities;

import java.util.ArrayList;
import java.util.List;

import ExercicioDois.entities.enums.WorkLevel;

public class Worker {
	
	private String name;
	private WorkLevel level;
	private Double basySalary;
    private Department department;
	private List<HourContract> contract = new ArrayList<>();
	
	
	public Worker() {}
	
	public Worker(String name, WorkLevel level, Double basySalary, Department department) {
		this.name = name;
		this.level = level;
		this.basySalary = basySalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBasySalary() {
		return basySalary;
	}

	public void setBasySalary(Double basySalary) {
		this.basySalary = basySalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void addContract(HourContract contract){
	  this.contract.add(contract);	
	}
	
	public void removeContract(HourContract contract) {
		this.contract.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		
		return this.basySalary + contract.stream().filter(x -> x.getLocalDate().getMonthValue() == month && x.getLocalDate().getYear() == year)
				.map(x -> x.totalValue()).reduce((x ,y) -> x + y).orElse(0.0);
	}
	
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", basySalary=" + basySalary + "]";
	}
  
}
