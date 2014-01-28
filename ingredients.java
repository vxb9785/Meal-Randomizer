//Starting with an arraylist, hashmap later to make it more efficient?
import java.util.*;


public class Ingredients {
	public List<String> ingredientList = new ArrayList<String>();
	public List<String> ingredientsChosen = new ArrayList<String>();
	
	public Ingredients(){
		int x = 0;
		String temp;
		Scanner user_input = new Scanner( System.in );
		String ingredient;
		System.out.print("Enter an ingredient you have: ");
		ingredient=user_input.next();
		while(x<ingredientList.size()){
			if(ingredient.equals(ingredientList.get(x))){
				temp = ingredientList.get(x);
				ingredientsChosen.add(temp);
			}
			else{
				System.out.println("Ingredient not on list");
			}
		}
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

