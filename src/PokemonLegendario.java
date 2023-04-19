public class PokemonLegendario extends Pokemon {
    private String localizacion;

    public PokemonLegendario(String nombre, String tipo, String descripcion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocalización: " + (localizacion == null ? "???" : localizacion);
    }
}