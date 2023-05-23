
class Advertisment_Media extends Advertisment{
        private int duration;
        private String timezone;
    
    
    
    
        public Advertisment_Media(String type_code,String product_code,float days,String explanation,int duration,String timezone){
            super(type_code,product_code,days,explanation);
            this.duration=duration;
            this.timezone=timezone;
        }
    
    
        public double get_cost(float prise){
            cost=duration*days*prise;  
            return cost;
        }
    }

