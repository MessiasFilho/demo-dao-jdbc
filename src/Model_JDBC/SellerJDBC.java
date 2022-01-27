package Model_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Model.Dao.EnCap.SellerDao;
import Model.Dao.Entity.Department;
import Model.Dao.Entity.Seller;
import db.DB;
import db.DbException;

public class SellerJDBC implements  SellerDao {
	
	Connection Conn ;
	
	public SellerJDBC (Connection conn ) {
		this.Conn = conn ; 
	}

	@Override
	public void Insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller FindById(Integer Id) {
		
		PreparedStatement pt = null ;  
		ResultSet rs = null ; 
		
		try {
			pt = Conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+"FROM seller INNER JOIN department " 
					+"ON seller.DepartmentId = department.Id "
					+"WHERE seller.Id = ?");
			
			pt.setInt(1, Id); 
			rs=pt.executeQuery(); 
			
			if (rs.next() ) {
				
				Department dep = new Department(); 
				dep.setId(rs.getInt("Id"));
				dep.setNome(rs.getString("Name"));
				
				Seller obj = new Seller (); 
				
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setBirthDate(rs.getDate("BirthDate"));
				obj.setBaseSalary(rs.getDouble("BaseSalary"));
				obj.setDepar(dep);
				
				return obj ; 
			}
			return null; 
			
		}catch (SQLException e ) {
			throw new DbException(e.getMessage()); 
		}
		finally {
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
		
		
		
	}

	@Override
	public void DeleteId(Integer Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seller> FindALL() {
		// TODO Auto-generated method stub
		return null;
	}

}
