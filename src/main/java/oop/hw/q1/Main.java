package oop.hw.q1;
import java.util.Scanner; 

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    int balance = s.nextInt();
    
    Player p1 = new Player(name,balance);
    p1.play();
    
    s.close();
  }

  
}
