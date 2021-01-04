package oop.hw.q1;

public class Player {
  private String name;
  private int balance;
  
  public Player() {
    // TODO Auto-generated constructor stub
  }

  public Player(String name, int balance) {
    super();
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
  
  public void play() {
    balance += -5;
    Symbol[] list;
    list = new Symbol[3];
    for(int i=0; i<3; i++) {
      int rd = (int)((Math.random())*4);
      switch(rd) {
        case 0: {
          list[i] = new Cherry();
          break;
        }
        case 1: {
          list[i] = new Watermelon();
          break;
        }
        case 2: {
          list[i] = new Lemon();
          break;
        }
        case 3: {
          list[i] = new Seven();
          break;
        }
      }
    } // end for(3)
    
    int reward = 0;
    for(int i=0; i<3; i++) {
      System.out.print(list[i].getName());
      if(i!=2) {
        System.out.print(',');
      }
    }
    System.out.println(' ');
    
    if(list[0]==list[1] && list[0]==list[2]) {
      reward = list[0].getValue();
    }
    System.out.printf("Reward:%d\n",reward);
    balance += reward;
    System.out.printf("Balance:%d\n",balance);
  }
}
