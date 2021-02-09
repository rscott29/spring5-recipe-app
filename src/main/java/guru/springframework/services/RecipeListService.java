package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeListService {

    private final RecipeRepository recipeRepository;

    public RecipeListService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Optional<Recipe> getAllRecipes() {
        return recipeRepository.findAllBy();
    }
}
