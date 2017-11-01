
public class Main {

	public static void main(String[] args) {
		Account a1=new Account("sujitha");
		Account a2 = new Account("anna");
		a1.Deposite(200);
		a1.withdraw(170);
a2.Deposite(300);
a2.transferto(100, a1);
a1.printall();
a2.printall();
	}

}
