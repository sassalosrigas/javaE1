public class PrintedPrice {
    private float priceFirst;
    private float priceMid;
    private float priceLast;

    public PrintedPrice(float priceFirst, float priceMid, float priceLast){
        this.priceFirst = priceFirst;
        this.priceMid = priceMid;
        this.priceLast = priceLast;
    }

    public float getPriceFirst() {
        return priceFirst;
    }

    public void setPriceFirst(float priceFirst) {
        this.priceFirst = priceFirst;
    }

    public float getPriceMid() {
        return priceMid;
    }

    public void setPriceMid(float priceMid) {
        this.priceMid = priceMid;
    }

    public float getPriceLast() {
        return priceLast;
    }

    public void setPriceLast(float priceLast) {
        this.priceLast = priceLast;
    }

    
}
