
package co.edu.konradlorenz.model;


import java.util.*;


public class GrafoRutas {
     private final Map<String, List<String>> adjList = new HashMap<>();

    public void agregarArista(String origen, String destino) {
        adjList.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
        adjList.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen); // Bidireccional
     }

    private List<List<String>> encontrarCaminos(String inicio, String fin) {
        List<List<String>> caminos = new ArrayList<>();
        List<String> caminoActual = new ArrayList<>();
        caminoActual.add(inicio);
        dfs(inicio, fin, caminoActual, caminos, new HashSet<>());
        return caminos;
    }

    private void dfs(String nodo, String destino, List<String> camino, List<List<String>> caminos, Set<String> visitados) {
        if (nodo.equals(destino)) {
            caminos.add(new ArrayList<>(camino)); // Agregar el camino encontrado
            return;
        }
        visitados.add(nodo); // Marcar nodo como visitado

        for (String vecino : adjList.getOrDefault(nodo, new ArrayList<>())) {
            if (!visitados.contains(vecino)) { // Evitar ciclos
                camino.add(vecino);
                dfs(vecino, destino, camino, caminos, visitados); // Recursión
                camino.remove(camino.size() - 1); // Backtracking
            }
        }
        visitados.remove(nodo); // Desmarcar nodo
    }

    // Encontrar la ruta más corta entre dos nodos
    private List<String> encontrarRutaMasCorta(String inicio, String fin) {
        List<List<String>> caminos = encontrarCaminos(inicio, fin);
        return caminos.stream()
                .min(Comparator.comparingInt(List::size))
                .orElse(Collections.emptyList());
    }

    // Mostrar la ruta más corta y la distancia
    public String mostrarRutaMasCorta(String inicio, String fin) {
        List<String> ruta = encontrarRutaMasCorta(inicio, fin);

        if (ruta.isEmpty()) {
            return "No hay ruta disponible entre " + inicio + " y " + fin;
        
        }

        int distancia = (ruta.size() - 1) * 2; // Suponer 2 km por arista
        return "Ruta más corta: " + ruta + "\nTrayecto: " + distancia + " kilómetros.";
    }
}
