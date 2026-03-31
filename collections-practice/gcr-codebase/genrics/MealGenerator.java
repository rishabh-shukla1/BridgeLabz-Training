package genrics;
import java.util.*;

interface MealPlan{
	
	String type();
}

class VegetarianMeal implements MealPlan{
	
	
    private String item;

    public VegetarianMeal(String item) {
        this.item = item;
    }


	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "VegetarianMeal";
	}
	
	public String getName() {
		return item;
	}
	
}
class VeganMeal implements MealPlan{
	
	private String item;

    public VeganMeal(String item) {
        this.item = item;
    }

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "VeganMeal";
	}
	
	public String getName() {
		return item;
	}
	
}

class Meal<T extends MealPlan>{
	private List<T> l =new ArrayList<>();
	
	void add(T item)
	{
		l.add(item);
	}
	
	 public List<T> show(){
		return l;
	}
	
}

class MealUtil {

public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        
        // Print whole list
        System.out.println("Meal List: " + meal.show());

        // Print items one by one
        System.out.println("Generated Meal Plan:");
        for (T m : meal.show()) {
            System.out.println(m.type());
        }
    }
}
public class MealGenerator {
	
	public static void main(String[] args) {
		
		  // Vegetarian Plan
        Meal<VegetarianMeal> vegMeal = new Meal<>();
        vegMeal.add(new VegetarianMeal("Paneer Curry"));
        vegMeal.add(new VegetarianMeal("Veg Biryani"));
        vegMeal.add(new VegetarianMeal("Dal Tadka"));

        // Vegan Plan
        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.add(new VeganMeal("Tofu Stir Fry"));
        veganMeal.add(new VeganMeal("Vegan Salad"));

        
        // Show all
        System.out.println("---- Vegetarian Plan ----");
        MealUtil.generateMeal(vegMeal);

        System.out.println("\n---- Vegan Plan ----");
        MealUtil.generateMeal(veganMeal);
    }
		

    }



