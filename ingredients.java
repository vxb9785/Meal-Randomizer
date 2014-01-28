import java.util.*;


public class Ingredients {
	public List<String> ingredientList = new ArrayList<String>();
	public List<String> ingredientsChosen = new ArrayList<String>();
	
	public Ingredients(){
		
	}
	public void CreateIngredient(String newIng){
		ingredientList.add(newIng);
	}
	public void UsualIngredients(){
		//Veggies
		ingredientList.add("Onions");
		ingredientList.add("Broccoli");
		ingredientList.add("Scallions");
		ingredientList.add("Grean Beans");
		//Proteins
		ingredientList.add("Chicken Breast");
		ingredientList.add("Ground Beef");
		ingredientList.add("Tilapia");
		ingredientList.add("Eggs");
		//Condiments
		ingredientList.add("Olive Oil");
		ingredientList.add("Soy Sauce");
		ingredientList.add("BBQ Sauce");
		ingredientList.add("Chilli Oil");
		ingredientList.add("Salt");
		ingredientList.add("Pepper");
	}


}

