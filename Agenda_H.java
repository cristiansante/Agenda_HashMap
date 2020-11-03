import java.util.HashMap;
import java.util.Scanner;

public class Agenda_H{

	private HashMap<Integer, Contacto_H> _contactos;

	public Agenda_H()
	{
		_contactos = new HashMap<Integer, Contacto_H>();
	}

	public void agregarContacto(Contacto_H contacto)
	{
		if(existeNumero(contacto.get_numero()))
		{
			System.out.println("El contacto ya existe! \n");
		}
		else
		{
			_contactos.put(contacto.get_numero(), contacto);
			System.out.println("El contacto fue agregado con exito! \n");
		}
	}

	public boolean existeNumero(int numero)
	{
		if(_contactos.containsKey(numero))
		{
			return true;
		}
		return false;
	}

	public void eliminarContacto(int numero)
	{
		if(existeNumero(numero))
		{
			_contactos.remove(numero);
			System.out.println("El contacto fue eliminado con exito \n");
		}
		else{
			System.out.println("EL NUMERO NO EXISTE \n");
		}
	}

	public void editarContacto(int numero)
	{
		Scanner sc = new Scanner(System.in);
		if (existeNumero(numero))
		{
			System.out.println("Nuevo numero del contacto: ");
			int numx = sc.nextInt();

			if(existeNumero(numx))
			{
				System.out.println("ESE NUMERO YA EXISTE");
				sc.close();
			}
			else
			{
				// Removemos del HashMap la antigua clave - valor
				_contactos.remove(numero);

				System.out.println("Nuevo nombre del contacto: ");
				String nombre = sc.next();

				System.out.println("Nueva profesion del contacto: ");
				String profesion = sc.next();

				//Agregamos Nuevo Elemento con clave numx
				_contactos.put(numx, new Contacto_H(nombre, numx, profesion));
			}
		 }
		 else
		 {
			System.out.println("No hay contactos con ese numero");
		 }
		 sc.close();
	}

	public void mostrarContactos()
	{
		for (Contacto_H i : _contactos.values()) {
			System.out.println(i);
		  }
	}

	public int tamanio()
	{
		return _contactos.size();
	}
}