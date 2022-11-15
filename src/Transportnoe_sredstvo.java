public class Transportnoe_sredstvo {
    String marka, model;
    int number, power;
    Transportnoe_sredstvo(String marka, String model, int number, int power){
        this.marka = marka;
        this.model = model;
        this.number = number;
        this.power = power;
    }
    void print(){
        System.out.println(marka+" "+ model + " " +number + " "+ power);
    }
}
