public class AdType{
    private int adCode;//kwdikos diafhmishs
    private String adTypeDescription;//efhmerida, periodiko etc
    private String carrierTaxID;//afm

    public AdType(int adCode, String adTypeDescription, String carrierTaxID){
    
        this.adCode = adCode;
        this.adTypeDescription = adTypeDescription;
        this.carrierTaxID = carrierTaxID;
    }

    public int getAdCode() {
        return adCode;
    }

    public void setAdCode(int adCode) {
        this.adCode = adCode;
    }

    public String getAdTypeDescription() {
        return adTypeDescription;
    }

    public void setAdTypeDescription(String adTypeDescription) {
        this.adTypeDescription = adTypeDescription;
    }

    public String getCarrierTaxID() {
        return carrierTaxID;
    }

    public void setCarrierTaxID(String carrierTaxID) {
        this.carrierTaxID = carrierTaxID;
    }

    
}




