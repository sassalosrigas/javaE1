public class Internet extends Advertisment {
    private int auto;
    private int pageNum;

    public Internet(String type_code,int time,String explanation, int productcode, int auto, int pageNum){
        super(type_code, time, explanation, productcode);
        this.auto=auto;
        this.pageNum=pageNum;
    }

    public int getAuto() {
        return auto;
    }
    public void setAuto(int auto) {
        this.auto = auto;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    
    public double Cost(AdType internet){
        
    }
    
}
