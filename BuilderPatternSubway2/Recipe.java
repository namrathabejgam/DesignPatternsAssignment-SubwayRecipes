package BuilderPatternSubway2;

public class Recipe implements RecipeSpecifications {
    public String size;
    public int cost;

    @Override
    public void setSpecification(String size) {
        this.size=size;
    }
    public void setCost(int cost) {
        this.cost=cost;
    }
    public String getSize()
    {
        return size;
    }
    public int getCost()
    {
        return cost;
    }
}
