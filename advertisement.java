abstract class advertisement {
    protected String type_code,productCode,explanation;
    protected int time;
    public String type;


    public advertisement(String type_code,String productCode,int time,String explanation) {
        this.type_code=type_code;
        this.productCode=productCode;
        this.time=time;
        this.explanation=explanation;
    }
    public String toString() {
        return "ad type code: "+type_code+", product: "+productCode+", days: "+time+", "+explanation;
    }
    public String getType_code() {
        return type_code;
    }
    public int getTime() {
        return time;
    }
    public String getProductCode() {
        return productCode;
    }
    


}



