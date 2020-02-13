package fr.esigelec.projetSpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * exemple simple avec retour d'une vue fixe "vue1.jsp"
 * @author serais
 *
 */
@Controller
public class Exemple1Controleur {

	
	@RequestMapping("/exemple1")
	public String afficher() {
        return "vue1";
    }
}
