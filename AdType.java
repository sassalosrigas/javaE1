public class AdType {
    private int adCode;
    private String adTypeDescription;
    private String carrierTaxID; //klhronomei apo Carrier.class mallon???

    public AdType(int adCode, String adTypeDescription, String carrierTaxID){

        this.adCode=adCode;
        this.adTypeDescription=adTypeDescription;
        this.carrierTaxID=carrierTaxID;

    }



}
