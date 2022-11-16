import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipeSet;

    public RecipeList() {
        this.recipeSet = new HashSet<>();
    }

    public Set<Recipe> getRecipeSet() {
        return Collections.unmodifiableSet(recipeSet);
    }

    public void addRecipe(Recipe recipe) {
        if (!recipeSet.add(recipe)) {
            throw new RuntimeException("Такой рецепт уже существует");
        }
    }
}
