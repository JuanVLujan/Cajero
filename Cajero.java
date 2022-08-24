package Cajero;
import javax.swing.JOptionPane;
/**
 *
 * @author JuanV
 */
public class Cajero{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int cantidad, resta, b0=0, b1=0, b2=0, b3=0, b4=0, b5=0, b6=0, sw; /* b0=1000 b1= 2000 b2= 5000 b3= 10000 b4= 20000 b5= 50000 b6= 100000*/
     String acumulador_texto = "";
     JOptionPane.showMessageDialog(null,"Bienvenido este algorito le ayudara a calcularar la cantidad de billetes necesarios para un retiro","ALGORITO CAJERO",1);
     do
     {
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad a retirar","ALGORITO CAJERO",3));
        while(!((cantidad%1000)==0))
        {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"El valor ingresado no es valido, por favor ingrese una cifra en multiplos de $1.000","ALGORITO CAJERO",2));
        }
        resta = cantidad;
            while(resta >= 100000)
            {
                resta = resta - 100000;
                b6++; 
            }while(resta >= 50000){
                resta = resta - 50000;
                b5++; 
            }while(resta >= 20000){
                resta = resta - 20000;
                b4++; 
            }while(resta >= 10000){
                resta = resta - 10000;
                b3++; 
            }while(resta >= 5000){
                resta = resta - 5000;
                b2++; 
            }while(resta >= 2000){
                resta = resta - 2000;
                b1++; 
            }while(resta >= 1000){
                resta = resta - 1000;
                b0++;
            }
        if (b6 > 0){
            acumulador_texto = acumulador_texto + (b6 + " billete(s) de 100.000.\n");
        }if (b5 > 0){
            acumulador_texto = acumulador_texto + (b5 + " billete(s) de 50.000.\n");
        }if (b4 > 0){
            acumulador_texto = acumulador_texto + (b4 + " billete(s) de 20.000.\n");
        }if (b3 > 0){
            acumulador_texto = acumulador_texto + (b3 + " billete(s) de 10.000.\n");
        }if (b2 > 0){
            acumulador_texto = acumulador_texto + (b2 + " billete(s) de 5.000.\n");
        }if (b1 > 0){
            acumulador_texto = acumulador_texto + (b1 + " billete(s) de 2.000.\n");
        }if (b0 > 0){
            acumulador_texto = acumulador_texto + (b0 + " billete(s) de 1.000.\n");
        }
        JOptionPane.showMessageDialog(null,"Se requieren: \n" + acumulador_texto,"ALGORITO CAJERO",1);
        sw = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Desea realizar un nuevo conteo?\n1- SI\nOTRO- NO","ALGORITO CAJERO",3));    
     }while(sw==1);
    }
    
}
