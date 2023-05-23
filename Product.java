class product extends Advertiser{
    public String code;
    
    public product(String code,String name,String afm){
        super(name,afm);
        this.code=code;
    }

    public String toString(){
        return code+", "+super.toString();
    }
}