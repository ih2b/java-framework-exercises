package fr.esigelec.projetSpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * exemple simple avec retour de donn�es sans passer par une vue
 * @author serais
 *
 */
@Controller
public class Exemple0Controleur {
	
	@RequestMapping("/exemple0")
	@ResponseBody  //indique que le retour de la m�thode correspond au body de la r�ponse HTTP
	public String afficher() {
        return "Voici le r�sultat qui sera affich�";
    }
}
