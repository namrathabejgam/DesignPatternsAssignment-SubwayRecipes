package BuilderPatternSubway2;

public class Salad implements RecipeMaker {
    private Recipe recipe;
    private String size;
    public Salad(String size)
    {
        this.recipe=new Recipe();
        this.size=size;
    }

    public void buildSize() {
        recipe.setSpecification(size);
    }
    public void buildCost() {
        if(this.size.equalsIgnoreCase("s"))
            recipe.setCost(20);
        else if(size.equalsIgnoreCase("m"))
            recipe.setCost(25);
        else if(size.equalsIgnoreCase("l"))
            recipe.setCost(30);
    }
    public Recipe getRecipe()
    {
        return this.recipe;
    }
}
