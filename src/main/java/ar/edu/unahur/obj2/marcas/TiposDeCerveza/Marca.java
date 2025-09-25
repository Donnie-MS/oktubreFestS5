package ar.edu.unahur.obj2.marcas.TiposDeCerveza;

import ar.edu.unahur.obj2.marcas.GraduacionReglamentaria;
import ar.edu.unahur.obj2.marcas.Pais;

public abstract class Marca {
    private Double lupuloGr;
    private Pais paisDeFabricacion;

    public Marca(Pais paisDeFabricacion, Double lupuloGr) {
        this.paisDeFabricacion = paisDeFabricacion;
        this.lupuloGr = lupuloGr;
    }
    public abstract Double getGraduacion();

    public Double getLupuloGr() {
        return lupuloGr;
    }

    protected Double getGraduacionNegra() {
        return Double.min(GraduacionReglamentaria.getInstance().getGraduacionReglamentaria(), 2 * this.getLupuloGr());
    }
}
