package prova3;

import java.util.Comparator;

public class TotalArrecadadoComparator implements Comparator<ECom> {

	@Override
	public int compare(ECom o1, ECom o2) {
		if (o1.totalArrecadado() > o2.totalArrecadado()) {
			return 1;
		}
		return -1;
	}
	
}
