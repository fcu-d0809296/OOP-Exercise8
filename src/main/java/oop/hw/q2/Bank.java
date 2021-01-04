package oop.hw.q2;

import com.sun.tools.javac.util.List;

public class Bank {

  private List<Account> accounts = new List<Account>();

  public boolean createAccount(String personId) {
    // 1. 建立一個新帳號(Account)物件
    Account myAcc = new Account();
    // 2. 新的Account物件其balance的值為100
    myAcc.setBalance(100);
    // 3. 檢查list長度
    
    // 4. 當list長度大於等於10時，則回傳false，否則回傳true
    if(accounts.length()>10) {
      return false;
    } else {
      accounts.add(myAcc);
      return true;
    }
    // 5. 若list長度小於10，則將新的account加入list中
  }

  public float withdraw(String personId, float money) {
    // 1. 從accounts中找到同personId的Account物件
    int index = accounts.indexOf(personId);
    // 2. 從該物件的balance減到提款的金額，即money
    
    // 3. 回傳更新後的balance值
    float temp = accounts.get(index).getBalance() - money;
    accounts.get(index).setBalance(temp);
    
    // 4. 若更新後的balance值小於0，則回傳-1
    if(temp<0) {
      return -1;
    } else {
      return temp;
    }
  }

  public float deposit(String personId, float money) {
    // 1. 從accounts中找到同personId的Account物件
    int index = accounts.indexOf(personId);
    // 2. 更新該物件的balance的值，即加上存款的金額(money)
    float temp = accounts.get(index).getBalance() + money;
    accounts.get(index).setBalance(temp);
    // 3. 回傳更新後的balance值
    return temp;
  }

  public List<Account> getAccounts() {
    // 1. 回傳accounts
    return accounts;
    // 2. 注意外部只能讀此Bank物件中所有的Account，但無法修改
  }
}

