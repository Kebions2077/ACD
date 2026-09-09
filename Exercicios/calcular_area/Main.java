import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int op;
        Scanner scan= new Scanner(System.in);
        Triangulo t1= new Triangulo(0,0);
        Retangulo r1= new Retangulo(0,0);

        System.out.println("-------------Digite um poligono:-------------");
        System.out.println("1)Triangulo");
        System.out.println("2)Quadrado");
        System.out.println("3)Sair");
        System.out.println("---------------------------------------------");
        op=scan.nextInt();
        scan.nextLine();

        switch(op){
            case 1:

            System.out.println("Digite a altura do triangulo:");
            int talt=scan.nextInt();
            t1.setAlt(talt);
            System.out.println("Digite a base do triangulo:");
            int tbase= scan.nextInt();
            t1.setBase(tbase);
            float tarea= t1.calcular_area();
            System.out.println("area do triangulo:"+tarea);
            break;

            case 2:
            System.out.println("Digite a Altura do Retangulo:");
            int ar1= scan.nextInt();
            r1.setAlt(ar1);

            System.out.println("Digite a base do retangulo:");
            int br1= scan.nextInt();
            r1.setBase(br1);
            float area1= r1.calcular_area();
            System.out.println("Area do retangulo:"+area1+"m²");
            break;

            case 3:
                return;

            default:
                System.out.println("Opçao invalida");
        }
scan.close();

    }
}
