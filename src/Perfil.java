import java.util.List;

/**
 * Clase Perfil representa un perfil de usuario en la aplicación "About Me".
 * Contiene información personal, hobbies, comidas favoritas y datos curiosos.
 */

public class Perfil {

    // Atributos privados
    private String name;
    private String story;
    private List<String> hobbies;
    private List<String> foods;
    private List<String> funFacts;

    /**
     * Constructor para inicializar el perfil con sus datos.
     *
     * @param name     Nombre del perfil.
     * @param story    Historia personal del perfil.
     * @param hobbies  Lista de hobbies del perfil.
     * @param foods    Lista de comidas favoritas del perfil.
     * @param funFacts Lista de datos curiosos del perfil.
     */
    public Perfil(String name, String story, List<String> hobbies, List<String> foods, List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    // Métodos getter

    /**
     * Devuelve el nombre del perfil.
     *
     * @return Nombre del perfil.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la historia personal del perfil.
     *
     * @return Historia personal.
     */
    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    /**
     * Devuelve la lista de hobbies del perfil.
     *
     * @return Lista de hobbies.
     */
    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * Devuelve la lista de comidas favoritas del perfil.
     *
     * @return Lista de comidas favoritas.
     */
    public List<String> getFoods() {
        return foods;
    }

    public void setFoods(List<String> foods) {
        this.foods = foods;
    }

    /**
     * Devuelve la lista de datos curiosos del perfil.
     *
     * @return Lista de datos curiosos.
     */
    public List<String> getFunFacts() {
        return funFacts;
    }

    public void setFunFacts(List<String> funFacts) {
        this.funFacts = funFacts;
    }
// Métodos para formatear y mostrar la información

    /**
     * Devuelve una representación formateada de la historia personal.
     *
     * @return Historia personal formateada.
     */
    public String formattedStory() {
        return "My Story:\n" + story + "\n";
    }

    /**
     * Devuelve una representación formateada de los hobbies.
     *
     * @return Hobbies formateados.
     */
    public String formattedHobbies() {
        return "Favorites - Hobbies:\n" + String.join(", ", hobbies) + "\n";
    }

    /**
     * Devuelve una representación formateada de las comidas favoritas.
     *
     * @return Comidas favoritas formateadas.
     */
    public String formattedFoods() {
        return "Favorites - Foods:\n" + String.join(", ", foods) + "\n";
    }

    /**
     * Devuelve una representación formateada de los datos curiosos.
     *
     * @return Datos curiosos formateados.
     */
    public String formattedFunFacts() {
        return "Fun Facts:\n" + String.join(", ", funFacts) + "\n";
    }

    /**
     * Devuelve una representación completa y formateada de todo el perfil.
     *
     * @return Información completa del perfil.
     */
    public String formattedProfile() {
        return "About Me: " + name + "\n\n" +
                formattedStory() +
                formattedHobbies() +
                formattedFoods() +
                formattedFunFacts();
    }
}


