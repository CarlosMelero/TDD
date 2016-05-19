import java.util.Hashtable;

public class TDD {
	private Hashtable<String, String> tabla = new Hashtable<String, String>();

	public void put(String clave, String valor) {
		if (tabla.contains(clave)) {
			tabla.replace(clave, valor);
		} else {
			tabla.put(clave, valor);
		}
	}

	public String get(String clave) {
		String d = "";

		if (tabla.containsKey(clave)) {
			d = tabla.get(clave);
		} else {
			String mensaje = String.join(", ", tabla.toString());
			throw new NoExisteClaveAsociada(mensaje);
		}
		return d;
	}

	public String getOrElse(String clave, String valorPorDefecto) {
		String d = valorPorDefecto;

		if (tabla.containsKey(clave))
			d = tabla.get(clave);

		return d;
	}

	public boolean containsKey(String clave) {
		boolean v = false;

		if (tabla.containsKey(clave))
			v = true;
		else
			v = false;

		return v;
	}

	public boolean remove(String clave) {
		boolean v = false;

		if (tabla.containsKey(clave)) {
			tabla.remove(clave);
			v = true;
		} else {
			v = false;
		}

		return v;
	}

	public int size() {
		return tabla.size();
	}

}