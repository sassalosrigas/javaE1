
import java.util.ArrayList;
public class Ads_List {
    

    ArrayList<Advertisment> ads = new ArrayList<Advertisment>();
    private int d=-1;

    public void insert_ad(Advertisment x){
        ads.add(x);
        d++;
    }

}

