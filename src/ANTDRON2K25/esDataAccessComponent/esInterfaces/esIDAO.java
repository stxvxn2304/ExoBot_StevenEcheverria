//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package ANTDRON2K25.esDataAccessComponent.esInterfaces;

import java.util.List;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;

public interface esIDAO<T> {
    List<T> readAll()            throws esAppException;
    T       readBy (Integer id)  throws esAppException;
    boolean create (T entity)    throws esAppException;
    boolean update (T entity)    throws esAppException;
    boolean delete (Integer id)  throws esAppException;
    Integer getMaxReg()          throws esAppException;
}
