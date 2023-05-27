class internet extends AdType {
    public float priceDay,priceAuto,pricePage;


    public internet(String adCode,String descr,String carrierTaxID,float priceDay,float priceAuto,float pricePage){ 
        super(adCode,descr,carrierTaxID);
        this.priceDay=priceDay;
        this.priceAuto=priceAuto;
        this.pricePage=pricePage;
        type="internet";
    }

    public String toString() {
        return super.toString()+", "+priceDay+", "+priceAuto+", "+pricePage;
    }
    
    public double get_cost(int duration,int auto,int extra_pages) {
        double cost=(priceDay+(priceAuto*auto)+(extra_pages*pricePage))*duration; 
        return cost;
    }
}