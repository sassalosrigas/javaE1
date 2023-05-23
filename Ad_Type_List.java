
import java.util.ArrayList;
public class Ad_Type_List {
    
    ArrayList<AdType> ad_types = new ArrayList<AdType>();
    private int d=-1;

    public void insert_ad(AdType x){
        ad_types.add(x);
        d++;
    }

}

