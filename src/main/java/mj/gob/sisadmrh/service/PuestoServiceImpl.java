package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Puesto;
import mj.gob.sisadmrh.repository.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amachuca
 */
@Service
public class PuestoServiceImpl implements PuestoService {

    
    private PuestoRepository puestoRep;

    @Autowired
    public void setPuestoRepository(PuestoRepository puestoRepository) {
        this.puestoRep = puestoRepository;
    }

    @Override
    public Iterable<Puesto> listAllPuestos() {
        return puestoRep.findAll();
    }

    @Override
    public Optional<Puesto> getPuestoById(Integer id) {
        return puestoRep.findById(id);
    }

    @Override
    public Puesto savePuesto(Puesto puesto) {
        return puestoRep.save(puesto);
    }

    @Override
    public void deletePuesto(Integer id) {
        puestoRep.deleteById(id);
    }

}
