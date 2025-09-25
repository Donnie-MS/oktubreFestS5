package ar.edu.unahur.obj2.marcas;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.marcas.TiposDeCerveza.Marca;

public class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean leGustaMusicaTradicional;
    private Integer aguante;
    private Pais nacionalidad;

    public Persona(Double peso, Boolean leGustaMusicaTradicional, Integer aguante, Pais nacionalidad) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.aguante = aguante;
        this.nacionalidad = nacionalidad;
    }

    public Boolean estaEbrio() {
        return (this.alcoholIngerido() * this.peso) > this.aguante;
    }

    public Double alcoholIngerido() {
        if (jarrasCompradas == null) {
            return 0.0;
        }
        return jarrasCompradas.stream()
                    .mapToDouble(jarra -> jarra.litrosDeAlcohol())
                    .sum();
    }

    public List<Marca> marcasFavoritas(List<Marca> todasLasMarcas) {
        return todasLasMarcas.stream()
                .filter(unaMarca -> this.leGustaLaCerveza(unaMarca))  
                .collect(Collectors.toList());      
    }

    public Boolean leGustaLaCerveza(Marca tipoDeCerveza) { 
        return switch (nacionalidad.getNombre()) {
            case "Belgica" -> tipoDeCerveza.getLupuloGr() > 4;
            case "Republica Checa" -> tipoDeCerveza.getGraduacion() > 8;
            default -> Boolean.TRUE;
        };
    }
}
