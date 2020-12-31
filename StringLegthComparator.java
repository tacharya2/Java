package udemy;

import java.util.Comparator;

public class StringLegthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value1.length(), value2.length());
	}

}
