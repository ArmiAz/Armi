package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Puesto;

/**
 *
 * @author dialv
 */
public interface PuestoService {
    Iterable <Puesto> listAllPuestos();
    
    Optional<Puesto> getPuestoById(Integer id);

    Puesto savePuesto(Puesto puesto);

    void deletePuesto(Integer id);
}
