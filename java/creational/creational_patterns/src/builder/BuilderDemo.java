package builder;

public class BuilderDemo {
    public static void main(String[] args) {

        /*LunchOrderBean bean = new LunchOrderBean();
        //bean.setBread("pan");
        //bean.setCondiments("condiments");
        //bean.setDressing("dressing");
        //bean.setMeat("meat");

        System.out.println(bean.getBread());
        System.out.println(bean.getCondiments());
        System.out.println(bean.getDressing());
        System.out.println(bean.getMeat());

        LunchOrderTele tele = new LunchOrderTele("bread", "condiments", "dressing", "meat");
        //tele.setBread("pan"); //error is undefined
        
        System.out.println(tele.getBread());
        System.out.println(tele.getCondiments());
        System.out.println(tele.getDressing());
        System.out.println(tele.getMeat());*/

        LunchOrder.BuilderOrder builder = new LunchOrder.BuilderOrder();

        builder.bread("Wheat").meat("turkey");

        LunchOrder lunchorder = builder.makeMeASandwich();

        System.out.println(lunchorder.getBread());
        System.out.println(lunchorder.getCondiments());
        System.out.println(lunchorder.getDressing());
        System.out.println(lunchorder.getMeat());
    }
}