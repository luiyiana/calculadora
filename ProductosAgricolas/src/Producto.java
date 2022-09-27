/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class Producto 
 {  static double canttot;
    
    String fechacad;
    int num_lote;
    int cant_stop;
    double precio;
    
    public Producto()
     { fechacad="";
       num_lote=cant_stop=0;
       precio=0;
     }

     public Producto(String f, int numl, int cantS, double pre)
      { fechacad=f;
        num_lote=numl;
        cant_stop=cantS;
        precio=pre;
      }
     
     double calcularPrecioTotal()
      { return cant_stop * precio;
      }
     
     void calcularTotal()
      { canttot+=calcularPrecioTotal();
      }

     String obtenerFechaCad()
      { return fechacad;
      }

     int obtenerNumLote()
      { return num_lote;
      }

     int obternerCantStop()
      { return cant_stop;
      }
     
     double obternerPrecio()
      { return precio;
      }

}

