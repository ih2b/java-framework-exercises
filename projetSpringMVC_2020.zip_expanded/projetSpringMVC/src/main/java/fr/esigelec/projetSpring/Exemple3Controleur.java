package fr.esigelec.projetSpring;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * exemple de transfert de données à la vue en utilisant modelMap
 * exemple de transfert de données à la vue en utilisant la session)
 * @author serais
 *
 */
@Controller
@RequestMapping("/exemple3")
public class Exemple3Controleur {

	@RequestMapping(method = RequestMethod.GET)
    public String afficher(final ModelMap modelMap,final HttpSession session) {
		
		//utilisation de modelMap
		modelMap.addAttribute("prenom","Sébastien");
		modelMap.addAttribute("nom","Serais");
	
		//utilisation de la session
		session.setAttribute("entreprise","esigelec");
		
		return "vue3";
	
    }
}
