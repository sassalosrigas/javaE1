class PrintedExtra extends Advertisment{
    private int word_number;//ari8mos lejewn
    private String placement; //thesi sto entypo meso



    public PrintedExtra(int productcode, String productdescription, String supplierTaxID, String type_code,int time,String explanation,int word_number,String placement){
        super(productcode, productdescription, supplierTaxID,type_code,time,explanation);
        this.word_number=word_number;
        this.placement=placement;
    }

}
