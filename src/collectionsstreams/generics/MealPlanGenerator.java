package collectionsstreams.generics;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}

public class MealPlanGenerator {

    static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated: " + meal.getMealType() + " Meal Plan");
    }

    public static void main(String[] args) {
        Meal<VeganMeal> meal = new Meal<>(new VeganMeal());
        generateMeal(meal.plan);
    }
}
