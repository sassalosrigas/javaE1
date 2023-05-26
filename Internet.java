public class Internet extends Advertisment {
    private boolean auto;
    private int pageNum;
    private float priceAuto;
    private float priceDay;
    private float pricePage;
    private float priceExtra;

    public Internet(boolean auto, int pageNum,float priceAuto, float priceDay, float pricePage, String type_code,int time,String explanation, int productcode){
        super(type_code, time, explanation, productcode);
        this.auto=auto;
        this.pageNum=pageNum;
        this.priceAuto=priceAuto;
        this.priceDay=priceDay;
        this.pricePage=pricePage;
    }

    public boolean getAuto() {
        return auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public float getPriceAuto() {
        return priceAuto;
    }
    public void setPriceAuto(float priceAuto) {
        this.priceAuto = priceAuto;
    }
    public float getPriceDay() {
        return priceDay;
    }
    public void setPriceDay(float priceDay) {
        this.priceDay = priceDay;
    }
    public float getPricePage() {
        return pricePage;
    }
    public void setPricePage(float pricePage) {
        this.pricePage = pricePage;
    }

    public void setPrice(boolean auto,float priceAuto, float priceExtra){
        if(auto){
            priceExtra=priceAuto;

        }else{
            priceExtra=0;
        }

    }
    public float getExtraPrice(){
        return priceExtra;
    }

    

    public float Cost(){
        return getPriceDay()*super.getTime()+priceExtra+getPricePage(); //leipei kati to be continued
        
    }
    
}