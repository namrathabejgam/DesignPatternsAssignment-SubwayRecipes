package BuilderPatternSubway2;
import java.util.Scanner;
public class ComputeCost {
    public static void main(String[] args)
    {
        int final_cost=0;
        System.out.println("Wanna have bread?(y/n)");
        Scanner scanner=new Scanner(System.in);
        String bc=scanner.nextLine();
        if(bc.equalsIgnoreCase("y")) {
            System.out.println("Which size would you like to have?(s/m/l)");
            String size=scanner.nextLine();
            Recipe sample=new Recipe();
            RecipeMaker recipeMaker = new Bread(size);
            RecipeMakerImpl builder1=new RecipeMakerImpl(recipeMaker);
            builder1.makeRecipe();
            Recipe item1=builder1.getRecipe();
            //System.out.println(item1.getCost());
            final_cost+=item1.getCost();
        }
        System.out.println("Wanna have salad?(y/n)");
        String sc=scanner.nextLine();
        if(sc.equalsIgnoreCase("y")) {
            System.out.println("Which size would you like to have?(s/m/l)");
            String size=scanner.nextLine();
            RecipeMaker recipeMaker = new Salad(size);
            RecipeMakerImpl builder2=new RecipeMakerImpl(recipeMaker);
            builder2.makeRecipe();
            Recipe item2=builder2.getRecipe();
            //System.out.println(item1.getCost());
            final_cost+=item2.getCost();
        }
        System.out.println("Wanna have sauce?(y/n)");
        String sac=scanner.nextLine();
        if(sac.equalsIgnoreCase("y")) {
        System.out.println("Which size would you like to have?(s/m/l)");
        String size=scanner.nextLine();
        RecipeMaker recipeMaker = new Sauce(size);
        RecipeMakerImpl builder3=new RecipeMakerImpl(recipeMaker);
        builder3.makeRecipe();
        Recipe item3=builder3.getRecipe();
        //System.out.println(item1.getCost());
        final_cost+=item3.getCost();
    }
        System.out.println("Wanna have addon?(y/n)");
        String ac=scanner.nextLine();
        if(ac.equalsIgnoreCase("y")) {
        System.out.println("Which size would you like to have?(s/m/l)");
        String size=scanner.nextLine();
        RecipeMaker recipeMaker = new Addon(size);
        RecipeMakerImpl builder4=new RecipeMakerImpl(recipeMaker);
        builder4.makeRecipe();
        Recipe item4=builder4.getRecipe();
        //System.out.println(item1.getCost());
        final_cost+=item4.getCost();
    }
        System.out.println(final_cost);
    }
}
