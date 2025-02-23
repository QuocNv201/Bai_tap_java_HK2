package DiscountRate;

public class TestDiscountSystem {
 public static void main(String[] args) {

     Customer customer1 = new Customer("Alice");
     customer1.setMembership("Premium");

     Customer customer2 = new Customer("Bob");
     customer2.setMembership("Gold");

     Customer customer3 = new Customer("Charlie");
     customer3.setMembership("None");

     Visit visit1 = new Visit(customer1);
     visit1.setServiceExpense(100);
     visit1.setProductExpense(50);
     System.out.println(visit1);

     Visit visit2 = new Visit(customer2);
     visit2.setServiceExpense(200);
     visit2.setProductExpense(80);
     System.out.println(visit2);

     Visit visit3 = new Visit(customer3);
     visit3.setServiceExpense(150);
     visit3.setProductExpense(100);
     System.out.println(visit3);
 }
}
