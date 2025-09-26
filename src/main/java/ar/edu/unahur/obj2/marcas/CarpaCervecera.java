package ar.edu.unahur.obj2.marcas;

import java.util.List;

import ar.edu.unahur.obj2.marcas.TiposDeCerveza.Marca;

public class CarpaCervecera {
    private final Integer limiteDePersonas;
    private Boolean tieneBandaTradicional;
    private final Marca marcaDeCerveza;
    private List<Persona> personas;

    public CarpaCervecera(Integer limiteDePersonas, Boolean tieneBandaTradicional, Marca marcaDeCerveza) {
        this.limiteDePersonas = limiteDePersonas;
        this.tieneBandaTradicional = tieneBandaTradicional;
        this.marcaDeCerveza = marcaDeCerveza;
    }

    public Marca getMarca() {
        return marcaDeCerveza;
    }

    public void entrar(Persona unaPersona) {
        personas.add(unaPersona);
    }

    public Boolean tieneBandaTradicional() {
        return tieneBandaTradicional;
    }
    
    public Integer cantPersonasDentro() {
        return personas.size();
    }

    public Boolean puedeIngresar(Persona unaPersona) {
        Boolean resultado = Boolean.TRUE;
        if (laCarpaEstaLlena()) {
            resultado = Boolean.FALSE;
        }
        return resultado;
    }


    private Boolean laCarpaEstaLlena() {
        return this.cantPersonasDentro().equals(limiteDePersonas);
    }
}
