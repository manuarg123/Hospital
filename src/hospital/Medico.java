/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.Calendar;
/**
 *
 * @author Administrator
 */

//atributos: 
// especialidad, matricula, año_ingreso, consultorio, horarios, sueldo básico
//metodo del sueldo : 


public class Medico extends Personas {
    private String especialidad, matricula,consultorio,horarios;
    private int año_ingreso, sueldo_basico;
    
    public Medico(){
        super();
        especialidad="";
        matricula="";
        consultorio="";
        horarios="";
        año_ingreso=0;
        sueldo_basico=0;
    }//fin constructor

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public int getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(int sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }
    
    
    public int calcularAntiguedad()
    {
        Calendar calendario;
    int antiguedad;
    
    calendario = Calendar.getInstance();
    antiguedad= calendario.get(Calendar.YEAR) - año_ingreso;
    return antiguedad;
    }
    /*
     * calcularHonorarios(int cantidad_pacientes): se calculan el sueldo neto que sera el 
    bruto menos
los descuentos que son del 18% del sueldo bruto y se le paga $150 por cada paciente atendido
    y si la antiguedad es superior a 10 años, un extra de $5.000
    */
    public float calcularHonorarios(int cantidad_pacientes)
    {
        float honorarios;
        
        float sueldo_neto;
        float total_pacientes;
        
        sueldo_neto= sueldo_basico - (sueldo_basico*0.18f);
        total_pacientes=cantidad_pacientes * 150;
        honorarios=sueldo_neto + total_pacientes;
        if (calcularAntiguedad()>=10)
        {
            honorarios=honorarios + 5000;
        }
        return honorarios;
    }

    Object calcularHonorarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//fin de la clase
