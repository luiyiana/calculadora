/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class ProductosCongelados extends Producto 
 { String temperatura;
   
   public ProductosCongelados()
    { super();
      temperatura="";
    }
   public ProductosCongelados(String f, int numl, int cantS, double pre, String temp)
    { super(f,numl,cantS,pre);
      temperatura=temp;
    }
   
   double obtenerPrecioTotal()
    { return super.calcularPrecioTotal();   
    }
   
   String obtenerTemperatura()
    { return temperatura;
    }
   
   String obtenerInformacion()
    { return ("Fecha de caducidad: " + super.fechacad + "\nNumero de lote: " + super.num_lote + "\ncantidad en stop: " + super.cant_stop + "\nPrecio unitario: " + super.precio + "\nPrecio total: " + obtenerPrecioTotal() + "\nTemperatura: " + temperatura);  
    }
}

