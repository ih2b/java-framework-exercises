package fr.esigelec.projetHibernate.daoFactory.impDaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.esigelec.projetHibernate.dao.IPaysDAO;
import fr.esigelec.projetHibernate.daoFactory.DB;
import fr.esigelec.projetHibernate.daoFactory.DbException;
import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;

public class payDaoJdbc implements IPaysDAO {
	 private Connection conn;

	    public payDaoJdbc (Connection conn) {
	        this.conn = conn;
	    }

		@Override
		public void ajouter(Pays p) {
			  PreparedStatement st = null;
		        try {
		            st = conn.prepareStatement("INSERT INTO pays "
		                + "(nom,superficie) "
		                + "VALUES "
		                + "(?, ?)",
		                Statement.RETURN_GENERATED_KEYS);
		            st.setString(1, p.getNom());
		            st.setInt(2, p.getSuperficie());
		            int rowsAffected = st.executeUpdate();

		            if (rowsAffected > 0) {
		                ResultSet rs = st.getGeneratedKeys();
		                if (rs.next()) {
		                    int id = rs.getInt(1);
		                    p.setId(id);
		                }
		                DB.closeResultSet(rs);
		            }
		            else {
		                throw new DbException("Unexpected error: No rows affected.");
		            }
		        }
		        catch (SQLException e) {
		            throw new DbException(e.getMessage());
		        }
		        finally {
		            DB.closeStatement(st);
		        }
			
		}

		@Override
		public Pays getPays(int id) {
			PreparedStatement st = null;
			Pays retour = null;
	        try {
	            st = conn.prepareStatement("SELECT * FROM pays WHERE id=?");
				st.setInt(1,id);
				//on execute la requete
	            int rowsAffected = st.executeUpdate();

	            if (rowsAffected > 0) {
	                ResultSet rs = st.getGeneratedKeys();
	                if (rs.next()) {
	                	retour=new Pays(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie"));
	                }
	                DB.closeResultSet(rs);
	              
	            }
	            else {
	                throw new DbException("Unexpected error: No rows affected.");
	            }
	        }
	        catch (SQLException e) {
	            throw new DbException(e.getMessage());
	        }
	        finally {
	            DB.closeStatement(st);
	        }
	       return retour;
		}

		@Override
		public List<Pays> getPays() {
			PreparedStatement st = null;
			List<Pays> retour = null;
	        try {
	            st = conn.prepareStatement("SELECT * FROM pays");
				//on execute la requete
	            int rowsAffected = st.executeUpdate();

	            
	            	ResultSet rs = st.getGeneratedKeys();
	                while(rs.next()) {
	                	retour.add(new Pays(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie")));
	                	
	                }
					DB.closeResultSet(rs);
	              
	            }
	       
	        catch (SQLException e) {
	            throw new DbException(e.getMessage());
	        }
	        finally {
	            DB.closeStatement(st);
	        }
	       return retour;
		}

		@Override
		public Pays getPays(String nomPays) {
			PreparedStatement st = null;
			Pays retour = null;
	        try {
	            st = conn.prepareStatement("SELECT * FROM pays WHERE nom=?");
				st.setString(1,nomPays);
				//on execute la requete
	            int rowsAffected = st.executeUpdate();

	            if (rowsAffected > 0) {
	                ResultSet rs = st.getGeneratedKeys();
	                if (rs.next()) {
	                	retour=new Pays(rs.getInt("id"),rs.getString("nom"),rs.getInt("superficie"));
	                }
	                DB.closeResultSet(rs);
	              
	            }
	            else {
	                throw new DbException("Unexpected error: No rows affected.");
	            }
	        }
	        catch (SQLException e) {
	            throw new DbException(e.getMessage());
	        }
	        finally {
	            DB.closeStatement(st);
	        }
	       return retour;
		}

		@Override
		public void update(Pays p) {
			PreparedStatement st = null;
	        try {
	            st = conn.prepareStatement("UPDATE pays SET  (nom,superficie) VALUES (?,?) WHERE condition id=?");
	    		st.setString(1,p.getNom());
	    		st.setInt(2,p.getSuperficie());
	    		st.setInt(3,p.getId());
	    		//on execute la requete
	    		
	            int rowsAffected = st.executeUpdate();

	            if (rowsAffected > 0) {
	                ResultSet rs = st.getGeneratedKeys();
	                if (rs.next()) {
	                    int id = rs.getInt(1);
	                    p.setId(id);
	                }
	                DB.closeResultSet(rs);
	            }
	            else {
	                throw new DbException("Unexpected error: No rows affected.");
	            }
	        }
	        catch (SQLException e) {
	            throw new DbException(e.getMessage());
	        }
	        finally {
	            DB.closeStatement(st);
	        }
			
		}

		@Override
		public void delete(Pays p) {
			PreparedStatement st = null;
	        try {
	            st = conn.prepareStatement("DELETE FROM pays WHERE condition id=?");
	            st.setInt(1,p.getId());
	    		//on execute la requete
	    		
	            int rowsAffected = st.executeUpdate();

	            if (rowsAffected > 0) {
	                ResultSet rs = st.getGeneratedKeys();
	                if (rs.next()) {
	                    int id = rs.getInt(1);
	                    p.setId(id);
	                }
	                DB.closeResultSet(rs);
	            }
	            else {
	                throw new DbException("Unexpected error: No rows affected.");
	            }
	        }
	        catch (SQLException e) {
	            throw new DbException(e.getMessage());
	        }
	        finally {
	            DB.closeStatement(st);
	        }
			
		}

		@Override
		public void refresh(Pays p) {
			PreparedStatement st = null;
	        try {
	            st = conn.prepareStatement("UPDATE pays SET  (nom,superficie) VALUES (?,?) WHERE condition id=?");
	    		st.setString(1,p.getNom());
	    		st.setInt(2,p.getSuperficie());
	    		st.setInt(3,p.getId());
	    		//on execute la requete
	    		
	            int rowsAffected = st.executeUpdate();

	            if (rowsAffected > 0) {
	                ResultSet rs = st.getGeneratedKeys();
	                if (rs.next()) {
	                    int id = rs.getInt(1);
	                    p.setId(id);
	                }
	                DB.closeResultSet(rs);
	            }
	            else {
	                throw new DbException("Unexpected error: No rows affected.");
	            }
	        }
	        catch (SQLException e) {
	            throw new DbException(e.getMessage());
	        }
	        finally {
	            DB.closeStatement(st);
	        }
		}

		@Override
		public List<Ville> getVilles(Pays p) {
			// TODO Auto-generated method stub
			return null;
		}
}
