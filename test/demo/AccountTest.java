package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testWithdrawal_BalanceDoesNotGoBelow_Zero(){
        //Act
        Account account = new Account("123", "123");
        //Act
        double returned = account.withdraw(5);
        //Assert
        Assertions.assertTrue(account.getBalance()>=0);
        Assertions.assertTrue(returned == -1);
    }

    @Test
    public void testWithdrawal_AccountReturnsAndChanges(){
        //Act
        Account account = new Account("123","123");

        //Act
        account.insert(100);
        double returned = account.withdraw(50);

        //Assert
        Assertions.assertTrue(returned==50 && account.getBalance()==50);
    }

    @Test
    public void testInsert_BalanceGetsInsertedAmount(){
        //Arrange
        Account account = new Account("123", "123");
        //Act
        double original = account.getBalance();
        account.insert(100);
        double result = account.getBalance();
        //Assert
        Assertions.assertTrue(result==100 && original != 100);
    }

    @Test
    public void testTransfer(){
        //Arrange
        Account account1 = new Account("123","1st Account");
        Account account2 = new Account("123","2nd Account");

        //Act
        account1.insert(1000);
        double amount = 100;
        double originalBalance = account1.getBalance();
        account1.transfer(amount,account2);

        //Assert
        assertEquals(account2.getBalance(), amount);
        assertEquals(account1.getBalance(), originalBalance - amount);
    }

    @Test
    public void testTransfer_TransferFails8(){
        //Arrange
        Account account1 = new Account("123","1st Account");
        Account account2 = new Account("123","2nd Account");

        //Act
        account1.insert(1000);
        double amount = 1001;
        double originalBalance = account1.getBalance();
        account1.transfer(amount,account2);

        //Assert
        assertNotEquals(account2.getBalance(), amount);
        assertNotEquals(account1.getBalance(), originalBalance - amount);

    }

}