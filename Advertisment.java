public abstract class Advertisment{//koina xarakthristika olwn twn diafhmisewn
    private String type_code;//1,2,3 kwdikos typou diafhmishs. entypo , radio, MME
    private String explanation;//help
    private int time;
    private int productcode;
    

    Advertisment(String type_code,int time,String explanation, int productcode){
        this.type_code=type_code;
        this.time=time;
        this.explanation=explanation;
        this.productcode=productcode;
    }

    
    public String getType_code() {
        return type_code;
    }
    public void setType_code(String type_code) {
        this.type_code = type_code;
    }
    public String getExplanation() {
        return explanation;
    }
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public int getProductcode() {
        return productcode;
    }
    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }
    public abstract float Cost();
    
}



