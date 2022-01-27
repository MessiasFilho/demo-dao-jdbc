package Model.Dao.Entity;

import java.util.Date;
import java.util.Objects;

public class Seller {
	
	private Integer Id ; 
	private String Name ; 
	private String Email ; 
	private Date BirthDate ; 
	private Double BaseSalary ; 
	
	private Department depar ; 
	
	public Seller () {}

	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department depar) {
		super();
		Id = id;
		Name = name;
		Email = email;
		BirthDate = birthDate;
		BaseSalary = baseSalary;
		this.depar = depar;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public Double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}

	public Department getDepar() {
		return depar;
	}

	public void setDepar(Department depar) {
		this.depar = depar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Seller [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", BirthDate=" + BirthDate + ", BaseSalary="
				+ BaseSalary + ", depar=" + depar + "]";
	}
	
	
	

}
