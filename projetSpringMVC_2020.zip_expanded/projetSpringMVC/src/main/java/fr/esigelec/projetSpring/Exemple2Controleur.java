package fr.esigelec.projetSpring;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * exemple simple avec retour d'une vue générée avec un HttpServletResponse
 * @author serais
 *
 */
@Controller
public class Exemple2Controleur {

	@RequestMapping(value="/exemple2",method = {RequestMethod.GET,RequestMethod.POST })
    public void afficher(HttpServletResponse response) throws IOException {
		
		PrintWriter pw=response.getWriter();
		pw.println("retour avec HttpServletResponse");
		pw.close();
	
    }
}
