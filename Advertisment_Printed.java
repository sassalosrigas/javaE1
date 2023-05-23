class Advertisment_Printed extends Advertisment{
    private int word_number;
    private String page;



    public Advertisment_Printed(String type_code,String product_code,float days,String explanation,int word_number,String page){
        super(type_code,product_code,days,explanation);
        this.word_number=word_number;
        this.page=page;
    }

    public double get_cost(float price){
        cost=word_number*days*price;  
        return cost;
    }

}
