public class Media extends AdType{
    private float priceMorning;
    private float priceNoon;
    private float priceAfternoon;
    private float priceNight;

    public Media(int adCode, String adTypeDescription, String carrierTaxID,float priceMorning, float priceNoon, float priceAfternoon, float priceNight){
        super(adCode, adTypeDescription, carrierTaxID);
        this.priceMorning=priceMorning;
        this.priceNoon=priceNoon;
        this.priceAfternoon=priceAfternoon;
        this.priceNight=priceNight;

    }
    public String toString(){
        return super.toString()+", "+priceMorning+", "+priceNoon+", "+priceAfternoon+", "+priceNight;
    }

    public double get_prise(String time){
        if (time.equals("morn")){
            return priceMorning;
        }
        else if (time.equals("mid")){
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
