package co.edu.konradlorenz.model.route;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class RouteGraphMap {

    private Map<String, List<String>> attachedList;

    public RouteGraphMap() {
        this.attachedList = new HashMap<>();
    }

    public void addEdge(String start, String destiny) {
        attachedList.computeIfAbsent(start, k -> new ArrayList<>()).add(destiny);
        attachedList.computeIfAbsent(destiny, k -> new ArrayList<>()).add(start); // Bidireccional
    }

    private List<List<String>> findPaths(String start, String end) {
        List<List<String>> path = new ArrayList<>();
        List<String> actualPath = new ArrayList<>();
        actualPath.add(start);
        dfs(start, end, actualPath, path, new HashSet<>());
        return path;
    }

    private void dfs(String nodo, String destino, List<String> camino, List<List<String>> caminos, Set<String> visitados) {
        if (nodo.equals(destino)) {
            caminos.add(new ArrayList<>(camino)); // Agregar el camino encontrado
            return;
        }
        visitados.add(nodo); // Marcar nodo como visitado

        for (String vecino : attachedList.getOrDefault(nodo, new ArrayList<>())) {
            if (!visitados.contains(vecino)) { // Evitar ciclos
                camino.add(vecino);
                dfs(vecino, destino, camino, caminos, visitados); // Recursión
                camino.remove(camino.size() - 1); // Backtracking
            }
        }
        visitados.remove(nodo); // Desmarcar nodo
    }

    // Encontrar la ruta más corta entre dos nodos
    private List<String> findShorterPath(String inicio, String fin) {
        List<List<String>> caminos = findPaths(inicio, fin);
        return caminos.stream()
                .min(Comparator.comparingInt(List::size))
                .orElse(Collections.emptyList());
    }

    // Mostrar la ruta más corta y la distancia
    public String showShorterRoute(String inicio, String fin) {
        List<String> ruta = findShorterPath(inicio, fin);

        if (ruta.isEmpty()) {
            return "No hay ruta disponible entre " + inicio + " y " + fin;

        }

        int distancia = (ruta.size() - 1) * 2; // Suponer 2 km por arista
        return "Ruta más corta: " + ruta + "\nTrayecto: " + distancia + " kilómetros.";
    }
}
