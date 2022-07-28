import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tam,eng, phy, chem, math, comp;
		double total, average, percentage;
		Scanner mark = new Scanner(System.in);
		System.out.println("Enter your marks");
		System.out.println("Enter your  Tamil  mark:");
		tam=mark.nextFloat();
		System.out.println("Enter your  English  mark:");
		eng=mark.nextFloat();
		System.out.println("Enter your  physics mark:");
		phy=mark.nextFloat();
		System.out.println("Enter your  Chemistry  mark:");
		chem=mark.nextFloat();
		System.out.println("Enter  your maths mark:");
		math=mark.nextFloat();
		System.out.println("Enter your  computer  mark:");
	    comp=mark.nextFloat();
	    total=tam+eng+phy+chem+math+comp;
	    average=total/6.0;
	    percentage=(total/600.0)*100;
	    System.out.println("Total marks="+total);
	    System.out.println("Average="+average);
	    System.out.println("Percentage="+percentage);
	    
	    
		
		
		
		

	}

}


