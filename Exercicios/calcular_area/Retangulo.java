public class Retangulo extends Poligono{
    public Retangulo(int altura, int base){
        super(altura,base);
    }
    @Override
    public float calcular_area(){
        return (getBase() * getAltura());
    }
}
