//project created by alexsyfk,docent ana patricia fontes
//created on 04/04/17 01:00pm
import java.util.Scanner;
class peso{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("inforrrme quantas pessoas na residencia");
pessoa p1 = new pessoa();
p1.setQuant_pessoa(sc.nextInt());
System.out.println("quantde pessoas eh "+p1.getQuant_pessoa());
int peso[]= new int[p1.getQuant_pessoa()];

System.out.println("peso?");
p1.setPeso(sc.nextFloat());


System.out.println("altura?");
p1.setAltura(sc.nextFloat());

pessoa px[] = new pessoa[p1.getQuant_pessoa()];

System.out.println("temos "+p1.getQuant_pessoa()+" pessoas na propriedade");
System.out.println("seu peso é "+p1.getPeso());
System.out.println("sua altura de "+p1.getAltura());



}
}