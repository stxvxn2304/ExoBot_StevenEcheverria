package esDataAccessComponent.esDAOs;

import esDataAccessComponent.esDTOs.esAntCiberDronDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;
import esInfrastructureComponent.esAppException;

public class esAntCiberDronDAO extends DataHelperSQLiteDAO<esAntCiberDronDTO> {

    public esAntCiberDronDAO() throws esAppException {
        super(esAntCiberDronDTO.class, "esAntCiberDron", "esIdAntCiberDron");
    }

}
