package BuilderPatternSubway2;

public class Bread implements RecipeMaker {
    private Recipe recipe;
    private String size;
    public Bread(String size)
    {
        this.recipe=new Recipe();
        this.size=size;
    }

    public void buildSize() {
        recipe.setSpecification(this.size);

    }
    public void buildCost() {
        if(this.size.equalsIgnoreCase("s"))
            recipe.setCost(10);
        else if(size.equalsIgnoreCase("m"))
            recipe.setCost(15);
        else if(size.equalsIgnoreCase("l"))
            recipe.setCost(20);
    }
    public Recipe getRecipe()
    {
        return this.recipe;
    }

}
