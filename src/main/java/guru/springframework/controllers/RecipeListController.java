package guru.springframework.controllers;

import guru.springframework.services.RecipeListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeListController {
    private final RecipeListService recipeListService;

    public RecipeListController(RecipeListService recipeListService) {
        this.recipeListService = recipeListService;
    }

    @RequestMapping("/recipes")
    public String getRecipes() {
        System.out.println(recipeListService.getAllRecipes().get().getDescription() );
        return "recipes";
    }
}
