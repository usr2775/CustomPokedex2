import java.util.Scanner;
public class SalidaPokedex {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ListaPokemon avistados = new ListaPokemon();
        ListaPokemon capturados = new ListaPokemon();

        System.out.println("Bienvenido a la Pokédex personalizada!");

        boolean salir = false;
        while (!salir) {
            System.out.println("a) Añadir un pokemon avistado");
            System.out.println("b) Añadir avistamiento legendario");
            System.out.println("c) Pasar a capturados");
            System.out.println("d) Mostrar lista de avistados");
            System.out.println("e) Mostrar lista de capturados");
            System.out.println("f) Cerrar la pokedex");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce el nombre del Pokémon:");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce el tipo del Pokémon:");
                    String tipo = scanner.nextLine();
                    Pokemon pokemon = new Pokemon(nombre, tipo);
                    avistados.addPokemon(pokemon);
                    break;
                case "b":
                    System.out.println("Introduce el nombre del Pokémon legendario:");
                    nombre = scanner.nextLine();
                    System.out.println("Introduce el tipo del Pokémon legendario:");
                    tipo = scanner.nextLine();
                    System.out.println("Introduce la localización del Pokémon legendario:");
                    String localizacion = scanner.nextLine();
                    PokemonLegendario legendario = new PokemonLegendario(nombre, tipo, localizacion);
                    avistados.addPokemon(legendario);
                    break;
                case "c":
                    System.out.println("Introduce el nombre del Pokémon que quieres pasar a capturados:");
                    nombre = scanner.nextLine();
                    Pokemon encontrado = avistados.removePokemon(nombre);
                    if (encontrado != null) {
                        System.out.println("Introduce la altura del Pokémon:");
                        double altura = Double.parseDouble(scanner.nextLine());
                        encontrado.setAltura(altura);
                        System.out.println("Introduce el peso del Pokémon:");
                        double peso = Double.parseDouble(scanner.nextLine());
                        encontrado.setPeso(peso);
                        System.out.println("Introduce la descripción del Pokémon:");
                        String descripcion = scanner.nextLine();
                        encontrado.setDescripcion(descripcion);
                        capturados.addPokemon(encontrado);
                    }
                    break;
                case "d":
                    avistados.mostrarPokemon();
                    break;
                case "e":
                    capturados.mostrarPokemon();
                    break;
                case "f":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("Adiós!");
    }

}
