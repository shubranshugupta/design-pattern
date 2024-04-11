package recipe;

public class PastaRecipe extends RecipeTemplate {

    @Override
    public void prepareIngredients() {
        System.out.println("Gathering ingredients for pasta");
    }

    @Override
    public void cookIngredients() {
        System.out.println("Cooking pasta");
    }

}
