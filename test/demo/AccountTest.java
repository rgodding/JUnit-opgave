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

}