import java.util.HashMap;

public class Hash {

    private HashMap<Integer, String> mapa;

    public Hash() {
        mapa = new HashMap<>();
    }

    public void agregarElemento(int clave, String valor) {
        mapa.put(clave, valor);
        System.out.println("Elemento agregado: (" + clave + ", " + valor + ")");
    }

    public void eliminarElemento(int clave) {
        if (mapa.containsKey(clave)) {
            mapa.remove(clave);
            System.out.println("Elemento con clave " + clave + " eliminado.");
        } else {
            System.out.println("La clave no existe.");
        }
    }

    public void buscarElemento(int clave) {
        if (mapa.containsKey(clave)) {
            System.out.println("El valor para la clave " + clave + " es: " + mapa.get(clave));
        } else {
            System.out.println("La clave no existe.");
        }
    }
}