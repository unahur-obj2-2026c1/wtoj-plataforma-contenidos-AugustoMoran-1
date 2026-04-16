package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {
    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    public Double costo() {
        return super.getCostoBase() + costoAdicional();
    }

    @Override
    public Double costoAdicional() {
        return 0.0;
    }
}
