package ar.edu.unahur.obj2.marcas.TiposDeCerveza;

import ar.edu.unahur.obj2.marcas.Pais;

public class CervezaNegra extends Marca{
    public CervezaNegra(Pais paisDeFabricacion, Double lupuloGr) {
        super(paisDeFabricacion, lupuloGr);
    }

    @Override
    public Double getGraduacion() {
        return this.getGraduacionNegra();
    }
}
