class media extends AdType{
    private float priceMorning,priceNoon,priceAfternoon,priceNight;


    public media(String code,String descr,String carrierTaxID,float priceMorning,float priceNoon,float priceAfternoon,float priceNight){ 
        super(code,descr,carrierTaxID);
        this.priceMorning=priceMorning;
        this.priceNoon=priceNoon;
        this.priceAfternoon=priceAfternoon;
        this.priceNight=priceNight;
        type="media";
    }

    public String toString(){
        return super.toString()+", "+priceMorning+", "+priceNoon+", "+priceAfternoon+", "+priceNight;
    }


    public double get_cost(int duration,int media_ad_duration,String time){
        float price=0;
        if (time.equals("morn")){
            price=priceMorning;
        }
        else if (time.equals("noon")){
            price=priceNoon;
        }
        else if (time.equals("after")){
            price=priceAfternoon;
        }
        else{
            price=priceNight;
        }        
        double cost=price*duration*media_ad_duration; 
        return cost;
    }
















    public double get_price(String time){
        if (time.equals("morn")){
            return priceMorning;
        }
        else if (time.equals("noon")){
            return priceNoon;
        }
        else if (time.equals("after")){
            return priceAfternoon;
        }
        else{
            return priceNight;
        }        
    }









}