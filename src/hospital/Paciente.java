/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Calendar;// El paquete Java util tiene varias funciones. Se puede importar completo
// poniendo el * en lugar del "calendar".

/**
 *
 * @author Administrator
 */
public class Paciente extends Personas{
    private String direccion;
    private String obra_social;
    private int año_nacimiento;
    
    public Paciente() {
        // cuando tengo herencia . tengo que llamar en el constructor al construcctor del 
        // nivel superior. Para inicializar los atributos propios de dicha clase. Con el comando super()
        super();
        direccion="";
        obra_social="";
        año_nacimiento=0;
    }//constructor

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObra_social() {
        return obra_social;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }
    
    public int calcularEdad()
    {
    Calendar calendario;
    int edad;
    
    calendario = Calendar.getInstance();
    edad= calendario.get(Calendar.YEAR) - año_nacimiento;
    return edad;
    }
    /*
     * el metodo calcularCostoConsulta debe devolver el monto a pagar
     * que sera de $200 si la obra social, $400 si es appross, $600
     * si es pami y $800 cualquier otra obra social, a su vez
     * si el paciente tiene mas de 60 años, tiene un descuento del 20%
     */
    public float calcularConsulta(){
        float costo_consulta;
        switch(obra_social .toUpperCase())
       {
           case "OSDE":
           costo_consulta=200;
           break;
           case "APROSS":
           costo_consulta=400;
           break;
           case "PAMI":
           costo_consulta=600;
           break;
           
           default:
           costo_consulta=800;
           
        }
        if (calcularEdad()>=60)
        {
            costo_consulta = (costo_consulta - (costo_consulta*0.2f));
            
        } 
       
        return costo_consulta;
    }
}//fin de la claseno
