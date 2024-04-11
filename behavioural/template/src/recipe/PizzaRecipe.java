package recipe;

public class PizzaRecipe extends RecipeTemplate {

    @Override
    public void prepareIngredients() {
        System.out.println("Gathering ingredients for pizza");
    }

    @Override
    public void cookIngredients() {
        System.out.println("Cooking pizza");
    }

}
