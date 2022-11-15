public class Samolet extends Transportnoe_sredstvo {
    String fio;
    int kolvo;
    Samolet(String marka, String model, int number, int power, String fio, int kolvo) {
        super(marka, model, number, power);
        this.fio = fio;
        this.kolvo = kolvo;
    }
    void print(){
        System.out.println(marka+" "+ model + " " +number + " "+ power + " " +fio + " "+ kolvo);
    }
}
