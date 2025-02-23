package DiscountRate;

public class DiscountRate {

 private static final double PREMIUM_DISCOUNT = 0.2;
 private static final double GOLD_DISCOUNT = 0.15;
 private static final double SILVER_DISCOUNT = 0.1;
 
 private static final double PRODUCT_DISCOUNT = 0.1;

 public static double getServiceDiscountRate(String type) {
     switch (type.toLowerCase()) {
         case "premium":
             return PREMIUM_DISCOUNT;
         case "gold":
             return GOLD_DISCOUNT;
         case "silver":
             return SILVER_DISCOUNT;
         default:
             return 0.0; 
     }
 }

 public static double getProductDiscountRate() {
     return PRODUCT_DISCOUNT;
 }
}
