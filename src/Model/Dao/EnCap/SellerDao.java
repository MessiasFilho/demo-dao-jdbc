package Model.Dao.EnCap;

import java.util.List;

import Model.Dao.Entity.Seller;

public interface SellerDao {
	
	void Insert (Seller obj); 
	void Update (Seller obj ) ;
	Seller FindById (Integer Id );
	void DeleteId (Integer Id ); 
	List <Seller > FindALL () ; 

}
