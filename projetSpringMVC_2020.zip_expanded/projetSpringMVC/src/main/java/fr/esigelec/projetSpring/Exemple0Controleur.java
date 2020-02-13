package fr.esigelec.projetSpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * exemple simple avec retour de données sans passer par une vue
 * @author serais
 *
 */
@Controller
public class Exemple0Controleur {
	
	@RequestMapping("/exemple0")
	@ResponseBody  //indique que le retour de la méthode correspond au body de la réponse HTTP
	public String afficher() {
        return "Voici le résultat qui sera affiché";
    }
}
