package ricardodc.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Ricardo
 *
 */
public class Main {

	/**
	 * Devuelve un array de Char con el tamaño indicado
	 * 
	 * @param tamano contiene el tamaño del que se va a crear el array
	 * @return devuelve un array de char del tamaño especificado
	 */
	public static char[][] ciudad(int tamano) {

		return new char[tamano][tamano];
	}

	/**
	 * Introduce un sol en la primera fila del array en una posición aleatoria
	 * 
	 * @param meterSol variable char[][] en la que se va aintroducir el sol
	 */
	public static void solAleatorio(char[][] meterSol) {

		Random rand = new Random();

		meterSol[0][rand.nextInt(meterSol.length - 1)] = '*';

	}

	/**
	 * Función que coloca las olas y el horizonte en el array char
	 * 
	 * @param meterAgua variable char[][] en la que se van a introducir olas y
	 *                  horizonte
	 * @return devuelve la matriz modificada con olas y horizonte
	 */
	public static byte ponerAgua(char[][] meterAgua) {

		byte devolverByte = 0;

		if (meterAgua.length < 4) {

			devolverByte = -1;
		}

		if (meterAgua.length == 4) {

			for (int i = 0; i < meterAgua.length; i++) {

				meterAgua[meterAgua.length - 2][i] = 'o';
				meterAgua[meterAgua.length - 3][i] = 'h';
			}

			devolverByte = 0;
		} else if (meterAgua.length == 5) {

			for (int i = 0; i < meterAgua.length; i++) {

				meterAgua[2][i] = 'o';
				meterAgua[meterAgua.length - 2][i] = 'h';
			}

			devolverByte = 1;

		} else if (meterAgua.length == 6) {

			for (int i = 0; i < meterAgua.length; i++) {

				meterAgua[2][i] = 'o';
				meterAgua[3][i] = 'h';
			}

			devolverByte = 2;

		} else if (meterAgua.length >= 7) {

			for (int i = 0; i < meterAgua.length; i++) {

				meterAgua[3][i] = 'o';
				meterAgua[meterAgua.length - 3][i] = 'h';

				devolverByte = (byte) (meterAgua.length - 4);
			}

		}

		return devolverByte;
	}

	/**
	 * Función para la colocación de nubes, barcos, sombrillas, conos y surfistas en
	 * las posiciones filas indicadas en el examen
	 * 
	 * @param colElemento array de char donde se van a colocar los elementos
	 */
	public static void colocarElementos(char[][] colElemento) {
<<<<<<< HEAD
=======
		
		 
		 boolean b_nube = false;
		 boolean b_barco = false;
		 boolean b_sombrilla = false;
		 Random rand = new Random();
		 int n_count = 4;
		 int b_count = 2;
		 char barcoSurf[] = {' ','u','c'};
		 int posicionHO[] = {0,0};
		 
		 /* 
		  * u - surf
		  * c - cono
		  * */
		 
		 for(int i=0;i<colElemento.length;i++) {
			 
			
			 if(Character.compare(colElemento[1][i],' ')!=0) {
				 
				b_nube = true;
				 			 
			 }
			 if(Character.compare(colElemento[2][i],' ')!=0) {
				 
					b_barco = true;
					 			 
				 }
			 if(Character.compare(colElemento[colElemento.length-2][i],' ')!=0) {
				 
					b_sombrilla = true;
					 			 
				 }
			
			 
			 
			 
		 }
		 
		 for(int j=0;j<colElemento.length;j++) {
			 
			 if(!b_nube) {
				 
					 
					 if(rand.nextBoolean()) {
						 
						 if(n_count!=0) {
						 colElemento[1][j]='n';
						 
						 n_count--;
						 
						 }
					 
				 	}
				 
				 }
			 
			 if(!b_barco) {
				
					 
					 if(rand.nextBoolean()) {
						 
						 if(b_count!=0) {
						 colElemento[2][j]='b';
						 
						 b_count--;
						 
						 }										 
					 
				 	}
				 
				 }
			 
			 
			 if(!b_sombrilla) {
				
					 
					 if(rand.nextBoolean()) {
										
						 colElemento[colElemento.length-2][j]='s';
						 
						 
					 }
					 
				 	}
				 
			 
			 
		 }
		/* 
		 if(!b_nube) {
		 for(int j=0;j<colElemento.length;j++) {
			 
			 if(rand.nextBoolean()) {
				 
				 if(n_count!=0) {
				 colElemento[1][j]='n';
				 
				 n_count--;
				 
				 }
				 
			 }
			 
		 	}
		 
		 }
		 
		 if(!b_barco) {
			 for(int j=0;j<colElemento.length;j++) {
				 
				 if(rand.nextBoolean()) {
					 
					 if(b_count!=0) {
					 colElemento[2][j]='b';
					 
					 b_count--;
					 
					 }
					 
				 }
				 
			 	}
			 
			 }
		
		 
		 if(!b_sombrilla) {
			 for(int j=0;j<colElemento.length;j++) {
				 
				 if(rand.nextBoolean()) {
									
					 colElemento[colElemento.length-2][j]='s';
					 
					 
				 }
				 
			 	}
			 
			 }
		 */
		 //Colocación barcoSurf
		 
		for(int i=0;i<colElemento.length;i++) {
			
			if(colElemento[i][i] == 'o') {
				
				posicionHO[0] = i;
			}

			if(colElemento[i][i] == 'h') {
				
				posicionHO[1] = i;
			}
		}
		
		
		for(int i=posicionHO[0];i<posicionHO[1];i++) {
			
			for(int j=0;j<colElemento.length;j++) {
				
				colElemento[i][j] = barcoSurf[rand.nextInt(3)];
				
			}
			
		}
		
		 
	 }


		boolean b_nube = false;
		boolean b_barco = false;
		boolean b_sombrilla = false;
		Random rand = new Random();
		int n_count = 4;
		int b_count = 2;
		char barcoSurf[] = { ' ', 'u', 'c' };
		int posicionHO[] = { 0, 0 };

		/*
		 * u - surf c - cono
		 */

		for (int i = 0; i < colElemento.length; i++) {

			if (Character.compare(colElemento[1][i], ' ') != 0) {

				b_nube = true;

			}
			if (Character.compare(colElemento[2][i], ' ') != 0) {

				b_barco = true;

			}
			if (Character.compare(colElemento[colElemento.length - 2][i], ' ') != 0) {

				b_sombrilla = true;

			}

		}

		for (int j = 0; j < colElemento.length; j++) {

			if (!b_nube) {

				if (rand.nextBoolean()) {

					if (n_count != 0) {
						colElemento[1][j] = 'n';

						n_count--;

					}

				}

			}

			if (!b_barco) {

				if (rand.nextBoolean()) {

					if (b_count != 0) {
						colElemento[2][j] = 'b';

						b_count--;

					}

				}

			}

			if (!b_sombrilla) {

				if (rand.nextBoolean()) {

					colElemento[colElemento.length - 2][j] = 's';

				}

			}
		}

		// Colocación barcoSurf

		for (int i = 0; i < colElemento.length; i++) {

			if (colElemento[i][i] == 'o') {

				posicionHO[0] = i;
			}

			if (colElemento[i][i] == 'h') {

				posicionHO[1] = i;
			}
		}

		for (int i = posicionHO[0]; i < posicionHO[1]; i++) {

			for (int j = 0; j < colElemento.length; j++) {

				colElemento[i][j] = barcoSurf[rand.nextInt(3)];

			}

		}

	}

	/**
	 * Se pueden enviar argumentos al programa principal para pedir ayuda con "-h o
	 * -help". Y además se puede enviar "-tamano (Numero entero)" para no introducir
	 * por teclado los valores de la matriz
	 * 
	 * @param args argumentos que se envian al Main del programa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorIntroducido = 0;
		Scanner valor = new Scanner(System.in);
		char[][] matriz = null;
		int filasVacias = 0;
		boolean seguir = true;


		String[] arg = { "-h", "-help" };

		if (args.length > 0 && (args[0].compareTo(arg[0]) == 0 || args[0].compareTo(arg[1]) == 0)) {

			System.out.println("Envíe el argumento -tamano seguido de un número entre 2 y 10, reinicie el programa");

		} else if (args.length > 0 && args[0].compareTo("-tamano") == 0
				&& (Integer.parseInt(args[1]) >= 2 && Integer.parseInt(args[1]) <= 10)) {

			valorIntroducido = Integer.parseInt(args[1]);

		}

		
		String[] arg = {"-h","-help"};
		
		if(args.length > 0 && args[0].compareTo(arg[0])== 0) {
			
			System.out.println("Envie el argumento -tamano seguido de un número entre 2 y 10, reinicie el programa");
			
		}else if(args.length > 0 && args[0].compareTo("-tamano")== 0 && (Integer.parseInt(args[1])>=2 && Integer.parseInt(args[1])<=10)) {
			
			valorIntroducido = Integer.parseInt(args[1]);
			
			
		}
		if(args.length == 0){
		
			
			


		do {
			System.out.println("Introduzca un número entro 2 y 10");


			if (args.length == 0)
				valorIntroducido = valor.nextInt();

			if(args.length == 0)valorIntroducido = valor.nextInt();


			if (valorIntroducido <= 2 && valorIntroducido >= 10) {

				System.out.println("Ha introducido un valor incorrecto el programa acaba aqui, reinicie");
				seguir = false;
			}
		} while (valorIntroducido <= 2 && valorIntroducido >= 10);


		if (seguir) {

		if(seguir) {
		
		matriz = ciudad(valorIntroducido);


			matriz = ciudad(valorIntroducido);

			// Inicialización del array

			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz.length; j++) {

					matriz[i][j] = ' ';
				}

			}

			for (int i = 0; i < matriz.length; i++) {

				matriz[matriz.length - 1][i] = 'p';

<<<<<<< HEAD
=======
			matriz[matriz.length - 1][i] = 'p';

		}

		/*
		 * asterisco-sol p-playa o-olas h-horizonte
		 * 
		 * n-nube b-barco s-sombrilla
		 * 
		 */

		solAleatorio(matriz);
		ponerAgua(matriz);
		
		if(ponerAgua(matriz)>0) {
		colocarElementos(matriz);
		}
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j]);
>>>>>>> 57546300c03566651ed85d5cdebdc70606cb037c
			}

			/*
			 * asterisco-sol p-playa o-olas h-horizonte
			 * 
			 * n-nube b-barco s-sombrilla
			 * 
			 */

			solAleatorio(matriz);
			ponerAgua(matriz);

<<<<<<< HEAD
			if (ponerAgua(matriz) > 0) {
				colocarElementos(matriz);
			}
			for (int i = 0; i < matriz.length; i++) {
=======
		
		
		filasVacias = ponerAgua(matriz);
		
		if (valorIntroducido >= 7) {
>>>>>>> 57546300c03566651ed85d5cdebdc70606cb037c

				for (int j = 0; j < matriz.length; j++) {

					System.out.print(matriz[i][j]);
				}

				System.out.printf("\n");

			}

			filasVacias = ponerAgua(matriz);

			if (valorIntroducido >= 7) {

				System.out.println("El número de casillas vacias es: " + filasVacias);

			}

		}

	}
}
}
}
