import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class Agenda_HTest {

    Agenda_H _agenda = new Agenda_H();

    @Test
    public void agregarHTest()
    {
        Contacto_H contacto = new Contacto_H("Cristian", 111, "Desarrollador");

        _agenda.agregarContacto(contacto);

        assertEquals(1, _agenda.tamanio());
    }

    @Test
    public void eliminarHTest()
    {
        Contacto_H contacto_1 = new Contacto_H("Cristian", 111, "Desarrollador");
        Contacto_H contacto_2 = new Contacto_H("Pepe", 222, "Actor");

        _agenda.agregarContacto(contacto_1);
        _agenda.agregarContacto(contacto_2);

        _agenda.eliminarContacto(222);

        assertEquals(1, _agenda.tamanio());
    }

    @Test
    public void existeHTest()
    {
        Contacto_H contacto = new Contacto_H("Cristian", 111, "Desarrollador");

        _agenda.agregarContacto(contacto);

        assertTrue(_agenda.existeNumero(111));
    }

    @Test
    public void tamanioHTest()
    {
        Contacto_H contacto_1 = new Contacto_H("Cristian", 111, "Desarrollador");
        Contacto_H contacto_2 = new Contacto_H("Pepe", 222, "Actor");

        _agenda.agregarContacto(contacto_1);
        _agenda.agregarContacto(contacto_2);

        assertEquals(2, _agenda.tamanio());
    }

    @Test
    public void editarHTest()
    {
        //se puede hacer?
    }
}
