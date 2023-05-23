public class Advertiser {
    public String name,afm;
    
    public Advertiser(String name,String afm){
        this.name=name;
        this.afm=afm;
    }

    public String toString(){
        return name+", "+afm;
    }
    
}
