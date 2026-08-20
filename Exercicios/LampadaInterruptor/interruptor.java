package Exercicios.LampadaInterruptor;

public class interruptor {
    Lampada lampada = new Lampada();
    void abrircicuito(){
        lampada.desenergizar();
    }
    void fecharcicuito(){
        lampada.energizar();
    }
}
