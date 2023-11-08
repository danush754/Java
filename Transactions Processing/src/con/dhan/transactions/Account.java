package con.dhan.transactions;

import java.util.Arrays;

public class Account {
	
//	I declared  private variables for later use
	private static final int DEFAULT_TRANSACTIONS_AMOUNT = 10;
	private int id;
	private Transaction[] transactions = new Transaction[DEFAULT_TRANSACTIONS_AMOUNT];
	private int lastTransactionIndex;
	
// this is a constructor for id	
    public Account(int id) {
		this.id = id;
	}
	
//	This method Helps to send Money to the account
    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
    	if(accountTo == null) {
    		return;
    	}
    	if(moneyAmount <= 0) {
    		return;
    	}
    	Transaction transaction = new Transaction(this, accountTo, moneyAmount,
				StandardAccountOperations.MONEY_TRANSFER_SEND);
		addTransaction(transaction);
		accountTo.receiveMoney(this, moneyAmount);
	}

	private void receiveMoney(Account accountFrom, double moneyAmount) {
		if (accountFrom == null) {
			return;
		}
		if (moneyAmount <= 0) {
			return;
		}
		Transaction transaction = new Transaction(accountFrom, this, moneyAmount,
				StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
		addTransaction(transaction);
	}

	private void addTransaction(Transaction transaction) {
		if (transaction == null) {
			return;
		}
		if (transactions.length <= lastTransactionIndex) {
			transactions = Arrays.copyOf(transactions, transactions.length << 1);
		}
		transactions[lastTransactionIndex++] = transaction;
    	
    	
    }
    
    
//    This method helps to get the money from the account
    public void withdrawMoney(double moneyAmount) {
    	Transaction transaction = new Transaction(this, null, moneyAmount,
				StandardAccountOperations.WITHDRAW);
		addTransaction(transaction);
    }
    
    
// to string method for id
    @Override
	public String toString() {
		return "Account [id=" + id + "]";
	}

	//    This method helps in getting all the transactions made in tje account
    public Transaction[] getTransactions() {
    	
    	int nonNullTransactionsAmount = 0;
		for (Transaction transaction : transactions) {
			if (transaction != null) {
				nonNullTransactionsAmount++;
			}
		}

		Transaction[] filteredTransactions = new Transaction[nonNullTransactionsAmount];
		int index = 0;
		for (Transaction transaction : transactions) {
			if (transaction != null) {
				filteredTransactions[index++] = transaction;
			}
		}
		return filteredTransactions;

    }
    
    
//	Here new inner class named Transaction has been created 
	public static class Transaction{
		
//		In this inner class I have declared 
		private Account accountFrom;
		private Account accountTo;
		private double moneyAmount;
		private StandardAccountOperations operation;
		
		
// Here I have created a constructor   		
public Transaction(Account accountFrom, Account accountTo, double moneyAmount,
				StandardAccountOperations operation) {
			super();
			this.accountFrom = accountFrom;
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}
//		These are the Getters and Setters for the inner class variables
		public Account getAccountFrom() {
			return accountFrom;
		}
		public void setAccountFrom(Account accountFrom) {
			this.accountFrom = accountFrom;
		}
		public Account getAccountTo() {
			return accountTo;
		}
		public void setAccountTo(Account accountTo) {
			this.accountTo = accountTo;
		}
		public double getMoneyAmount() {
			return moneyAmount;
		}
		public void setMoneyAmount(double moneyAmount) {
			this.moneyAmount = moneyAmount;
		}
		public StandardAccountOperations getOperation() {
			return operation;
		}
		public void setOperation(StandardAccountOperations operation) {
			this.operation = operation;
		}
		@Override
		public String toString() {
			return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", moneyAmount="
					+ moneyAmount + ", operation=" + operation + "]";
		}
		
		
	}

}
