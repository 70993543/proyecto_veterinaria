package pe.com.veterinaria.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.veterinaria.app.model.Veterinaria;

@Repository
public class VeterinariaRepository {
    private static List<Veterinaria> veterinarias = new ArrayList<Veterinaria>();
    static{
        // Agregar datos estáticos de las veterinarias
        veterinarias.add(new Veterinaria(1, "Clínica Veterinaria San Roque", "8:00 - 18:00", "Su compromiso con el bienestar animal y su enfoque en la atención personalizada",
                "Dirección: Calle #123, Lima, Perú", "info@vetsanroque.com", 1, "veterinaria1.jpg"));
        veterinarias.add(new Veterinaria(2, "Clínica Veterinaria El Bosque", "9:00 - 17:00", "Cuentan con un equipo de veterinarios experimentados y modernas instalaciones equipadas con tecnología de vanguardia",
                "Avenida #456, Trujillo, Perú", "contacto@vetelbosque.com", 0, "veterinaria2.png"));
        veterinarias.add(new Veterinaria(3, "Clínica Veterinaria Patitas Felices", "10:00 - 16:00", "Su equipo de veterinarios altamente capacitados brinda atención personalizada y se enfoca en el bienestar integral de las mascotas.",
                "Jirón #789, Arequipa, Perú", "consultas@patitasfelicesvet.com", 1, "veterinaria3.jpg"));
        veterinarias.add(new Veterinaria(4, "Clínica Veterinaria Huellitas", "8:30 - 17:30", "La Clínica Veterinaria Huellitas se destaca por su compromiso con la educación de los propietarios sobre el cuidado adecuado de las mascotas ",
                "Avenida #234, Cusco, Perú", "info@huellitasveterinaria.com", 0, "veterinaria4.jpg"));
        veterinarias.add(new Veterinaria(5, "Clínica Veterinaria Animalia", "9:30 - 18:30", "la clínica promueve la adopción responsable y la tenencia responsable de animales",
                "Calle #567, Chiclayo, Perú", "contacto@animaliavetperu.com", 1, "veterinaria5.jpg"));
    }
    public List<Veterinaria> buscarTodos(){
        return veterinarias;
    }
    public void insertar (Veterinaria veterinaria){
        veterinarias.add(veterinaria);
    }
}

