
public class Container {
    private int amount;
    private int max;
    
    public Container(){
        this.amount = 0;
        this.max = 100;
    }
    
    public int contains(){
        return this.amount;
    }
    public void add(int amount){
        if(amount < 0){
            
        } else if(this.amount + amount > max){
            this.amount = max;
        } else{
            this.amount += amount;
        }
    }
    public void remove(int amount){
        if(amount < 0){
            
        } else if(this.amount - amount < 0){
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }
    public String toString(){
        return this.amount + "/" + this.max;
    }
}
