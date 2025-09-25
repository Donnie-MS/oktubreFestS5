package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.marcas.TiposDeCerveza.Marca;

public class Jarra {
    private Double capacidadLitros;
    private Marca marca;

    public Jarra(Double capacidadLitros, Marca marca) {
        this.capacidadLitros = capacidadLitros;
        this.marca = marca;
    }

    public Double litrosDeAlcohol() {
        return capacidadLitros * marca.getGraduacion();
    }
}
