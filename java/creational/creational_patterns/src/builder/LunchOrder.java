package builder;

public class LunchOrder {
    
    public static class BuilderOrder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;
    
        public BuilderOrder () {}
    
        public LunchOrder makeMeASandwich () {
            return new LunchOrder(this);
        }
    
        public BuilderOrder bread (String bread) {
            this.bread = bread;
            return this;
        }
    
        public BuilderOrder condiments (String condiments) {
            this.condiments = condiments;
            return this;
        }
    
        public BuilderOrder dressing (String dressing) {
            this.dressing = dressing;
            return this;
        }
    
        public BuilderOrder meat (String meat) {
            this.meat = meat;
            return this;
        }
    }
    
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public LunchOrder (BuilderOrder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}