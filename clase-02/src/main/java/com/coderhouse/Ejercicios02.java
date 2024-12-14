package com.coderhouse;

public class Ejercicios02 {
	public static void main(String[] args) {
//		1. **Determina si un número es positivo**. Declara un número y usa `if` para verificar si es mayor que 0.
		int numEjer1 = 1;
		
		if(numEjer1 > 0) {
			System.out.println(numEjer1 + " Es positivo");
		}
		
//		2. **Verifica si una persona es mayor de edad** (>= 18 años).
		int numEjer2 = 18;
		
		if(numEjer2 >= 18) {
			System.out.println("La persona es mayor de edad, tiene " + numEjer2 + " años");
		}
		
//		3. **Comprueba si un número es impar** usando el operador `%`.
		int numEjer3 = 5;
		
		if(numEjer3 % 2 != 0) {
			System.out.println("El numero " + numEjer3 + " es impar");
		}
		
//		4. **Revisa si una cadena está vacía** usando `if` con `string.isEmpty()`.
		String cadena = " ";
		
		if(cadena.isEmpty()) {
			System.out.println("La variable " + cadena + " está vacia");
		}
		
//		5. **Determina si un número es divisible por 5**.
		int numEjer5 = 10;
		
		if (numEjer5 % 5 == 0) {
            System.out.println("El número " + numEjer5 + " es divisible por 5.");
        }
		
//		6. **Verifica si un número es par o impar** y muestra un mensaje correspondiente.
		int numEjer6 = 0;
		
		if(numEjer6 != 0) {
			if(numEjer6 % 2 == 0) {
				System.out.println("El numero " + numEjer6 + " es par");
			}else {
				System.out.println("El numero " + numEjer6 + " es impar");
			}
		}else {
			System.out.println("El numero " + numEjer6 + " no se puede evaluar si es par o impar");
		}
		
//		7. **Determina si una persona puede votar** (mayor de 18 años) o no.
		int numEjer7 = 15;
		
		if(numEjer7 >= 18) {
			System.out.println("La persona es mayor de edad, tiene " + numEjer7 + " años y puede votar");
		}else {
			System.out.println("La persona no es mayor de edad, tiene " + numEjer7 + " años, no puede votar");
		}
		
//		8. **Verifica si una letra es vocal o consonante** (para simplificar, considera solo las letras en minúsculas).
		String letra = "s".toLowerCase();
		
		if(letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
			System.out.println("La letra " + letra + " es una vocal");
		}else {
			System.out.println("La letra " + letra + " es consonante");
		}
		
//		9. **Revisa si un número es positivo, negativo o cero**.
		int numEjer9 = 0;
		boolean esPositivo = false;
		boolean esNegativo = false;
		boolean esCero = false;
		
		if(numEjer9 > 0) {
			esPositivo = true;
		}else if(numEjer9 < 0) {
			esNegativo = true;
		}else {
			esCero = true;
		}
		System.out.println("Se evalua el Nro. " + numEjer9 + ". Es positivo=" + esPositivo+ " Es negativo=" + esNegativo+ ". Es Cero=" + esCero);
		
//		10. **Determina si un año es bisiesto**. (Pista: un año es bisiesto si es divisible por 4 y no por 100, excepto si es divisible por 400).
		int numEjer10 = 2024;
		
        if ((numEjer10 % 4 == 0 && numEjer10 % 100 != 0) || (numEjer10 % 400 == 0)) {
            System.out.println("El año " + numEjer10 + " es bisiesto.");
        } else {
            System.out.println("El año " + numEjer10 + " no es bisiesto.");
        }
		
//		11. **Determina la categoría de una persona** según su edad: bebé (<2), niño (2-12), adolescente (13-18), adulto (19-64), anciano (65+).
        int numEjer11 = 32;
        
        if(numEjer11 < 2) {
        	System.out.println("La edad es " + numEjer11 + ", es un bebe");
        }else if(numEjer11 >= 2 && numEjer11 <= 12) {
        	System.out.println("La edad es " + numEjer11 + ", es un niño");
        }else if(numEjer11 >= 13 && numEjer11 <= 18) {
        	System.out.println("La edad es " + numEjer11 + ", es un adolecente");
        }else if(numEjer11 >= 19 && numEjer11 <= 64) {
        	System.out.println("La edad es " + numEjer11 + ", es un adulto");
        }else if(numEjer11 >= 65) {
        	System.out.println("La edad es " + numEjer11 + ", es un anciano");
        }
        
//		12. **Calcula el precio de una entrada al cine** según la edad: niño (5€), adulto (10€), anciano (7€).
        int numEjer12 = 50;
        float precio = 0.0f;
        
        if(numEjer12 >= 0 && numEjer12 <= 16) {
        	precio = 5.0f; // Niño
        }else if(numEjer12 >= 17 && numEjer12 <= 64) {
        	precio = 10.0f; // Adulto
        }else if(numEjer12 >= 65) {
        	precio = 7.0f; // Anciano
        }
        
        System.out.println("El precio para la persona con edad de " + numEjer12 + " años es: " + precio + "€");
        
//		13. **Asigna una nota** en función de la calificación: A (>=90), B (>=80), C (>=70), D (>=60), F (<60).
        int nota = (int) (Math.random() * 101); // Ramdom entre 0 y 100
        char calificacion = 'A';
        
        if(calificacion == 'A') {
        	nota = (int) (Math.random() * (100 - 90 + 1)) + 90;
        }else if(calificacion == 'B') {
        	nota = (int) (Math.random() * (90 - 80 + 1)) + 80;
        }else if(calificacion == 'C') {
        	nota = (int) (Math.random() * (80 - 70 + 1)) + 70;
        }else if(calificacion == 'D') {
        	nota = (int) (Math.random() * (70 - 60 + 1)) + 60;
        }else if(calificacion == 'F') {
        	nota = (int) (Math.random() * 60);
        }
        System.out.println("La calificacion es de " + calificacion + " y la nota fue de " + nota);
        
//		14. **Evalúa un número** si es negativo, positivo, o cero, mostrando un mensaje en cada caso.
        int numEjr14 = 0;
        
		if(numEjr14 > 0) {
			System.out.println("El número " + numEjr14 + " es positivo");
		}else if(numEjr14 < 0) {
			System.out.println("El número " + numEjr14 + " es negativo");
		}else {
			System.out.println("El número " + numEjr14 + " es cero");
		}
        
//		15. **Determina el nivel de peligro de un volcán** según su estado (dormido, activo, erupción inminente).
		String estadoVolvan = "Erupcion inminente".toLowerCase();
		int nivelPeligro = 0;
		
		if(estadoVolvan == "ERUPCION INMINENTE") {
			nivelPeligro = 1;
		}else if(estadoVolvan == "ACTIVO") {
			nivelPeligro = 2;
		}else if(estadoVolvan == "DORMIDO") {
			nivelPeligro = 3;
		}
		
		System.out.println("El nivel de peligro del volcan es " + nivelPeligro);
		
//		16. **Asigna un día de la semana** según un número del 1 al 7.
		int numEjer16 = 2;
		String dia = "";
		
		switch (numEjer16){
			case 1:
				dia = "Lunes";
				break;
			case 2:
				dia = "Martes";
				break;
			case 3:
				dia = "Miercoles";
				break;
			case 4:
				dia = "Jueves";
				break;
			case 5:
				dia = "Viernes";
				break;
			case 6:
				dia = "Sabado";
				break;
			case 7:
				dia = "Domingo";
				break;
			default:
				dia = "Inexistente";
				break;
		}
		
		System.out.println("El dia es: " + dia);
		
//		17. **Muestra el nombre de un mes** según un número del 1 al 12.
		int numEjer17 = 11;
		String mes = "";
		
		switch (numEjer17){
			case 1:
				mes = "Enero";
				break;
			case 2:
				mes = "Febrero";
				break;
			case 3:
				mes = "Marzo";
				break;
			case 4:
				mes = "Abril";
				break;
			case 5:
				mes = "Mayo";
				break;
			case 6:
				mes = "Junio";
				break;
			case 7:
				mes = "Julio";
				break;
			case 8:
				mes = "Agosto";
				break;
			case 9:
				mes = "Septiembre";
				break;
			case 10:
				mes = "Octubre";
				break;
			case 11:
				mes = "Noviembre";
				break;
			case 12:
				mes = "Diciembre";
				break;
			default:
				mes = "Inexistente";
				break;
		}
		System.out.println("El mes es: " + mes);
		
//		18. **Determina el nombre de una estación del año** según un número (1: invierno, 2: primavera, 3: verano, 4: otoño).
		int numEjer18 = 4;
		String estacion = "";
		
		switch (numEjer18){
			case 1:
				estacion = "invierno";
				break;
			case 2:
				estacion = "primavera";
				break;
			case 3:
				estacion = "verano";
				break;
			case 4:
				estacion = "otoño";
				break;
			default:
				estacion = "Inexistente";
				break;
		}
		
		System.out.println("La estación del año es: " + estacion);
		
//		19. **Calcula operaciones aritméticas básicas** (suma, resta, multiplicación, división) según un operador ingresado (`+`, `-`, `*`, `/`).
		float num1 = 2.0f;
		float num2 = 22.0f;
		float resultado = 0.0f;
		char operacion = '*';
		
		switch (operacion){
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1 - num2;
				break;
			case '*':
				resultado = num1 * num2;
				break;
			case '/':
				resultado = num1 / num2;
				break;
			default:
				resultado = -1.0f;
				break;
		}
		
		System.out.println("El resultado de la operación es: " + resultado);
		
//		20. **Verifica el tipo de fruta** según su código: 1: manzana, 2: plátano, 3: naranja, 4: uva.
		int numEjer20 = 4;
		String fruta = "";
		
		switch (numEjer20){
			case 1:
				fruta = "manzana";
				break;
			case 2:
				fruta = "platano";
				break;
			case 3:
				fruta = "naranja";
				break;
			case 4:
				fruta = "uva";
				break;
			default:
				fruta = "Inexistente";
				break;
		}
		
		System.out.println("La fruta es: " + fruta);
		
//		21. **Verifica si un número es par o impar** usando un operador ternario.
		int numEjer21 = 4;
		String parImpar = (numEjer21 % 2 == 0) ? "Par" : "Impar";
		System.out.println("El número es " + parImpar);
		
//		22. **Determina si una persona es mayor de edad** con un operador ternario.
		int numEjer22 = 17;
		System.out.println("La persona es " + ((numEjer22 >= 18) ? "Mayor" : "Menor"));
		
//		23. **Asigna el valor "Positivo" o "Negativo"** a una variable según el valor de un número.
		int numEjer23 = 0;
		String positivoONegativo = (numEjer23 > 0) ? "Positivo" : "Negativo";
		System.out.println("El número es " + ((numEjer23 == 0) ? "" : positivoONegativo)); // El cero no puede ser positivo ni negativo, no muesto valor
		
//		24. **Calcula el mayor de dos números** usando un operador ternario.
		int numero1 = 0;
		int numero2 = 0;
		int numeroMayor = (numero1 > numero2) ? numero1 : numero2;
		System.out.println("El número mayor es " + ((numero1 == numero2) ? "" : numeroMayor)); // SI ambos son iguales no muestro valor		
		
//		25. **Asigna un valor "Aprobado" o "Reprobado"** a una variable en función de una nota.
		int numEjer25 = 7;
		String aprobadoReprobado = (numEjer25 > 6) ? "Aprobado" : "Reprobado";
		System.out.println("El valor es " + aprobadoReprobado);
		
//		26. **Genera un número aleatorio entre 1 y 10** y muestra un mensaje si es mayor que 5.
		int numEjer26 = (int) (Math.random() * 10) + 1;
		if (numEjer26 > 5) {
		    System.out.println("El número " + numEjer26 + " es mayor que 5.");
		}
		
//		27. **Simula el lanzamiento de un dado** con `Math.random()` y muestra el resultado.
		int numEjer27 = (int) (Math.random() * 6) + 1;
		System.out.println("Salió el dado de " + numEjer27 + " caras");
		
//		28. **Genera un número aleatorio entre 0 y 100** y determina si es mayor, menor o igual a 50.
		int numEjer28 = (int) (Math.random() * 100);
		
		if(numEjer28 == 50) {
			System.out.println("El numero aleatorio fue igual a 50...: " + numEjer28);
		}else {
			if(numEjer28 < 50) {
				System.out.println("El numero aleatorio fue menor a 50...: " + numEjer28);
			}else {
				System.out.println("El numero aleatorio fue mayor a 50...: " + numEjer28);
			}
		}
		
//		29. **Simula una moneda** (cara o cruz) usando `Math.random()`.
//		30. **Genera un número aleatorio entre 1 y 100** y determina si es múltiplo de 10.
//		31. **Determina si un número es positivo, negativo o cero** usando un operador ternario.
//		32. **Simula un semáforo**. Muestra el estado (verde, amarillo, rojo) según un número aleatorio del 1 al 3.
//		33. **Crea un programa que simule una lotería**. Genera un número aleatorio y verifica si es igual a un número predeterminado.
//		34. **Genera un número aleatorio entre 1 y 100** y evalúa si es divisible por 3 o por 5.
//		35. **Simula un dado** y determina si el número obtenido es mayor o igual a 4.
//		36. **Genera un número aleatorio entre 1 y 100** y clasifícalo en categorías: bajo (<30), medio (>=30 y <=70), alto (>70).
//		37. **Determina si un número generado aleatoriamente entre 1 y 100** es primo o no.
//		38. **Simula una adivinanza de un número** entre 1 y 10. El usuario ingresa un número y el programa le dice si acertó o no.
//		39. **Genera un número aleatorio entre 1 y 50** y verifica si está en el rango de [20, 30].
//		40. **Simula un lanzamiento de tres dados** y verifica si la suma de los resultados es mayor que 10.
//		41. **Simula una ruleta de colores**: genera un número aleatorio del 1 al 5 y asigna un color.
//		42. **Calcula el descuento** en una tienda dependiendo del tipo de cliente: 1. Normal (sin descuento), 2. Miembro (10% de descuento), 3. VIP (20% de descuento).
//		43. **Evalúa el clima**: genera un número aleatorio y asigna un estado del tiempo (soleado, nublado, lluvioso, nevando).
//		44. **Determina el ganador de un juego de piedra, papel o tijera** usando números aleatorios y `switch`.
//		45. **Simula un juego de adivinanza**: el usuario tiene que adivinar un número entre 1 y 5 generado aleatoriamente.
//		46. **Crea un programa que asigne una beca**: si la nota es >= 85 y la edad < 25, el estudiante recibe una beca.
//		47. **Determina si un número generado aleatoriamente entre 1 y 100** es un número perfecto (la suma de sus divisores propios es igual al número).
//		48. **Genera dos números aleatorios** entre 1 y 100 y muestra cuál es mayor.
//		49. **Genera un número aleatorio entre 1 y 100** y evalúa si es mayor que 75 usando un operador ternario.
//		50. **Simula un juego de dados**: si la suma de dos dados es 7 o 11, el jugador gana.
		
	}
}
