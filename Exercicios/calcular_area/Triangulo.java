public class Triangulo extends Poligono {
    public Triangulo(int altura,int base){
        super(altura,base);
    }
    @Override
    public float calcular_area(){
        return (getBase()*getAltura()) /2;
    }

}
