package Tasks;

import java.util.*;

public class BankDemo1 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Bank obj = new Bank();
		obj.setAccountId(123456);
		obj.setAccountHoldName("syam");
		obj.setAccountType("savings");
		obj.setBalance(1000);

		System.out.println("1.Account creation\n" + "2.SearchAcc:\n" + "3.Deposit\n" + "4.withdraw\n");
		int choice = 0, acNo, amount;
		do {
			System.out.println("enter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter some details for creation of account");
				obj.getAccountId();
				obj.getAccountHoldName();
				obj.getAccountType();
				obj.getBalance();

				System.out.println("account created");
				System.out.println(
						"account id=" + obj.getAccountId() + "\naccount Holder Name=" + obj.getAccountHoldName()
								+ "\naccount Type=" + obj.getAccountType() + "\nBalance=" + obj.getBalance());
				break;

			case 2:

				System.out.println("enter the account u want to search");
				acNo = sc.nextInt();
				try {
					if (obj.getAccountId() == acNo) {
						System.out.println("account found");
					} else {
						throw new Exception();

					}
				}

				catch (Exception e) {
					System.out.println("account not found");
					System.out.println("exception raised");

				}

				break;

			case 3:

				System.out.println("enter the account u want to deposit");
				acNo = sc.nextInt();
				try {

					if (obj.getAccountId() == acNo) {
						System.out.println("account found");
						System.out.println("enter the amount u want to deposit");
						amount = sc.nextInt();

						if (amount > 0) {
							System.out.println("total balance is:" + (obj.getBalance() + amount));
							
						}

						else {
							System.out.println("negative balance not deposited");
						}
					} else {
						throw new Exception();
					}

				}

				catch (Exception e) {
					System.out.println("account not found");
				}
				break;
			case 4:
				
				System.out.println("enter the account u want to withdraw");
				acNo = sc.nextInt();

				try {
					if (obj.getAccountId() == acNo) {
						System.out.println("account found");
						System.out.println("enter the amount u want to withdraw");
						amount = sc.nextInt();
						try {
							if (amount > 0) {

								if (obj.getBalance() >= amount) {

									System.out.println("total balance is" + (obj.getBalance() - amount));
									
								}

								else {

									throw new Exception();
								}
							} else {
								System.out.println("ammount cant withdrawn");
							}
						} catch (Exception e) {
							System.out.println("amount is insufficient");
							System.out.println("Transaction failed");
						}
					}

					else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("account not found");
				}

				break;
			default:
				System.out.println("please enter the correct choice");
				break;

			}

		} while (choice != -1);

	}

}