package builder.comida;

public class Menu {
    private String mainDish;
    private String sideDish;
    private String Beverage;
    private String gift;

    public Menu () {}

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(final String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(final String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return Beverage;
    }

    public void setBeverage(final String beverage) {
        Beverage = beverage;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(final String gift) {
        this.gift = gift;
    }
}