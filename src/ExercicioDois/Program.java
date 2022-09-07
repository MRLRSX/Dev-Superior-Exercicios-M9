package ExercicioDois;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import ExercicioDois.entities.Department;
import ExercicioDois.entities.HourContract;
import ExercicioDois.entities.Worker;
import ExercicioDois.entities.enums.WorkLevel;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String departmentName = entrada.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = entrada.nextLine();
		System.out.print("Level: ");
		String workerLevel = entrada.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = entrada.nextDouble();
		Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date yyyy-MM-dd");
			String dd = entrada.next();
			LocalDate contractDate = LocalDate.parse(dd);
			System.out.print("Value per hour: ");
			double valuePerHour = entrada.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = entrada.nextInt();
			HourContract contract = new HourContract(contractDate, hours, valuePerHour);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = entrada.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		entrada.close();
	}
}
