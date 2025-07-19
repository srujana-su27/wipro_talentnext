package abstraction;

abstract class Compartment {
	public abstract String notice();
}
class FirstClass extends Compartment{
	@Override
	public String notice() {
		return "This is a First class Compartment.";
	}	
}
class Ladies extends Compartment{
	@Override
	public String notice() {
		return "This is a Ladies Compartment.";
	}	
}
class General extends Compartment{
	@Override
	public String notice() {
		return "This is a General Compartment.";
	}	
}
class Luggage extends Compartment{
	@Override
	public String notice() {
		return "This is a Luggage Compartment.";
	}	
}
class TestCompartment{
	public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];
		for(int i =0;i<10;i++) {
			int randomNumber = (int)(Math.random() * 4) + 1;
			
			switch(randomNumber) {
				
				case 1 :
					compartments[i] = new FirstClass();
					break;
				case 2:
					compartments[i] = new Ladies();
					break;
				case 3:
					compartments[i] = new General();
					break;
				case 4:
					compartments[i] = new Luggage();
					break;
				
			}
			System.out.println("Compartment " + (i + 1) + ": "+ compartments[i].notice());
		}
	}
}
