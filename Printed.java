class Printed extends Advertisment{
    private String placement;
    private int wordNum;

    public Printed(String type_code,int time,String explanation, int productcode, String placement, int wordNum){
        super(type_code, time, explanation, productcode);
        this.placement=placement;
        this.wordNum=wordNum;}

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

    public double Cost(AdType printed){//ypologismos kostoys
        double result = getWordNum()*printed.priceperword*getTime();
        return result;
    }

}
