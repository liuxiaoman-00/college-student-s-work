package Basic_learning;

public class Car{
    private String name;
    private int price;
    private String color;
    public Car(){};
    public Car(String name,int price,String color){
        this.name=name;
        this.price=price;
        this.color=color;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
}
