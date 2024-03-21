package org.example.strategy_pattern;

public class RegularPrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.printf("Normalna cena: %dzł\nUżytkownik zapisany do newslettera, należy wybrać inną strategię cenową!\n",price);
        }
    }
}
