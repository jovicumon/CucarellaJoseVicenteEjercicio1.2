import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CucarellaJoseVicente {
    public static void main(String[] args) {
        // Crear un perfil de ejemplo
        Perfil perfil = new Perfil(
                "Jovi Cucarella",
                "Soy un desarrollador novato dispuesto a aprender nuevas tecnologías.",
                Arrays.asList("📖 Leer", "💻 Programar", "🏋️‍♂️ Deporte"),
                Arrays.asList("🍕 Pizza", "🍣 Sushi", "🍔 Hamburguesa"),
                Arrays.asList("☕ Me encanta el café", "🐶 Tengo una perrita llamada Leia", "🎮 Me encantan los videojuegos")
        );
// Crear un scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle del menú
        do {
            // Mostrar el menú
            System.out.println("\nMenu AboutMe [" + perfil.getName() + "]");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Fact");
            System.out.println("[4] Salir");
            System.out.print("Selecciona una opción: ");

            // Leer la entrada del usuario y manejar posibles errores
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1; // Opción no válida
            }

            // Manejar las opciones del menú
            switch (opcion) {
                case 1:
                    System.out.println("\n" + perfil.formattedStory());
                    break;

                case 2:
                    System.out.println("\n" + perfil.formattedHobbies());
                    System.out.println(perfil.formattedFoods());
                    break;

                case 3:
                    System.out.println("\nFun Fact:");
                    System.out.println(getRandomFunFact(perfil.getFunFacts()));
                    break;

                case 4:
                    System.out.println("\n¡Gracias por visitar el perfil!");
                    break;

                default:
                    System.out.println("\nOpción no válida. Elige una de las opciones anteriores.");
            }
        } while (opcion != 4);

        // Cerrar el scanner
        scanner.close();
    }

    /**
     * Obtiene un dato curioso aleatorio de la lista de fun facts.
     *
     * @param funFacts Lista de datos curiosos.
     * @return Un dato curioso aleatorio.
     */
    private static String getRandomFunFact(List<String> funFacts) {
        Random random = new Random();
        int index = random.nextInt(funFacts.size());
        return funFacts.get(index);
    }
        /* Mostrar el perfil formateado
        System.out.println(perfil.formattedProfile());
        */

        }

