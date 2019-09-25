package convert;

import java.text.DecimalFormat;

public class Celsius {
	double T,C;
	String Celsius;
	
	public void SetCelsius(double T) {
		this.T = T;
	}

	public String getCelsius() {
		C = (T-32)/1.8;
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Celsius = formatter.format(C);
		return Celsius;
}
}
