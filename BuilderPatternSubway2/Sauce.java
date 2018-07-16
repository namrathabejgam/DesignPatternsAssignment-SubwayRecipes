package BuilderPatternSubway2;

public class Sauce implements RecipeMaker {
    private Recipe recipe;
    private String size;
    public Sauce(String size)
    {
        this.recipe=new Recipe();
        this.size=size;
    }

    public void buildSize() {
        recipe.setSpecification(size);
    }
    public void buildCost() {
        if(size.equalsIgnoreCase("s"))
            recipe.setCost(5);
        else if(size.equalsIgnoreCase("m"))
            recipe.setCost(8);
        else if(size.equalsIgnoreCase("l"))
            recipe.setCost(10);
    }
    public Recipe getRecipe()
    {
        return this.recipe;
    }
}
