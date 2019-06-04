package builder.comida;

public class Cashier {
    private MenuBuilder builder;

    public Cashier (final MenuBuilder builder) {
        this.builder = builder;
    }

    public void buildMenu () {
        builder.addMainDish("plato principal")
                .addSideDish("segundo plato")
                .addGift("juguete de plastico")
                .addBeverage("guardar en bolsa");
        //Menu menu = builder.getMenu();
    }
}