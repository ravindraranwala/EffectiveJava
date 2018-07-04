package org.effective.java.chapter.one;

import org.effective.java.chapter.one.NyPizza.Size;
import org.effective.java.chapter.one.Pizza.Topping;

public class NutritionFactsClient {

	public static void main(String[] args) {
		NutritionFactsTelescoping cocaColaTeles = new NutritionFactsTelescoping(240, 8, 100, 0, 35, 27);

		NutritionFactJavaBean nutritionFactJavaBean = new NutritionFactJavaBean();
		nutritionFactJavaBean.setServingSize(240);
		nutritionFactJavaBean.setServings(8);
		nutritionFactJavaBean.setCalories(100);
		nutritionFactJavaBean.setSodium(35);
		nutritionFactJavaBean.setCarbohydrate(27);

		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

		NyPizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
		Calzone calzone = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();
	}

}
