public class Urna{
    private int A,B,C,branco;

    public Urna(int A,int B,int C,int branco){
        this.A=A;
        this.B=B;
        this.C=C;
        this.branco=branco;
    }
    public int getA(){return A;}
    public int getB() {return B;}
    public int getC(){return C;}
    public int getBranco(){return branco;}

    public int votar_A(){
        return this.A++;
    }
    public int votar_B(){
        return this.B++;
    }
    public int votar_C(){
        return this.C++;
    }
    public int votar_Branco(){
        return this.branco++;
    }
    public void apurar(){
        if(A>B && A>C){System.out.println("-------------Vencedor:Candidato A-------------");}
        if(B>A && B>C){System.out.println("-------------Vencedor:Candidato B-------------");}
        if(C>A && C>B){System.out.println("-------------Vencedor:Candidato C-------------");}
        System.out.println("Total De Votos:");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("branco="+branco);
    }
}