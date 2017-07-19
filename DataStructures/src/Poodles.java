
public class Poodles extends Dogs {
	String food; 
	boolean isLactose; 
	int lifeExp; 
String funFact; 
int counter = 0; 

public Poodles(String food, boolean isLactose, int lifeExp, String funFact){
	super(food, isLactose, lifeExp);
   this.food = food; 
this.isLactose = isLactose;
this.lifeExp = lifeExp; 
this.funFact = funFact; 


}

public String funfact(String funFact) {
	counter ++; 
	String str = "The " + counter + " fun fact about this dog is: ";
	return str + funFact;
}

public void setLifeExp (int lifeExp){ 
	super.setLifeExp(lifeExp); 
	System.out.println("The life expectancy is clearly "+ lifeExp);
}
}


