import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal_H {

	private Agenda_H _agenda;
	private Scanner sc = new Scanner(System.in);
	private boolean _salir = false;

	public Principal_H()
	{
		_agenda = new Agenda_H();
	}

	public void Menu()
	{
		int opcion, numero;
		String nombre, profesion;

		while(!_salir)
		{
			//mostrar opciones:
			System.out.println("Menu de opciones: \n");
			System.out.println("Presione 1 para ver los contactos");
			System.out.println("Presione 2 para agregar un contacto");
			System.out.println("Presione 3 para eliminar un contacto");
			System.out.println("Presione 4 para editar un contacto");
			System.out.println("Presione 5 para salir \n");

			try
			{
				System.out.println("-- Ingrese Numero de Opcion --");
				opcion=sc.nextInt();

				switch (opcion)
				{
					//ver contactos
					case 1:
						_agenda.mostrarContactos();
						break;

					//agregar un contacto
					case 2:
						System.out.println("Ingrese el nombre del contacto");
						nombre = sc.next();

						System.out.println("Ingrese el numero del contacto");
						numero = sc.nextInt();

						System.out.println("Ingrese la profesion del contacto");
						profesion = sc.next();

						Contacto_H contacto = new Contacto_H(nombre, numero, profesion);
						_agenda.agregarContacto(contacto);
						break;

					//eliminar un contacto
					case 3:

						System.out.println("Ingrese el numero del contacto que desea eliminar");

						numero = sc.nextInt();
						_agenda.eliminarContacto(numero);
						break;

					//editar un contacto
					case 4:
						System.out.println("Ingrese el numero que desea editar");

						numero = sc.nextInt();
						_agenda.editarContacto(numero);
						break;

					//salir
					case 5:
						System.out.println("Usted a decidido salir");

						_salir = true;
						break;

					default:
						System.out.println("Opcion debe ser entre 1 y 5");
						break;
				}
				break;

			}catch(InputMismatchException e)
			{
				System.out.println("Debe introducir un numero");
				sc.next();
			}
		}
		sc.close();
		System.out.println("Fin del menu");
	}
}
