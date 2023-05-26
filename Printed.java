class Printed extends Advertisment{
    private String placement;
    private int wordNum;
    private float priceFirst;
    private float priceMid;
    private float priceLast;
    private float price;

    public Printed(float priceFirst, float priceMid, float priceLast, String type_code,int time,String explanation, int productcode, String placement, int wordNum){
        super(type_code, time, explanation, productcode);
        this.placement=placement;
        this.wordNum=wordNum;
        this.priceFirst = priceFirst;
        this.priceMid = priceMid;
        this.priceLast = priceLast;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public int getWordNum() {
        return wordNum;
    }

    public void setWordNum(int wordNum) {
        this.wordNum = wordNum;
    }
    public void setPrice(float priceFirst, float priceMid, float priceLast, float price){
        if (getPlacement().equals("first")){
            price=priceFirst;
        }
        else if (getPlacement().equals("middle")){
            price=priceMid;
        }
        else{
            price=priceLast;
        }

    }
    public float getPrice(){
        return price;
    }

    public float Cost(){//ypologismos kostoys
        float result = getWordNum()*getPrice()*super.getTime();
        return result;

    }

}
