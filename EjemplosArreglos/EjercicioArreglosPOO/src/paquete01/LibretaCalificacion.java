/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete04.Colegio;
/**
 *
 * @author reroes
 */
public class LibretaCalificacion {

    private String estudiante;
    private double promedio;
    private String promedioCualitativo;
    private double[] calificaciones;

  
     private Colegio cl;
     

    public LibretaCalificacion(String n, double[] c, Colegio cole) {
        estudiante = n;
        calificaciones = c;
        cl = cole;
    }
    
   // public LibretaCalificacion(Colegio cl, Colegio ci) {
        
     //   cl = cl;
       // ci = ci;
    //}
    
    public void establecerEstudiante(String n) {
        estudiante = n;
    }
  public void ObtenerColegio(Colegio cole) {
        cole= cl;
    }

    public void establecerPromedio() {
        double suma = 0;

        // for (int i = 0; i < calificaciones.length; i++) {
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            suma = suma + obtenerCalificaciones()[i];
        }

        promedio = suma / obtenerCalificaciones().length;
    }

    public void establecerPromedioCualitativo() {
        if ((obtenerPromedio() >= 0) && (obtenerPromedio() <= 3.09)) {
            promedioCualitativo = "Regular";
        } else {
            if ((obtenerPromedio() >= 3.1) && (obtenerPromedio() <= 5.09)) {
                promedioCualitativo = "Insuficiente";
            } else {
                if ((obtenerPromedio() >= 5.1) && (obtenerPromedio() <= 7.09)) {
                    promedioCualitativo = "Bueno";
                } else {
                    if ((obtenerPromedio() >= 7.1) && (obtenerPromedio() <= 9.09)) {
                        promedioCualitativo = "Muy bueno";
                    } else {
                        if ((obtenerPromedio() >= 9.1) && (obtenerPromedio() <= 10)) {
                            promedioCualitativo = "Sobresaliente";
                        } else {
                            promedioCualitativo = "Sin rango";
                        }
                    }
                }
            }
        }
    }

    public void establecerCalificaciones(double[] n) {
        calificaciones = n;
    }

    public String obtenerEstudiante() {
        return estudiante;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String obtenerPromedioCualitativo() {
        return promedioCualitativo;
    }

    public double[] obtenerCalificaciones() {
        return calificaciones;
    }
public Colegio obtenerColegio(){
    return cl;
}

    @Override
    public String toString() {
        String cadena = "Libreta de Calificaciones\n";
        cadena = String.format("%sColegio: %s\nCiudad: %s\nNombre: %s\nCalificaciones:\n", cadena,
                cl.obtenerNombre(),
                cl.obtenerCiudad(),
                obtenerEstudiante());
        // cadena = String.format("%sNombre: %s\nCalificaciones:\n", cadena,
        //        estudiante);
        
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            cadena = String.format("%s\t\t%.2f\n", cadena,
                    obtenerCalificaciones()[i]);
        }
        // cadena = String.format("%sPromedio calificaciones: %.2f\n"
        //         + "Promedio cuantitativo: %s\n",
        //        cadena, obtenerPromedio(), obtenerPromedioCualitativo());
        
        cadena = String.format("%sPromedio calificaciones: %.2f\n"
                 + "Promedio cuantitativo: %s\n",
                cadena, promedio, promedioCualitativo);
        return cadena;
    }
}
