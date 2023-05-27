import java.util.ArrayList;


class AdsList {
    ArrayList<advertisement> ads = new ArrayList<advertisement>();
    private int d=-1;

    public void insert_ad_internet(ad_Internet x){
        ads.add(x);
        d++;
    }
    public void insert_ad_media(ad_Media x){
        ads.add(x);
        d++;
    }
    public void insert_ad_printed(ad_Printed x){
        ads.add(x);
        d++;
    }


    public void print_ad_list(){
        for (int i=0;i<=d;i++){
            System.out.println(ads.get(i).toString());
        }
    }

    public void ads_of_carrier(ArrayList<String> adv_code){
        for (int i=0;i<=d;i++){
            for (int j=0;j<adv_code.size();j++){
                if(ads.get(i).getType_code().equals(adv_code.get(j))){
                    System.out.println(ads.get(i).toString());
                }
            }
        }
    }
    public int number_of_ads_for_product(String productcode){
        int total=0;
        for (int i=0;i<=d;i++){
            if(productcode.equals(ads.get(i).getProductCode())){
                total++;
            }
        }
        return total;
    }
}
