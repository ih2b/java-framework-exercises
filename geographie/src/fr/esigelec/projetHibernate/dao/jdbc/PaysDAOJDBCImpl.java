package fr.esigelec.projetHibernate.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.esigelec.projetHibernate.dao.IPaysDAO;
import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;

public class PaysDAOJDBCImpl implements IPaysDAO {

	final static String url = "jdbc:mysql://localhost/phpmyadmin";
	final static String login="phpmyadmin";
	final static String pass="root";
	@Override
	public void ajouter(Pays p) {
		Connection con = null;
		PreparedStatement ps = null;
		int retour=0;
		//connexion a la base de données
		try {
		con = DriverManager.getConnection(url, login, pass);
		ps = con.prepareStatement("INSERT INTO pays (nom,superficie) VALUES (?,?)");
		ps.setString(1,p.getNom());
		ps.setInt(2,p.getSuperficie());
		//on execute la requete
		retour=ps.executeUpdate();
		} catch (Exception ee) {
		ee.printStackTrace();
		} finally {
		//fermeture du preparedStatement et de la connexion
		try {if (ps != null)ps.close();} catch (Exception t) {}
		try {if (con != null)con.close();} catch (Exception t) {}
		}

		
	}

	@Override
	public Pays getPays(int id) {
	
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs=null;
			Pays retour=null;
			//connexion a la base de données
			try
			{
			con = DriverManager.getConnection(url, login, pass);
			ps = con.prepareStatement("SELECT * FROM pays WHERE id=?");
			ps.setInt(1,id);
			//on execute la requete
			rs=ps.executeQuery();
			if(rs.next())
			retour=new Pays(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie"));
			} catch (Exception ee) {
			ee.printStackTrace();
			} finally {
			//fermeture du rs,preparedStatement et de la connexion
			try {if (rs != null)rs.close();} catch (Exception t) {}
			try {if (ps != null)ps.close();} catch (Exception t) {}
			try {if (con != null)con.close();} catch (Exception t) {}
			}
			return retour;
			}
	

	@Override
	public List<Pays> getPays() {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs=null;
	List<Pays> retour=new ArrayList<Pays>();
	//connexion a la base de données
	try
	{
	con = DriverManager.getConnection(url, login, pass);
	ps = con.prepareStatement("SELECT * FROM pays");
	//on execute la requete
	rs=ps.executeQuery();
	//on parcourt les lignes du resultat
	while(rs.next())
	retour.add(new Pays(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie")));
	} catch (Exception ee) {
	ee.printStackTrace();
	} finally {
	//fermeture du rs,preparedStatement et de la connexion
	try {if (rs != null)rs.close();} catch (Exception t) {}
	try {if (ps != null)ps.close();} catch (Exception t) {}
	try {if (con != null)con.close();} catch (Exception t) {}
	}
	return retour;}

	@Override
	public Pays getPays(String nomPays) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Pays retour=null;
		//connexion a la base de données
		try
		{
		con = DriverManager.getConnection(url, login, pass);
		ps = con.prepareStatement("SELECT * FROM pays WHERE nom=?");
		ps.setString(1,nomPays);
		//on execute la requete
		rs=ps.executeQuery();
		if(rs.next())
		retour=new Pays(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie"));
		} catch (Exception ee) {
		ee.printStackTrace();
		} finally {
		//fermeture du rs,preparedStatement et de la connexion
		try {if (rs != null)rs.close();} catch (Exception t) {}
		try {if (ps != null)ps.close();} catch (Exception t) {}
		try {if (con != null)con.close();} catch (Exception t) {}
		}
		return retour;
	}

	@Override
	public void update(Pays p) {
		Connection con = null;
		PreparedStatement ps = null;
		int retour=0;
		//connexion a la base de données
		try {
		con = DriverManager.getConnection(url, login, pass);
		ps = con.prepareStatement("UPDATE pays SET  (nom,superficie) VALUES (?,?) WHERE condition id=?");
		ps.setString(1,p.getNom());
		ps.setInt(2,p.getSuperficie());
		ps.setInt(3,p.getId());
		//on execute la requete
		retour=ps.executeUpdate();
		} catch (Exception ee) {
		ee.printStackTrace();
		} finally {
		//fermeture du preparedStatement et de la connexion
		try {if (ps != null)ps.close();} catch (Exception t) {}
		try {if (con != null)con.close();} catch (Exception t) {}
		}
		
	}

	@Override
	public void delete(Pays p) {
		Connection con = null;
		PreparedStatement ps = null;
		int retour=0;
		//connexion a la base de données
		try {
		con = DriverManager.getConnection(url, login, pass);
		ps = con.prepareStatement("DELETE FROM pays WHERE condition id=?");
		ps.setInt(1,p.getId());
		//on execute la requete
		retour=ps.executeUpdate();
		} catch (Exception ee) {
		ee.printStackTrace();
		} finally {
		//fermeture du preparedStatement et de la connexion
		try {if (ps != null)ps.close();} catch (Exception t) {}
		try {if (con != null)con.close();} catch (Exception t) {}
		}
	}
		
		
		
	

	@Override
	public void refresh(Pays p) {
		Connection con = null;
		PreparedStatement ps = null;
		int retour=0;
		//connexion a la base de données
		try {
		con = DriverManager.getConnection(url, login, pass);
		ps = con.prepareStatement("UPDATE pays SET  (nom,superficie) VALUES (?,?) WHERE condition id=?");
		ps.setString(1,p.getNom());
		ps.setInt(2,p.getSuperficie());
		ps.setInt(3,p.getId());
		//on execute la requete
		retour=ps.executeUpdate();
		} catch (Exception ee) {
		ee.printStackTrace();
		} finally {
		//fermeture du preparedStatement et de la connexion
		try {if (ps != null)ps.close();} catch (Exception t) {}
		try {if (con != null)con.close();} catch (Exception t) {}
		}
	}

	@Override
	public List<Ville> getVilles(Pays p) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		List<Ville> retour=null;
		//connexion a la base de données
		try {
		con = DriverManager.getConnection(url, login, pass);
		ps = con.prepareStatement("SELECT * FROM villeINNER JOIN pays ON pays.id = ville.id_pays AND ville.id_pays = ?");
		ps.setInt(1,p.getId());
		//on execute la requete
		rs=ps.executeQuery();
		//on parcourt les lignes du resultat
		while(rs.next()) {
		retour.add(new Ville(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie")));
		} 
		
		} catch (Exception ee) {
		ee.printStackTrace();
		} finally {
		//fermeture du preparedStatement et de la connexion
		try {if (ps != null)ps.close();} catch (Exception t) {}
		try {if (con != null)con.close();} catch (Exception t) {}
		}
		return retour;
	}

}
