package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;

public class DoSwitch {
	
	public void controlador() {
		Scanner s = new Scanner (System.in);
		Menus mp = new Menus();
		UsoWhile objetoUW = new UsoWhile();
		UsoFor objetoUF = new UsoFor();
		CicloDo cd = new CicloDo();
		
		int opcion = 0;
		
		do {
			mp.menuPrincipal();
			System.out.println("Introduzca un op: ");
			opcion = s.nextInt();
			
			switch (opcion) {
			case 1:
				objetoUW.cicloW();
				break;
			case 2:
				objetoUW.centinelaW();
				break;
			case 3:
				objetoUW.banderaW();
				break;
			case 4:
				objetoUF.cicloFor();
				break;
			case 5:
				objetoUF.letrasfor();
				break;
			case 6:
				cd.digitosDo();
				break;
			default:
				break;
			}
		} while (opcion != 7);
		
		
	}

}
