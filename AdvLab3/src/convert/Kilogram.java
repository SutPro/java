package convert;

import java.text.DecimalFormat;

public class Kilogram {
	double W,K;
	String Kilogram;
	
	public void SetKilogram(double W) {
		this.W = W;
	}

	public String getKilogram() {
		K = W/2.20;
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Kilogram = formatter.format(K);
		return Kilogram;
	}
}
