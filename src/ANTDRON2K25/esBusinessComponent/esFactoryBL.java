//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package ANTDRON2K25.esBusinessComponent;

import java.util.List;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esDataAccessComponent.esInterfaces.esIDAO;

public class esFactoryBL<T>  {
    private final esIDAO<T> oDAO;

    public esFactoryBL(Class<? extends esIDAO<T>> classDAO) {
        try {
            this.oDAO = classDAO.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            esAppException er = new esAppException("Error al instanciar classDAO<T>", e, getClass(), "FactoryBL(...)");
            throw new RuntimeException(er);
        }
    }

    // Constructor que usa un Supplier para crear la instancia de T
    // public FactoryBL(Supplier<esIDAO<T>> supplier) {
    //     this.oDAO = supplier.get(); 
    // }
 
    public List<T> getAll() throws esAppException {
         return oDAO.readAll();
    }

    public T getBy(Integer id) throws esAppException {
        return oDAO.readBy(id);
    }

    public boolean add(T oT) throws esAppException {
        return oDAO.create(oT);
    }

    public boolean upd(T oT) throws esAppException {
        return oDAO.update(oT);
    }

    public boolean del(Integer id) throws esAppException {
        return oDAO.delete(id);
    }
}
