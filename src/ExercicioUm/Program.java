package ExercicioUm;

import java.util.Date;
import java.util.Locale;

import ExercicioUm.entities.Order;
import ExercicioUm.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
      Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
      System.out.println(order);
	}
}
