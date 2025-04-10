package pe.edu.upeu.sysalmacen.control;

import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.InyConstrService;

import java.util.List;

public class InyConstrController {
    private final InyConstrService ms;
    public InyConstrController(InyConstrService ms) {
        this.ms = ms;
    }
    @GetMapping
    public Marca guardar(){
        return ms.guardarEntidad(new Marca(1,"Adidas"));
    }
    public List<Marca> listar(){
        return ms.listar();
    }
}