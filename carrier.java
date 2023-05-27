class carrier{
    public String name,carrierTaxID;
    
    public carrier(String carrierTaxID,String name){
        this.name=name;
        this.carrierTaxID=carrierTaxID;
    }

    public String toString(){
        return "name: "+name+", carrierTaxID: "+carrierTaxID;
    }
}
