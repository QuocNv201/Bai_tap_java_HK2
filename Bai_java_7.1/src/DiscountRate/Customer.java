package DiscountRate;

public class Customer {
 private String name;
 private String membership; 

 public Customer(String name) {
     this.name = name;
     this.membership = "None"; 
 }

 public String getName() {
     return name;
 }

 public String getMembership() {
     return membership;
 }

 public void setMembership(String membership) {
     if (membership.equalsIgnoreCase("Premium") ||
         membership.equalsIgnoreCase("Gold") ||
         membership.equalsIgnoreCase("Silver") ||
         membership.equalsIgnoreCase("None")) {
         this.membership = membership;
     } else {
         System.out.println("Loại thành viên không hợp lệ!");
     }
 }

 @Override
 public String toString() {
     return "Customer[name=" + name + ", membership=" + membership + "]";
 }
}
