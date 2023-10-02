package generics;
import java.util.*;

public class UpperBoundWildCard {
	private List<? super Number> numbers = new ArrayList<>();
	
	public void addNumber(Number number) {
        numbers.add(number);
    }
	
	public double sum() {
        double sum = 0;
        for (Object number : numbers) {
            sum += ((Number) number).doubleValue();
        }
        return sum;
    }

    public void sort() {
    	Collections.sort(numbers, (a, b) -> 
    		Double.compare(
    				((Number) a).doubleValue(), ((Number) b).doubleValue()
    				)
    		);
    }

    public List<? super Number> getNumbers() {
        return numbers;
    }
}
