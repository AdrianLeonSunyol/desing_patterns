package factoryMethod.website;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {
    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }
    
    public WebSite () {
        this.createWebsite();
    }

    public abstract void createWebsite();
}