
class Internet extends AdType{
    public float day,auto,extra;
    public Internet(int adCode, String adTypeDescription, String carrierTaxID,float day,float auto,float extra){ 
        super(adCode, adTypeDescription, carrierTaxID);
        this.day=day;
        this.auto=auto;
        this.extra=extra;
    }

        public String toString(){
        return super.toString()+", "+day+", "+auto+", "+extra;
    }

}