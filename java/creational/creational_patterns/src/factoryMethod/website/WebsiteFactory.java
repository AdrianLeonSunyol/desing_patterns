package factoryMethod.website;


public class WebsiteFactory {
    /*public static WebSite getWebsite(String siteType) {
        switch(siteType) {
            case "blog" : 
                return new Blog();
            case "shop" : 
                return new Shop();
            default: 
                return null;
        }
    }*/
    //enum
    public static WebSite getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG : 
                return new Blog();
            case SHOP : 
                return new Shop();
            default:
                return null;
        }
    }
}