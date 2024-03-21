package org.example.strategy_pattern;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.printf("Przecena: %dzł\nUżytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!\n",price/2);
        }
    }
}
