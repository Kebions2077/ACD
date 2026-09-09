public class Main {
    public static void main(String[] args) {
        //(9+4)*5=??
        Number n1 = new Number(9);
        Number n2 = new Number(4);
        Number n3 = new Number(5);
        Sum soma = new Sum(n1, n2);
        Multiplication mul = new Multiplication(soma, n3);
        double resultado = mul.evaluate();
        System.out.println("resutlado" + resultado);
    }
}
