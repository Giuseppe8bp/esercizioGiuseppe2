/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
*/
package eserciziCorsoJava;

import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit frutto1 = new Fruit("Mela");
		Fruit frutto2 = new Fruit("Arancia");
		Fruit frutto3 = new Fruit("Banana");
		Fruit frutto4 = new Fruit("Ciliegia");

		// System.out.println(frutto1);

		// +Linkedlist
		List<Fruit> cestoFrutta = new java.util.LinkedList<Fruit>();
		cestoFrutta.add(frutto1);
		cestoFrutta.add(frutto2);
		cestoFrutta.add(frutto3);
		cestoFrutta.add(frutto4);

		for (Fruit frutta : cestoFrutta) {
			System.out.println(frutta);
		}
		System.out.println();

		cestoFrutta.addFirst(new Fruit("Uva"));

		cestoFrutta.addLast(new Fruit("Anguria"));
		
		for (Fruit frutta : cestoFrutta) {
			System.out.println(frutta);
		}
	}
}
