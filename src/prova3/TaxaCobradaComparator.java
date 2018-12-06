package prova3;

import java.util.Comparator;

public class TaxaCobradaComparator implements Comparator<ECom> {

	@Override
	public int compare(ECom o1, ECom o2) {
		if (o1.getTaxa() > o2.getTaxa()) {
			return 1;
		}
		return -1;
	}

}
