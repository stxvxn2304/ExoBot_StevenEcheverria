package ANTDRON2K25.esApp.esConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import ANTDRON2K25.esBusinessComponent.esEntities.esCoordenadaUK;

public class esSistemaRuso {
    private boolean esSolicitarAutenticacion(Scanner sc) {
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Usuario: ");
            String usuario = sc.next();

            System.out.print("Contraseña: ");
            String contrasena = sc.next();

            if ((usuario.equals("stxvn") && contrasena.equals("206")) ||
                (usuario.equals("patmic") && contrasena.equals("123"))) {

                System.out.println("Acceso concedido.");
                return true;
            } else {
                intentos--;
                System.out.println("Credenciales incorrectas. Intentos restantes: " + intentos);
            }
        }

        System.out.println("Acceso bloqueado.");
        return false;
    }

    public void esPresentarCedulaNombre(Scanner sc){
        if(esSolicitarAutenticacion(sc))  System.out.println("Cedula: 1729284529 \nNombre: Steven Mateo Echeverria Aguilar");
        else System.exit(0);
    }

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
