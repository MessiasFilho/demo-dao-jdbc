package Aplication;

import java.util.Date;

import Model.Dao.EnCap.DaoFactory;
import Model.Dao.EnCap.SellerDao;
import Model.Dao.Entity.Department;
import Model.Dao.Entity.Seller;

public class Program {

	public static void main(String[] args) {  
		
		
		
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao(); 
		
		Seller selle = sellerDao.FindById(3);
		
		System.out.println(selle);
		
				
	}
	
}
