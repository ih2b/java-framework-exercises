package fr.esigelec.projetSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("esigelec1")
public class Ordinateur {

	private String ip;
	private String os;
	private int ecran;
	public Ordinateur() {
		super();
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getEcran() {
		return ecran;
	}
	public void setEcran(int ecran) {
		this.ecran = ecran;
	}
	public String toString() {
		return "Ordinateur [ip=" + ip + ", os=" + os + ", ecran=" + ecran + "]";
	}
	
}
