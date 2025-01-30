//Adimission number: CT101/G/20337/23
// NAME: Wachira Pauline Wambere
// this code calculates discount based on the amount
public class CalculateDiscount{
    public static double getDiscount( double amount){
        double discount = 0.0;
        if (amount > 5000) {
            discount = amount * 0.10;
        }
        else if ( amount >= 1000 && amount <= 5000){
            discount = amount * 0.05;
        }
        else {
            discount = 0.0;
        }
        return discount;
    }
    public static void main (String[] args){
        double discount;
        discount = getDiscount(7000);
        System.out.println(discount);
    }

}