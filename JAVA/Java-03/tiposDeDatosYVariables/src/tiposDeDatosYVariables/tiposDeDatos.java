package tiposDeDatosYVariables;

public class tiposDeDatos {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacionV = horasTrabajadas * pago;
        
        System.out.println(multiplicacionV);
        
        double num = 1.61;
        
        //Aquí ya le estamos diciendo que lo cambie a entero
        int numInt = (int) num;
       
        //Cambiar a long
        long numLong = (long) num;
        
        
        
        System.out.println("double: " + num);
        System.out.print("int: " +numInt);
        System.out.println("long: " + numLong);
        
        //string
        
        String cantidad = "15";
        String precio = "115.20";


        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);


        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

         

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); //y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

        System.out.println("Edad: " + edadString + estatura + estaturaString);
        
        //Conversiones
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        //otro ejemplo
        
        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
   
        //Práctica en equipo de tipo de variables
        
     
                // TODO Auto-generated method stub
                /*Ejercicio 1
                Declara 3 variables de tipo entero y utiliza el operador * y %<*/
                
                int var1 = 1;
                int var2 = 2;
                int var3 = 3;
                int resultado1=var1*var2;
                int resultado2=var3%var2;
                
                System.out.println("Resultado de multiplicacion: " + var1 + "*" + var2 + " = " + resultado1);
                System.out.println("Resultado de modulo: " + var3 + "%" + var2 + " = " + resultado2);
                
                /*Ejercicio 2
                Declara dos variables de tipo boolean y utiliza el operador ==*/
                
                boolean varTrue = true;
                boolean varFalse = false;
                
                if(varTrue == true) {
                    System.out.println("Es verdad");
                }
                else{
                    System.out.println("Es mentira");
                }
                
                boolean trueOrFalse = varTrue == varFalse;
                System.out.println(trueOrFalse);
                
                
                /*Ejercicio 3
                Declara dos variables de tipo Double y utiliza el operador < */ 
                
                double varDouble1 = 3.1416;
                double varDouble2 = 9.81;
                boolean esMenor = varDouble1 < varDouble2;
                boolean esMayor = varDouble1 > varDouble2;
                
                System.out.println(esMenor);//true
                System.out.println(esMayor);//false
        
    }
    
    
    
    
}