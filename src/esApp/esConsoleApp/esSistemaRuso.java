package esApp.esConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import esBusinessComponent.esEntities.esCoordenadaUK;

public class esSistemaRuso {

    public List<esCoordenadaUK> esReadCoord(String esFileNamePath) throws IOException {
        List<esCoordenadaUK> esLstCoord = new java.util.ArrayList<>();
        List<String> esAllLines = Files.readAllLines(Paths.get(esFileNamePath));
        for (String esLine : esAllLines) {
            System.out.println(esLine);
            String[] coord = esLine.split(",");
            esCoordenadaUK coordenada = new esCoordenadaUK( coord[0], coord[6], false);
            esLstCoord.add(coordenada);
            //System.out.println( coordenada.toString() );
        }
        return esLstCoord;
    }
}
