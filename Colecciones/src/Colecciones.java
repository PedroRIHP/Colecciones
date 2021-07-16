import java.lang.reflect.Array;
import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * La coleccion Set no puede contener eleentos duplicados
		 * solo tiene los metodos heredados de collection
		 * Existen diferentes tipos de implementaciones
		 * 
		 * HashSet: Esta implementacion almacena los elemetos en una tabla hash.
		 * es la que mejor rendimiento tiene.
		 * Los elementos no tienen un orden
		 * 
		 * TreeSet
		 * HashSet // no tiene orden
		 * LinkedHashSet // el orden lo da por orden de entrada, lo primero que le metimos es lo primero que muestra
		 * 
		 */
		
		Set <String> frutas = new LinkedHashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("pera");
		frutas.add("cereza");
		frutas.add("mandarina");
		frutas.add("carambola");
		frutas.add("maracuya");
		frutas.add("platano");
		frutas.add("Mango");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
		System.out.println(frutas.contains("Guayaba"));
		System.out.println(frutas.size());
		
		/*
		 * La interfaz List define una sucesión de elementos.
		 * Si admite elementos duplicados.
		 * Añade nuevos metodos que podemos usar
		 * acceso posicional a elementos: manipula elementos en funcion de su posicion en la lista
		 * busqueda de elementos: busca un elemento concreto de la lista y devuelve su ubicacion
		 * rango de operacion: permite realizar ciertas operaciones sobre rangos de elementos dentro de la propia lista
		 * 
		 * implementaciones:
		 * arraylist
		 * linkedlist
		 * 
		 */
		
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("pera"); // si nosotros incertamos un nuevo elemento despues de pera, Recorre el indice de todos los de adelante, si esto es un alista de 1millon de elementos se modifican todos los indices delante de pera
		frutas2.add("cereza");
		frutas2.add("mandarina");
		frutas2.add("carambola");
		frutas2.add("maracuya");
		frutas2.add("platano");
		frutas2.add("Mango");
		
		for (String f : frutas2) { // en un ciclo for declaramos la variable f que reccorre toda la lista de peras
			System.out.println(f);
		}
		
		int pera = frutas2.indexOf("pera"); //nos dice la posicion del elemento en la lista
		System.out.println(pera);
		System.out.println(frutas2.get(pera)); // busca el elemento pera
		
		/*
		 * Int dato primitivo
		 * Integer es un objeto
		 */
		
		List<Integer> agenda = new ArrayList<Integer>(); // int es un valor primitivo nuemero, Integer es un objeto de numero
		agenda.add(123);
		agenda.add(456);
		agenda.add(789);
		for (Integer a: agenda) {
			System.out.println(a);
		}
		
		//Linkedlist
		List<String> animales = new LinkedList<String>();
		animales.add("perro");
		animales.add("gato");
		
		animales.add("conejo");
		animales.add("tortuga");
		
		int oso = animales.indexOf("oso");
		animales.add(oso,"vaca");
		animales.add("oso");
		animales.add("quetzal");
		
		for(String an: animales) {
			System.out.println(an);
		}
		
		/*
		 * La interfaz Map asocia claves a valores.
		 * No puede contener claves duplicadas
		 * y cada clave solo puede tner asociado un valor
		 * 
		 * Implementaciones
		 * 
		 * HashMap
		 * TreeMap
		 * LinkedHashMap
		 * 
		 */
		
		Map <String,String> diccionario = new HashMap<>();
		//list o arreglos
		diccionario.put("elemento1", "Carlos eduardo");//el primer elemento es la clave(el indice su ID, su INE pues jaja) y el segundo elemento es el valor asociado a la clave
		diciconario.put("telefono","121212");
		diccionario.put("llave", "wewew");
		
		System.out.println(diccionario.get("elemento1"));
		
		for (Map.Entry<Integer, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getkey()+ ":" + entry.getValue());
		}
		
		
		/*
		 * animales[0]= "perro";
		 * animales[1]="gato";
		 * animales[2]=" caballo";
		 */
		
		/*
		 * implementacion
		 * TreeMap
		 * ordena los elementos de menor a mayor dependiendo las claves
		 */

		Map <String,String> diccionario2 = new TreeMap<>();
		//diccionario.put(clave,valor);
		diccionario2.put("elemento1", "Carlos eduardo");//el primer elemento es la clave(el indice su ID, su INE pues jaja) y el segundo elemento es el valor asociado a la clave
		diciconario2.put("telefono","121212");
		diccionario2.put("llave", "wewew");
		
		System.out.println("Implementación LinkedHashMap");
		
		
		for (Map.Entry<Integer, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getkey()+ ":" + entry.getValue());
		}
		
	}

}
,