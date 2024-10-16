import java.util.HashMap;

public class Has2 {

    private HashMap<Integer, String> mapa;

    public Has2() {
        mapa = new HashMap<>();
    }
    public void actualizarElemento(int clave, String nuevoValor) {
        if (mapa.containsKey(clave)) {
            mapa.put(clave, nuevoValor);
            System.out.println("Elemento actualizado: (" + clave + ", " + nuevoValor + ")");
        } else {
            System.out.println("La clave no existe.");
        }
    }

    public int obtenerTamaño() {
        return mapa.size();
    }

    public void vaciarMapa() {
        mapa.clear();
        System.out.println("El mapa ha sido vaciado.");
    }
}