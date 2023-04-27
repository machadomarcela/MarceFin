package FinTP;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class Main {

	Path pathResultados = Paths.get("src/test/resources/resultados.csv");
	List<String> lineasResultados = Files.readAllLines(pathResultados);

	Path pathPronosticos = Paths.get("src/test/resources/pronosticos.csv");
	List<String> lineasPronosticos = Files.readAllLines(pathPronosticos);
	
	// Para resultados.csv
	for (String lineaResultado : lineasResultados) {
	    String[] camposResultado = lineaResultado.split(",");
	    String ronda = camposResultado[0];
	    Equipo equipo1 = new Equipo(camposResultado[1]);
	    int golesEquipo1 = Integer.parseInt(camposResultado[2]);
	    int golesEquipo2 = Integer.parseInt(camposResultado[3]);
	    Equipo equipo2 = new Equipo(camposResultado[4]);

	    // ... procesar los resultados ...
	    
	    for (String lineaResultado : lineasResultados) {
            String[] campos = lineaResultado.split(",");
            String ronda1 = campos[0];
            Equipo equipo11 = new Equipo(campos[1]);
            Equipo equipo21 = new Equipo(campos[4]);
            int golesEq1 = Integer.parseInt(campos[2]);
            int golesEq2 = Integer.parseInt(campos[3]);
            Partido partido = new Partido(equipo11, equipo21, ronda1, golesEq1, golesEq2);
            partidos.add(partido);
        }
	}

	// Para pronosticos.csv
	for (String lineaPronostico : lineasPronosticos) {
	    String[] camposPronostico = lineaPronostico.split(",");
	    String participante = camposPronostico[0];
	    Equipo equipo1 = new Equipo(camposPronostico[1]);
	    boolean ganaEquipo1 = "1".equals(camposPronostico[2]);
	    boolean empata = "X".equals(camposPronostico[3]);
	    boolean ganaEquipo2 = "2".equals(camposPronostico[4]);
	    Equipo equipo2 = new Equipo(camposPronostico[5]);

	    // ... procesar los pronósticos ...
	    for (String lineaPronostico : lineasPronostico) {
	        // ...

	        // Buscar el partido correspondiente
	        Partido partido = null;
	        for (Partido p : partidos) {
	            if (p.getEquipo1().equals(equipo1) && p.getEquipo2().equals(equipo2)) {
	                partido = p;
	                break;
	            }
	        }

	        // Si encontramos el partido, procesar el pronóstico
	        if (partido != null) {
	            Equipo equipoElegido = null;
	            String resultado = null;
	            if (gana1) {
	                equipoElegido = equipo1;
	                resultado = "ganador";
	            } else if (gana2) {
	                equipoElegido = equipo2;
	                resultado = "ganador";
	            } else if (empata) {
	                resultado = "empate";
	            }

	            if (equipoElegido != null) {
	                Pronostico pronostico = new Pronostico(partido, equipoElegido, resultado);
	                puntos += pronostico.puntos();
	            }
	        }
	        
	     

	    }
	  
	}
	System.out.println("Los puntos obtenidos por el usuario fueron: " + puntos);

}

    }
