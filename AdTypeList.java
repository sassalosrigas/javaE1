import java.util.ArrayList;

class AdTypeList {
    ArrayList<AdType> ad_types = new ArrayList<AdType>();
    private int d=-1;

    public void insert_ad(AdType x) {
        ad_types.add(x);
        d++;
    }
    public String getType(String ad_type_code) {
        for(int i=0;i<=d;i++) {
            if (ad_types.get(i).getAdCode().equals(ad_type_code)) {
                return ad_types.get(i).type;
            }
        }
        return "nothing";

    }
    public ArrayList<String> carrierTaxID_to_code(String desired_carrierTaxID) {
        ArrayList<String> codes=new ArrayList<String>();
        for(int i=0;i<=d;i++) {
            if(ad_types.get(i).getCarrierTaxID().equals(desired_carrierTaxID)) {
                codes.add(ad_types.get(i).getAdCode());
            }
        }
        return codes;
    }


}
