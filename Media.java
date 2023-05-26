class Media extends Advertisment{
    private int duration;
    private String timeZone;

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


    public Media(String type_code,int time,String explanation, int productcode, int duration, String timeZone){
        super(type_code, time, explanation, productcode);


    }








    public double Cost(AdType media) {
        int cost = getDuration() * getPrice() * getTime();
        return cost;
    }

}
