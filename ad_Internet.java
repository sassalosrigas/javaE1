class ad_Internet extends advertisement {
    public int pageNum,auto;



    public ad_Internet(String type_code,String productCode,int time,String explanation,int auto,int pageNum) {
        super(type_code,productCode,time,explanation);
        this.auto=auto;
        this.pageNum=pageNum;
        type="internet";
    }

    public int getAuto() {
        return auto;
    }


    
    public String toString() {
        return super.toString()+", auto show: "+auto+", extra pages: "+pageNum;
    }

}