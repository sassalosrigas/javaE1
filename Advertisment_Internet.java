class Advertisment_Internet extends Advertisment{
    private String automated;
    private int page_number;



    public Advertisment_Internet(String type_code, String product_code, float days, String explanation, String automated, int page_number){
        super(type_code,product_code,days,explanation);
        this.automated=automated;
        this.page_number=page_number;
        
    }

    public double get_cost(float prise,float prise_auto,float prise_day ){
        cost=prise*days+(prise_day*page_number);
        if(automated.equals("1")){
            cost=cost+prise_auto;
        }  
        return cost;
    }


}