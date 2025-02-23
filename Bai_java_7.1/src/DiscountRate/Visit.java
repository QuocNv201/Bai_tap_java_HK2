package DiscountRate;

public class Visit {
 private Customer customer;
 private double serviceExpense;
 private double productExpense;

 public Visit(Customer customer) {
     this.customer = customer;
     this.serviceExpense = 0.0;
     this.productExpense = 0.0;
 }

 public String getCustomerName() {
     return customer.getName();
 }

 public void setServiceExpense(double serviceExpense) {
     this.serviceExpense = serviceExpense;
 }

 public void setProductExpense(double productExpense) {
     this.productExpense = productExpense;
 }

 public double getTotalExpense() {
     double serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMembership());
     double productDiscount = productExpense * DiscountRate.getProductDiscountRate();

     double total = (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
     return total;
 }

 @Override
 public String toString() {
     return "Visit[customer=" + customer + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense +
            ", totalExpense=" + getTotalExpense() + "]";
 }
}
