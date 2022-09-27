/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class ProductoFresco extends Producto 
 { String fecha_envasado;
   String pais;
   
   public ProductoFresco()
    { super();
      fecha_envasado=pais="";
    }
   
   public ProductoFresco(String f, int numl, int cantS, double pre,String fechaen,String pais)
    { super(f,numl,cantS,pre);
      fecha_envasado=fechaen;
      this.pais=pais;
    }
   
   double obtenerPrecioTotal()
    { return super.calcularPrecioTotal();   
    }
   
   String obtenerFechaEnva()
    { return fecha_envasado;
    }
   String obtenerPais()
    { return pais;
    }
   
   String obtenerInformacion()
    { return ("Fecha de caducidad: " + super.fechacad + "\nNumero de lote: " + super.num_lote + "\ncantidad en stop: " + super.cant_stop + "\nPrecio unitario: " + super.precio + "\nPrecio total: " + obtenerPrecioTotal() + "\nFecha de envasado: " + fecha_envasado + "\nPais de origen: " + pais); 
       
    }
    
}

