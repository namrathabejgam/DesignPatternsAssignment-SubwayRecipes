package BuilderPatternSubway2;

public class Addon implements RecipeMaker {
    private Recipe recipe;
    private String size;
    public Addon(String size)
    {
        this.recipe=new Recipe();
        this.size=size;
    }

    public void buildSize() {
        recipe.setSpecification(size);
    }
    public void buildCost() {
        if(this.size.equalsIgnoreCase("s"))
            recipe.setCost(1);
        else if(size.equalsIgnoreCase("m"))
            recipe.setCost(2);
        else if(size.equalsIgnoreCase("l"))
            recipe.setCost(3);
    }
    public Recipe getRecipe()
    {
        return this.recipe;
    }
}
