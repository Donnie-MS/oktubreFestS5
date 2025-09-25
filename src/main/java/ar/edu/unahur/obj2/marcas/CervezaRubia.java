package ar.edu.unahur.obj2.marcas;

public class CervezaRubia extends Marca{
    private Double graduacion;


    public CervezaRubia(Double graduacion, Pais paisDeFabricacion, Double lupuloGr) {
        super(paisDeFabricacion, lupuloGr);
        this.graduacion = graduacion;
    }

    @Override
    public Double getGraduacion() {
        return graduacion;
    }
}
