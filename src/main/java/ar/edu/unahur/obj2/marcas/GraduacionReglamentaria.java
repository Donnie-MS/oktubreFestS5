package ar.edu.unahur.obj2.marcas;

public class GraduacionReglamentaria {
    private static GraduacionReglamentaria instancia;
    private Double graduacionReglamentaria;

    private GraduacionReglamentaria(){};

    public static GraduacionReglamentaria getInstance() {
        if(instancia == null) {
            instancia = new GraduacionReglamentaria();
        }
        return instancia;
    }

    public Double getGraduacionReglamentaria() {
        return this.graduacionReglamentaria;
    }

    public void setGraduacionReglamentaria(Double nuevaGraduacion) {
        this.graduacionReglamentaria = nuevaGraduacion;
    }
}
