public class Advertisment {
    protected String type_code,product_code,explanation;
    protected float days;
    public double cost;


    public Advertisment(String type_code,String product_code,float days,String explanation){
        this.type_code=type_code;
        this.product_code=product_code;
        this.days=days;
        this.explanation=explanation;
    }
    public String toString(){
        return type_code+", "+product_code+", "+days+", "+explanation;
    }




    
}
