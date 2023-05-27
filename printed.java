class printed extends AdType {
    private float priceFirst,priceMid,priceLast;


    public printed(String code,String descr,String carrierTaxID,float priceFirst,float priceMid,float priceLast){ 
        super(code,descr,carrierTaxID);
        this.priceFirst=priceFirst;
        this.priceMid=priceMid;
        this.priceLast=priceLast;
        type="printed";
    }

    public String toString(){
        return super.toString()+", "+priceFirst+", "+priceMid+", "+priceLast;
    }



    public double get_cost(int duration,int wordNum,String page){
        float price=0;
        if (page.equals("priceFirst")){
            price=priceFirst;
        }
        else if (page.equals("priceMid")){
            price=priceMid;
        }
        else{
            price=priceLast;
        }

        double cost=price*wordNum*duration; 
        return cost;
    }
















}
