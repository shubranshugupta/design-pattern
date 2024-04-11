import recipe.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        RecipeTemplate pastaRecipe = new PastaRecipe();
        pastaRecipe.cook();

        RecipeTemplate pizzaRecipe = new PizzaRecipe();
        pizzaRecipe.cook();
    }
}
