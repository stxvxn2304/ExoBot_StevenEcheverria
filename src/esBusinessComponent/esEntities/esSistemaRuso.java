package esBusinessComponent.esEntities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class esSistemaRuso {
    public List<esCoordenadaUK> esReadCoord(String esFileNamePath) throws IOException {
        List<esCoordenadaUK> esListaCoordUK = new ArrayList<>();
        List<String> esAllLines = Files.readAllLines(Paths.get(esFileNamePath));
        for (String esLine : esAllLines) {
            System.out.println("\n" + esLine);
            String[] esCoord = esLine.split(",");
            esCoordenadaUK esCoordenada = new esCoordenadaUK( esCoord[0], esCoord[6], false);
            esListaCoordUK.add(esCoordenada);
            System.out.println(esCoordenada.toString());
        }
        return esListaCoordUK;
    }

    public void esShowKGDCoord(){

    }
}
