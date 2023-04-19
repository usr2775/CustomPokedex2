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
   
        
}
