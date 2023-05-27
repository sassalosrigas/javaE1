class product extends carrier {
    private String productCode;
    
    public product(String productCode,String name,String carrierTaxID) {
        super(name,carrierTaxID);
        this.productCode=productCode;
    }

    public String toString() {
        return "product productCode: "+productCode+", "+super.toString();
    }

    public String get_code() {
        return productCode;
    }

}
