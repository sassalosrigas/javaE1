public class PrintedCost extends AdType{
    private float priceFirst;
    private float priceMid;
    private float priceLast;

    public PrintedCost(int adCode, String adTypeDescription, String carrierTaxID,float priceFirst, float priceMid, float priceLast) {
        super(adCode, adTypeDescription, carrierTaxID);
        this.priceFirst = priceFirst;
        this.priceMid = priceMid;
        this.priceLast = priceLast;
    }
    public String toString(){
        return super.toString()+", "+priceFirst+", "+priceMid+", "+priceLast;
    }


    public float get_prise(String page){
        if (page.equals("first")){
            return priceFirst;
        }
        else if (page.equals("middle")){
            return priceMid;
        }
        else{
            return priceLast;
        }
        
    }
}
