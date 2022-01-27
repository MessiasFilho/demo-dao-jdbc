package Model.Dao.EnCap;

import Model_JDBC.SellerJDBC;
import db.DB;

public class DaoFactory {
	
	public static SellerDao CreateSellerDao () {
		return new SellerJDBC(DB.getConnection()); 
	}
	

}
