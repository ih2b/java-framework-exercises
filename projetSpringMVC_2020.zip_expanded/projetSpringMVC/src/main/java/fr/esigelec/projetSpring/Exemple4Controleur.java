package fr.esigelec.projetSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * exemple de récupération d'un paramètre HTTP
 * 
 * @author serais
 *
 */
@Controller
@RequestMapping("/exemple4")
public class Exemple4Controleur {

	@RequestMapping(method = RequestMethod.GET)
	public String afficher(final ModelMap modelMap,
			@RequestParam(value = "ville"
			,defaultValue="Rouen"		//optionnel, permet de définir une valeur par défaut
			) final String ville) {

		// utilisation de modelMap
		modelMap.addAttribute("ville", ville);
		

		return "vue4";

	}
}
