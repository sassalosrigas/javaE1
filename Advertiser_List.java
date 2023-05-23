import java.util.ArrayList;
public class Advertiser_List {
    private int d=-1;
    ArrayList<Advertiser> advertisers=new ArrayList<Advertiser>();

    public void add_element(Advertiser x){
        advertisers.add(x);
        d++;
    }

    
}
