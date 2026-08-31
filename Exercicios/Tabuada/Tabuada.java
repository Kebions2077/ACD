public class tabuada{

    void calcular(int n){
        System.out.println("==========================");
        System.out.println("Tabuada Do"+n);
        for (int x=0; x <= 10; x++){
            int resultado;
            resultado= x*n;
            System.out.println(""+x+"*"+n+"="+resultado);
        }
        System.out.println("==========================");
    }
}