public class Product{
    public int productcode;
    private String productdescription;
    private String supplierTaxID;

    public Product(int productcode, String productdescription, String supplierTaxID){
        this.productcode=productcode;
        this.productdescription=productdescription;
        this.supplierTaxID=supplierTaxID;
    }
    public int getProductcode() {
        return productcode;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public String getSupplierTaxID() {
        return supplierTaxID;
    }
    
}
