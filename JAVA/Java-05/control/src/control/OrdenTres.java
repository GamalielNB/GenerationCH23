package control;

public class OrdenTres {


    System.out.println("Introduzca el primer numero: ");
    int num1 = dato.nextInt();

    System.out.println("Introduzca el segundo numero: ");
    int num2 = dato.nextInt();

    System.out.println("Introduzca el tercer numero: ");
    int num3 = dato.nextInt();

    if (num1 >= num2 && num1 >= num3) {
        if (num2 >= num3) {
            System.out.println(num1 + "," + num2 + "," + num3);
        } else {
            System.out.println(num1 + "," + num3 + "," + num2);
        }
    } else if (num2 >= num1 && num2 >= num3) {
        if (num1 >= num3) {
            System.out.println(num2 + "," + num1 + "," + num3);
        } else {
            System.out.println(num2 + "," + num3 + "," + num1);
        }
    } else {
        if (num1 >= num2) {
            System.out.println(num3 + "," + num1 + "," + num2);
        } else {
            System.out.println(num3 + "," + num2 + "," + num1);
        }
    }
}

