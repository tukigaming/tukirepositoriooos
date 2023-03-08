package tarea;

public class Fecha
{

    private int Dia;
    private int Mes;
    private int Acso;

    public Fecha (int dia, int mes, int acso)
        {

        //this.Dia = dia;
        //this.Mes = mes;
        //this.Acso = acso;
            this.establecerdia(dia);
this.establecermes(mes);
this.estableceracso(acso);
        }

 
    public void establecerdia(int dia)
    {
    if (dia >0  && dia<=31) {
        
            
          this.Dia = dia;
        }else{
            System.out.print( "\ndia invalido " );
        }
        
    }
    public int obtenerdia()
    {
        return Dia;
    }


    public void establecermes(int mes)
      {
    if (mes > 0 && mes<=12 ) {
        
            
            this.Mes = mes;
       } else {
        System.out.print( "\nMes Invalido " );
       }
       
     }
     public int obtenermes()
    {
        return Mes;
    }


    
    public void estableceracso(int acso)
    {
    if (Acso >2000 && Acso <2100){
        
            this.Acso = acso;
            
        } else {
            System.out.print( "\nFecha invalida " );
        }
        
    }
    public int obteneracso()
    {
        return Acso;
    }

        public boolean mostrarFecha()
        {
          System.out.print( "\nFecha seleccionada: " );
            System.out.printf( "\n %d / %d / %d " , this.obtenerdia() ,this.obtenermes()  , this.obteneracso() );
             return false;
        }



}   