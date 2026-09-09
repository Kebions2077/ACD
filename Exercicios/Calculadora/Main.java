import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int op;
        Scanner scan= new Scanner(System.in);
        System.out.println("------------Calculadora------------");
        System.out.println("1)Soma");
        System.out.println("2)Subtraçao");
        System.out.println("3)Multiplicaçao");
        System.out.println("4)Divisao");
        System.out.println("Digite Uma opçao:");
        System.out.println("-----------------------------------");
        op=scan.nextInt();

        switch(op){
            default:
                System.out.println("Opçao invalida");
            case 1:

                System.out.println("Digite o primeiro operando:");
                int opsum1=scan.nextInt();
                System.out.println("Digite o segundo operando:");
                int opsum2=scan.nextInt();

                Soma s=new Soma(opsum1,opsum2);
                float ressum= s.calcular();

                System.out.println(""+opsum1+"+"+opsum2+"="+ressum);
                break;

            case 2:
                System.out.println("Digite o primeiro operando:");
                int opsub1=scan.nextInt();
                System.out.println("Digite o segundo operando:");
                int opsub2=scan.nextInt();

                 Subtraçao sub=new Subtraçao(opsub1,opsub2);
                float ressub= sub.calcular();

                System.out.println(""+opsub1+"+"+opsub2+"="+ressub);
                break;

            case 3:
                System.out.println("Digite o primeiro operando:");
                int op1mul=scan.nextInt();
                System.out.println("Digite o segundo operando:");
                int op2mul=scan.nextInt();

                Multiplicaçao mul=new Multiplicaçao(op1mul,op2mul);
                float resmul= mul.calcular();

                System.out.println(""+op1mul+"+"+op2mul+"="+resmul);
                break;

            case 4:
                System.out.println("Digite o primeiro operando:");
                int op1div=scan.nextInt();
                System.out.println("Digite o segundo operando:");
                int op2div=scan.nextInt();

                Divisao div=new Divisao(op1div,op2div);
                float resdiv= div.calcular();

                System.out.println(""+op1div+"+"+op2div+"="+resdiv);
                break;




        }



    }
}
