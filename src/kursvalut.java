import java.util.Scanner;

public class kursvalut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите сумму в рублях ");
        double Rub=scanner.nextDouble();

        //валюты
        final double EUR=0.009484;// Евро
        final double USD=0.010275;// Доллар
        final double GBP=0.007906;// Фунт
        final double DKK=0.23972;// Крона
        final double CNY=0.073554;// Юань
        double e=Rub*EUR;
        double u=Rub*USD;
        double g=Rub*GBP;
        double d=Rub*DKK;
        double k=Rub*CNY;
        System.out.print(Rub+" в рублях равно: "+e+" в евро\n"+Rub+" в рублях равно: "+u+" в долларах\n"+Rub+" в рублях равно: "+g+" в фунтах\n");
        System.out.print(Rub+" в рублях равно: "+d+" в кронах\n"+Rub+" в рублях равно: "+k+" в юанях" );
    }

}
