
public class Classroom {
         
	public static void main(String[] args) {
		// référence
		Wilder leidi = new Wilder( "Leidi" , true);
		
		// utilisation de getters
		System.out.println(leidi.whoAmI());

		System.out.println(leidi.getFirstname());
		Wilder yves = new Wilder( "Yves" , false);
		
		// utilisation de getters
		System.out.println(yves.whoAmI());
		
	}

}
