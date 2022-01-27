package Model.Dao.EnCap;

import java.util.List;

import Model.Dao.Entity.Department;

public interface DepartmentDao {

	void Insert (Department obj); 
	void Update (Department obj ) ;
	Department FindById (Integer Id );
	void DeleteId (Integer Id ); 
	List <Department > FindALL () ; 
	
	
	
}
