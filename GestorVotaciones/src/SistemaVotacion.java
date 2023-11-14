// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class SistemaVotacion {
    private String nombre;
    private HashMap<String, Integer> votos;

    public SistemaVotacion(String nombre) {
        this.nombre = nombre;
        this.votos = new HashMap<>();
    }

    public void agregarCandidato(String candidato) {
        votos.put(candidato, 0);
    }

    public void votar(String candidato) {
        if (!votos.containsKey(candidato)) {
            System.out.println("Candidato no encontrado.");
            return;
        }
        int conteoActual = votos.get(candidato);
        votos.put(candidato, conteoActual + 1);
    }

    public void obtenerResultados() {
        for (Map.Entry<String, Integer> entrada : votos.entrySet()) {
            System.out.println("Candidato: " + entrada.getKey() + ", Votos: " + entrada.getValue());
        }
    }

    public static void main(String[] args) {
        SistemaVotacion sistema = new SistemaVotacion("Votacion 1");

        sistema.agregarCandidato("Candidato 1");
        sistema.agregarCandidato("Candidato 2");

        sistema.votar("Candidato 1");
        sistema.votar("Candidato 2");
        sistema.votar("Candidato 1");

        sistema.obtenerResultados();
    }
}