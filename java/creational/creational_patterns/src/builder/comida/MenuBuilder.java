package builder.comida;

public abstract class MenuBuilder {
    //public abstract Menu build();
    public abstract Menu getMenu();
    public abstract MenuBuilder addMainDish(final String mainDish);
    public abstract MenuBuilder addSideDish(final String sideDish);
    public abstract MenuBuilder addBeverage(final String beverage);
    public abstract MenuBuilder addGift(final String gift);
}