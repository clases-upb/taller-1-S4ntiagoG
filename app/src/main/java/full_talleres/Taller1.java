/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;



public class Taller1 {
    
    public static void main(String[] args) {
    
    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int km_s) {
        
        try {

            
            final short metros_en_km = 1000; //factores de conversion 
            final short hora_seg = 3600;

            double Metros_Seg = km_s*metros_en_km;
            double Metros_Hor = Metros_Seg*hora_seg;

            String convercion =  Metros_Seg + " m/s" + " - " + Metros_Hor + " m/h";

            return convercion;

            
        } catch (Exception e) {
            return "Error en la conversion";
        }

    }
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double centimetros_cubicos){

        try {
            
            final short litro_en_cc = 1000;
            float litros = (float) centimetros_cubicos/litro_en_cc;
            return litros;

        } catch (Exception e) { 
            return 0;
        }
    }
  
    

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */

   public static int Convertir_us_cops (int Dolar){
    
    try {
        
        short TMR = 4170;
        int convercion_COP = Dolar*TMR;
        
        return convercion_COP;
    } 
    
    catch (Exception e) {
        return -1;
    }
   }
   
    
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
  public static double Convertir_cent_far(int grados_C){
    //marcamos bloque try catch
    
    try {
        //constantes
        final byte constan_1 = 32;
        final byte constan_2 = 9;
        final byte constan_3 = 5;
        //operacion 
        double grados_F = (constan_1 + (constan_2 * grados_C / constan_3));

        return grados_F;

    } 
    catch (Exception e) {
        return 0;
    }
  }

          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs (short dias, short horas, short min, short seg){ /*al utlizar el byte, en las pruebas no funcionaba, entonces recurri al short, que es lo mas cercano al byte para mantener cierto nviel de optimisacion "si funciona con el short en las pruebas"*/
    //marcamos bloque try catch
    try {
          // verificamos que los datos sean positivos

            if (dias<0 || horas<0 || min<0 || seg < 0) {
                return -1;
            }
            // definimos constantes
            final byte dia_horas = 24;
            final byte minuto_seg = 60;

            //zona de operaciones
            
            int dias_Seg = (dias*dia_horas*minuto_seg* minuto_seg);
            int horas_Seg = (horas*minuto_seg*minuto_seg);
            int minutos_seg = (min*minuto_seg);
            int segundos_totales = dias_Seg + horas_Seg + minuto_seg + seg;

            return segundos_totales;

        } 
    catch (Exception e) 
        {    
        return -1;
        }
  }

   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga (float cargado_camion_ton, float vacio_camion_ton){
   //marcamos bloque try catch
    try {
        //definimos constan
        final short tonelada_kilos = 1000;
        
        //zona de operaciones
        float carga_en_ton = cargado_camion_ton - vacio_camion_ton;
        float carga_en_kil = carga_en_ton * tonelada_kilos;
        String carga = carga_en_kil + " kilos" + " - " + carga_en_ton + " toneladas";
        
        
        return carga;

        } 
    
    catch (Exception e) 
        {
        return "Error en la función Calcular_peso_carga";
        }
   }

   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
   
   public static float Calcular_horasxviaje(String lugar_destino, short km, short velocidad_promedio) {
    
    try {
        
        float Horas_necesarias = km / velocidad_promedio;
        return Horas_necesarias;
        } 
    catch (Exception e) {
        return -1;
    }
    
   }
  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible (int Ruta_1, int Ruta_2, int Ruta_3, int Ruta_4){
    //bloque try cathc
    
    try {
        //definimos constantes y variables
        
        double a = 1.6; 
        double km_vel_Cru = 60.8;
        double ton_Comb = 0.2;
        double Km_Total_R1 = (Ruta_1 / km_vel_Cru * ton_Comb + a);
        double Km_Total_R2 = (Ruta_2 / km_vel_Cru * ton_Comb + a);
        double Km_Total_R3 = (Ruta_3 / km_vel_Cru * ton_Comb + a);
        double Km_Total_R4 = (Ruta_4 / km_vel_Cru * ton_Comb + a);
        double combustible_total = (Km_Total_R1 + Km_Total_R2 + Km_Total_R3 + Km_Total_R4);


        return (float) combustible_total;

    } catch (Exception e) {
        return -1;
    }
   }

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
  public static double Calcular_peso_luna (byte peso_kilos){
    
    try {
        
        final double velocidad_gravedad = 9.81;
        final double const_1 = 0.165;
        double peso_tierra_new = peso_kilos * velocidad_gravedad;
        double peso_luna_new = peso_tierra_new * const_1;

        return peso_luna_new;

        } 
    catch (Exception e) {
       return 0;
    }
}
}
