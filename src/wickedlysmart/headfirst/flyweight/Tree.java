package wickedlysmart.headfirst.flyweight;

import java.time.LocalDate;
import java.time.Month;

public interface Tree {
	public void display(int x, int y);
	public default boolean isWithinRange(LocalDate aDate) {
		Month month = aDate.getMonth();
		return (month.getValue() > 2) && (month.getValue() < 11);
	}
}