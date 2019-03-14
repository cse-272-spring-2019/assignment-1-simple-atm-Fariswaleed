/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methos;

/**
 *
 * @author Ziad
 */
class Atm {
     private static double Balance=0.0;
    private long Deposit;
    private long Withdrawal;
    final long cardNumber=9;
    /*public double interfaceAtm()
    {
    }*/
    public  void withdrawal(long withdrawalAmount)
    {if(withdrawalAmount<=Atm.Balance)
    {Atm.Balance-=withdrawalAmount;}
    
    }

    
    
    public double getBalance() {
        return Balance;
    }
    
    
    
     public void deposit(long depositAmount)
    {Atm.Balance+=depositAmount;}
}
