
public class Main {

	public static void main(String[] args) {

		/*
		 * int sayi1= 10; int sayi2= 20; sayi1= sayi2; sayi2=100;
		 * System.out.println(sayi1);
		 */

		/*
		 * int [] sayilar1= new [] {1,2,3}; int [] sayilar2= new [] {10,20,30};
		 * sayilar1= sayilar2;
		 * 
		 * sayilar2[0]= 1000;
		 * 
		 * System.out.println(sayilar1[0]);
		 */

		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.calculate();
		 * creditManager.calculate(); creditManager.save();
		 * 
		 * Customer customer = new Customer(); customer.Id = 1; customer.City =
		 * "Ýstanbul";
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * Company company= new Company(); company.TaxNumber= "132113265";
		 * company.CompanyName="ARÇELÝK"; company.Id=100;
		 * 
		 * CustomerManager customerManager2=new CustomerManager(new Company());
		 * 
		 * Person person= new Person() ; person.NationalIdentity = "123456789111";
		 * 
		 * Customer c1= new Customer(); Customer c2= new Person(); Customer c3= new
		 * Company();
		 */

		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
	}

}

interface ICreditManager {
	void calculate();

	void save();
}

abstract class BaseCreditManager implements ICreditManager {
	public abstract void calculate();

	public void save() {
		System.out.println("Kaydedildi");
	}
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {

		System.out.println("Öðretmen kredisi hesaplandý");

	}

	public void save() {
		//
		super.save();
		//
	}

}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandý");

	}

}

class CarCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandý");

	}

}

class Customer {

	public Customer() {
		System.out.println("Müþteri nesnesi baþlatýldý");
	}

	public int Id;
	public String City;

}

class Person extends Customer {

	public String FirstName;
	public String LastName;
	public String NationalIdentity;

}

class Company extends Customer {
	public String CompanyName;
	public String TaxNumber;
}

class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müþteri kaydedildi: ");
	}

	public void delete() {
		System.out.println("Müþteri silindi: ");
	}

	public void GiveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
