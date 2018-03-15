package edu.ncsu.csc.coffee_maker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for editing a recipe. The controller returns recipe.html in
 * the /src/main/resources/templates folder.
 *
 * @author Kai Presler-Marshall
 * @author Elizabeth Gilbert
 * @author Sarah Heckman
 * @author Jaydevsinh Parmar
 */
@Controller
public class EditRecipeController {
	
	/**
     * On a GET request to /editrecipe, the EditRecipeController will return
     * /src/main/resources/templates/editrecipe.html.
     *
     * @param model
     *            underlying UI model
     * @return contents of the page
     */
    @GetMapping ( "/editrecipe" )
    public String recipeForm ( final Model model ) {
        return "editrecipe";
    }

}
