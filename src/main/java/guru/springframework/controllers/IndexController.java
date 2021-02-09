package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }
;

    @RequestMapping({"","/", "index"})
    public String getIndexPage () {
        Optional<Category> categoryDescription = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitDescription = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is " + categoryDescription.get().getId());
        System.out.println("Unit Id is " + unitDescription.get().getId());

        return "Index";
    }
}
