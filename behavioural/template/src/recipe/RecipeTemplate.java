package recipe;

public abstract class RecipeTemplate {
    public final void cook() {
        prepareIngredients();
        cookIngredients();
        plate();
        serve();
    }

    public abstract void prepareIngredients();

    public abstract void cookIngredients();

    public void plate() {
        System.out.println("Plating the dish");
    }

    public void serve() {
        System.out.println("Serving the dish");
    }
}
