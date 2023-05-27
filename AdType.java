public class AdType {
    private String adCode;
    private String adTypeDescription;
    private String carrierTaxID;
    public String type;

    public AdType(String adCode, String adTypeDescription, String carrierTaxID) {
        this.adCode = adCode;
        this.adTypeDescription = adTypeDescription;
        this.carrierTaxID = carrierTaxID;
    }

    public String getAdCode() {
        return adCode;
    }

    public String getCarrierTaxID() {
        return carrierTaxID;
    }

    public String toString() {
        return adCode+", "+adTypeDescription+", "+carrierTaxID;
    }  
}




