
public class Compound {

	public static void main(String[] args) 
	{
		double amt;
		int p=20000;
		int r=6;
		int n=1;
		int t=3;
		double intrest;
		
		amt=p*Math.pow(1+(r/n),n*t);
		System.out.println("Compund amount is="+amt);
		intrest=amt-p;
		System.out.println("Intrest amount is="+intrest);
		

	}

}
