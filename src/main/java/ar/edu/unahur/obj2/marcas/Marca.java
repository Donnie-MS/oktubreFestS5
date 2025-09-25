package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    private Double lupuloGr;
    private Pais paisDeFabricacion;

    public Marca(Pais paisDeFabricacion, Double lupuloGr) {
        this.paisDeFabricacion = paisDeFabricacion;
        this.lupuloGr = lupuloGr;
    }
    public abstract Double getGraduacion();
}
