package builder.comida;

public class ChildMenuBuilder extends MenuBuilder {
    private ChildMenu ch_menu;

    public ChildMenuBuilder() {
        ch_menu = new ChildMenu();
    }

    /*@Override
    public Menu build() {
        ChildMenu menu = new ChildMenu();
        menu.setMainDish(ch_menu.getMainDish());
        menu.setSideDish(ch_menu.getSideDish());
        menu.setBeverage(ch_menu.getBeverage());
        menu.setGift(ch_menu.getGift());
        return menu;
    }*/

    @Override
    public Menu getMenu() {
        return ch_menu;
    }

    @Override
    public MenuBuilder addMainDish(final String mainDish) {
        ch_menu.setMainDish(mainDish);
        return this;
    }

    @Override
    public MenuBuilder addSideDish(final String sideDish) {
        ch_menu.setSideDish(sideDish);
        return this;
    }

    @Override
    public MenuBuilder addBeverage(String beverage) {
        ch_menu.setBeverage(beverage);
        return this;
    }

    @Override
    public MenuBuilder addGift(final String gift) {
        ch_menu.setGift(gift);
        return this;
    }
}