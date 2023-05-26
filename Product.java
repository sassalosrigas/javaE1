public class Product extends Advertisment{
    public int productcode;
    private String productdescription;
    private String supplierTaxID;

    public Product(int productcode, String productdescription, String supplierTaxID){
        this.productcode=productcode;
        this.productdescription=productdescription;
        this.supplierTaxID=supplierTaxID;
    }
    
}
