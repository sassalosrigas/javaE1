import java.util.ArrayList;

class carrierList{
    private int d=-1;
    ArrayList<carrier> carriers=new ArrayList<carrier>();

    public void add_element(carrier x){
        carriers.add(x);
        d++;
    }

    public void print_carrierList(){
        for (int i=0;i<=d;i++){
            System.out.println(carriers.get(i).toString());
        }
    }

}