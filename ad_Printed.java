class ad_Printed extends advertisement {
    public int wordNum;
    public String placement;




    public ad_Printed(String type_code,String productCode,int time,String explanation,int wordNum,String placement) {
        super(type_code,productCode,time,explanation);
        this.wordNum=wordNum;
        this.placement=placement;
        type="printed";
    }

    
    public String toString() {
        return super.toString()+", number of words: "+wordNum+", which page: "+placement;
    }

}