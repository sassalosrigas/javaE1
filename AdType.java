public class AdType{
    private int adCode;//kwdikos diafhmishs
    private String adTypeDescription;//efhmerida, periodiko etc
    private String carrierTaxID;//afm

    public AdType(int adCode, String adTypeDescription, String carrierTaxID){
        this.adCode = adCode;
        this.adTypeDescription = adTypeDescription;
        this.carrierTaxID = carrierTaxID;
    }
    public String toString(){
        return adCode+", "+adTypeDescription+", "+carrierTaxID;
    }





}
