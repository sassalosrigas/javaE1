import java.util.ArrayList;

class Product_List{
    private int d=-1;
    ArrayList<product> products=new ArrayList<product>();

    public void add_element(product x){
        products.add(x);
        d++;
    }

}
