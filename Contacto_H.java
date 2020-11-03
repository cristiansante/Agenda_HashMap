public class Contacto_H{

	private String _nombre, _profesion;
	private int _numero;


	public Contacto_H(String nombre, int numero, String profesion)
	{
		_nombre = nombre;
		_numero = numero;
		_profesion = profesion;
	}

	public String get_nombre()
	{
		return _nombre;
	}

	public void set_nombre(String nombre)
	{
		_nombre = nombre;
	}

	public int get_numero()
	{
		return _numero;
	}

	public void set_numero(int numero)
	{
		_numero = numero;
	}

	public String get_profesion()
	{
		return _profesion;
	}

	public void set_profesion(String profesion)
	{
		_profesion = profesion;
	}

	@Override
	public String toString() {
		return "Contactos: Nombre: " + _nombre + ", Numero: " + _numero + ", Profesion: " + _profesion + "\n";
	}
}
