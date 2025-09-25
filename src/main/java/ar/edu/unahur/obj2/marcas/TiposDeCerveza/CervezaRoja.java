package ar.edu.unahur.obj2.marcas.TiposDeCerveza;

import ar.edu.unahur.obj2.marcas.Pais;

public class CervezaRoja extends Marca{
    public CervezaRoja(Pais paisDeFabricacion, Double lupuloGr) {
        super(paisDeFabricacion, lupuloGr);

    }

    @Override
    public Double getGraduacion() {
        return this.getGraduacionNegra() * 1.25;
    }
}
