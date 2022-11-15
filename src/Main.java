import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marka, model, number, power:");
        String ma = sc.next();
        String mo = sc.next();
        int n = sc.nextInt();
        int p = sc.nextInt();
        Transportnoe_sredstvo a = new Transportnoe_sredstvo(ma,mo,n,p);
        a.print();
        System.out.println("enter marka, model, number, power, fio, kolvo:");
        String ma1 = sc.next();
        String mo1 = sc.next();
        int n1 = sc.nextInt();
        int p1 = sc.nextInt();
        String f = sc.next();
        int k = sc.nextInt();
        Samolet b = new Transportnoe_sredstvo(ma1,mo1,n1,p1,f,k);
        b.print();
    }
}