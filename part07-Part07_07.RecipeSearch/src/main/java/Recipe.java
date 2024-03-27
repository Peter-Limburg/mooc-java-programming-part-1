import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Recipe {
    private String name;
    private int time;
    private List<String> ingredients;

    public Recipe(String name, int time, List<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }

}
