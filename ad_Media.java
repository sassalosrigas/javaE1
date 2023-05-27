class ad_Media extends advertisement {
    public int duration;
    public String timezone;




    public ad_Media(String type_code,String productCode,int time,String explanation,int duration,String timezone) {
        super(type_code,productCode,time,explanation);
        this.duration=duration;
        this.timezone=timezone;
        type="media";
    }


    public String toString() {
        return super.toString()+", duration in seconds: "+duration+", time zone: "+timezone;
    }
}