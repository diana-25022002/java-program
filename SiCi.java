import java.util.Scanner;

public class SiCi {

	public static void main(String[] args) {
		double pr, rs, t,sim,com;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Principal amount:");
		pr=input.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		rs=input.nextDouble();
		System.out.println("Enter the no.of.years:");
		t=input.nextDouble();
		sim=(pr*t*rs)/100;
		com=pr*Math.pow(1.0+rs/100.0,t)-pr;
		System.out.println("Simple Interest="+sim);
		System.out.println("Compound Interest="+com);
		

	}

}
