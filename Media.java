class Media extends Advertisment{
    private int duration;
    private String timeZone;
    private float priceNoon;
    private float priceAfternoon;
    private float priceMorning;
    private float priceNight;
    private float price;

    public Media(int duration, String timeZone, float priceMorning, float priceNoon, float priceAfternoon, float priceNight, String type_code,int time,String explanation, int productcode){
        super(type_code, time, explanation, productcode);
        this.duration=duration;
        this.timeZone=timeZone;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    public float getPriceNoon() {
        return priceNoon;
    }
    public void setPriceNoon(float priceNoon) {
        this.priceNoon = priceNoon;
    }
    public float getPriceAfternoon() {
        return priceAfternoon;
    }
    public void setPriceAfternoon(float priceAfternoon) {
        this.priceAfternoon = priceAfternoon;
    }
    public float getPriceMorning() {
        return priceMorning;
    }
    public void setPriceMorning(float priceMorning) {
        this.priceMorning = priceMorning;
    }
    public float getPriceNight() {
        return priceNight;
    }
    public void setPriceNight(float priceNight) {
        this.priceNight = priceNight;
    }

    public void setPrice(String timeZone, float priceMorning, float priceNoon, float priceAfternoon, float priceNight){
        if(getTimeZone().equals("morning")){
            price=priceMorning;
        }else if(getTimeZone().equals("noon")){
            price=priceNoon;
        }else if(getTimeZone().equals("afternoon")){
            price=priceAfternoon;
        }else{
            price=priceNight;
        }
 
    }
    public float getPrice(){
        return price;

    }
    public float Cost() {
        float cost = getDuration() * getPrice() * super.getTime();
        return cost;
    }

}
