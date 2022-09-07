package ExercicioDois.entities;


import java.time.LocalDate;

public class HourContract {
  
	private LocalDate localDate;
	private Integer hours;
    private Double valuePerHour;
    
    public HourContract() {}
    
    public HourContract(LocalDate localDate, Integer hours, Double valuePerHour) {
		this.localDate = localDate;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double totalValue() {
    	return this.valuePerHour * hours;
    }
  
}
