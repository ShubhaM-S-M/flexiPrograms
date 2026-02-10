class BankAccount
{
	double intrestRate()
	{
		return 0.0;
	}
}
class SavingAccount extends BankAccount
{
	double intrestRate()
	{
		return 4.5;
	}
}
class CurrentAccount extends BankAccount
{
	double intrestRate()
	{
		return 6.8;
	}
}
class BankOverriding
{
	public static void main(String[] args)
	{
		SavingAccount sa = new SavingAccount();
		CurrentAccount ca = new CurrentAccount();
		System.out.println(sa.intrestRate());
		System.out.println(ca.intrestRate());
	}
}

