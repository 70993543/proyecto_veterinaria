package pe.com.veterinaria.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.veterinaria.app.model.Veterinaria;
import pe.com.veterinaria.app.repository.VeterinariaRepository;

@Service
public class VeterinariaServices {
    @Autowired
    VeterinariaRepository veterinariarepositorio;

    public void insertarVeterinara(Veterinaria veterinaria){
        veterinariarepositorio.insertar(veterinaria);
    }
    public List<Veterinaria> buscarTodos(){
        return veterinariarepositorio.buscarTodos();
    }
}

