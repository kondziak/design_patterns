package org.example.strategy_pattern;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        pricingStrategy.calculatePrice(price,isSignedUpForNewsletter);
    }
}
