public class Advertisment extends Product{//koina xarakthristika olwn twn diafhmisewn
    protected String type_code;//1,2,3 kwdikos typou diafhmishs. entypo , radio, MME
    protected String explanation;//help
    protected int time;

    public Advertisment(int productcode, String productdescription, String supplierTaxID, String type_code,int time,String explanation){
        super(productcode, productdescription, supplierTaxID);
        this.type_code=type_code;
        this.time=time;
        this.explanation=explanation;
    }
    
}
