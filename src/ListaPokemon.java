public class ListaPokemon {

    private Pokemon[] pokemonList;
    private int size;

    public ListaPokemon() {
        pokemonList = new Pokemon[1];
        size = 0;
    }

    public void addPokemon(Pokemon pokemon) {
        if (size == pokemonList.length) {
            Pokemon[] temp = new Pokemon[pokemonList.length * 2];
            for (int i = 0; i < pokemonList.length; i++) {
                temp[i] = pokemonList[i];
            }
            pokemonList = temp;
    }
        pokemonList[size] = pokemon;
        size++;
        System.out.println("El pokemon " + pokemon.getNombre() + " ha sido añadido a la lista.");

    public Pokemon removePokemon(String name) {
        for (int i = 0; i < size; i++) {
            if (pokemonList[i].getNombre().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    pokemonList[j] = pokemonList[j + 1];
                }
                size--;
                System.out.println("El pokemon " + name + " ha sido eliminado de la lista.");
            }
        }
        System.out.println("No se encontró el pokemon " + name + ".");
        return null;
    }

    public void mostrarPokemon() {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + pokemonList[i].toString());
            }
        
    }

    public Pokemon getPokemon(int index) {
        if (index >= 0 && index < size) {
            return pokemonList[index];
        } else {
            return null;
        }
    }
}