/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class ProductosRefrigerados extends Producto
 { String cod_org;
    
   public ProductosRefrigerados()
    { super();
      cod_org="";
    }
   
   public ProductosRefrigerados(String f, int numl, int cantS, double pre,String codor)
    { super(f,numl,cantS,pre);
      cod_org=codor;
    }
   
   double obtenerPrecioTotal()
    { return super.calcularPrecioTotal();   
    }
   
   String obtenerCodigo()
    { return cod_org;
    }
   
   String obtenerInformacion()
    { return ("Fecha de caducidad: " + super.fechacad + "\nNumero de lote: " + super.num_lote + "\ncantidad en stop: " + super.cant_stop + "\nPrecio unitario: " + super.precio + "\nPrecio total: " + obtenerPrecioTotal() + "\nCodigo: " + cod_org);   
    }
}

