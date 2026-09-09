public abstract class Poligono {
    private int altura;
    private int base;


    public Poligono(int altura, int base) {
        this.altura = altura;
        this.base = base;

    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    public void setAlt(int altura){
        this.altura=altura;
    }
    public void setBase(int base){
        this.base=base;
    }

    public abstract float calcular_area();
}