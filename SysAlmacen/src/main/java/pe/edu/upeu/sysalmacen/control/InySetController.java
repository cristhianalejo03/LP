package pe.edu.upeu.sysalmacen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.InySetService;

import java.util.List;

@RestController
@RequestMapping("/marcaiss")
public class InySetController {
    private InySetService service;
    @Autowired
    public void setInySetService(InySetService service){
        this.service=service;
    }
    @GetMapping("/a")
    public Marca guardar(){
        return service.guardarEntidad(new Marca(1,"Adidas Set Inyeccion"));
    }
    @GetMapping
    public List<Marca> listar(){
        return service.listar();
    }
}
