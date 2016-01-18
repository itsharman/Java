package lab;

public class Annuity {
	
	static double PVann;
	
	public static void main(String[] args) {
	//PVann = PMT · ({[(1 + i)n - 1 - 1] / i } / (1 + i)n - 1 + 1)
	//PMT: periodic payment
	//i: periodic interest or compound rate
	//n: number of payments

	double PMT = 10000;
	double i = 0.08;
	double n = 20;
	
	PVann = PMT * ((Math.pow((1 + i), n) - 1 - 1) / i) / Math.pow((1 + i), n) - 1 + 1;
	
	System.out.println(PVann);

	}

}
