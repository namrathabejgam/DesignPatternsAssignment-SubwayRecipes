package BuilderPatternSubway2;

public class RecipeMakerImpl {
    private RecipeMaker recipeMaker;
    public RecipeMakerImpl(RecipeMaker recipeMaker)
    {
        this.recipeMaker=recipeMaker;
    }

    public Recipe getRecipe() {
        return recipeMaker.getRecipe();
    }

    public void makeRecipe() {
        this.recipeMaker.buildSize();
        this.recipeMaker.buildCost();
    }
}