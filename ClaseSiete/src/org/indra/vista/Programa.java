package org.indra.vista;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.reflect.*;

import org.indra.models.*;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		/*List<String> lista = Arrays.asList("Calculadora","Espacio","Nota","Garabato","Cielo");
		Consumer<String> metodoLambda = (n) -> { System.out.println("--" + n + "--");};
		lista.forEach(metodoLambda);*/
		
		/*JButton button = new JButton("Haz click aqui");
		button.setBounds(1, 1, 300, 50);
		button.addActionListener( (e) -> { JOptionPane.showConfirmDialog(button, "Hiciste click a un lambda");});
		
		JFrame f = new JFrame();
		f.add(button);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(640,480);
		f.setVisible(true);*/
		
		/*Animal garfield = new Gato();
		garfield.mostrar((a) -> {System.out.println("Soy un animal que hace "+a.getSonido());});
		
		IDibujador porConsola = (Animal a) -> {System.out.println("Soy un animal que hace "+a.getSonido());};
		Animal pluto = new Perro();
		pluto.mostrar(porConsola);
		garfield.mostrar(porConsola);*/
		
		/*List<String> lista = Arrays.asList("a","b","c","d");
		lista.forEach(System.out::println); //lista.forEach( (a) -> System.out.println(a) );*/
		
		/*IDibujador porConsola = (Animal a) -> {System.out.println("Soy un " + a.getClass().getSimpleName() + " que hace " + a.getSonido());};
		Animal pluto = new Perro();
		pluto.mostrar(porConsola);*/
		
		/*IDibujador porConsola = (Animal a) -> {System.out.println("Soy un " + a.getClass().getSimpleName() + " que hace " + a.getSonido());};
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Que animal quieres crear?");
			String animal = sc.nextLine();
			Class creador = Class.forName("org.indra.models."+animal);
			Animal a = (Animal) creador.newInstance();
			a.mostrar(porConsola);
		}*/
		
		/*ArrayList<String> lista = new ArrayList<String>();
		Class claseArrayList = lista.getClass();
		Stream<Method> metodos = Arrays.stream(claseArrayList.getMethods()); 
		metodos.forEach(m -> System.out.println(m.getName()));*/
		
		/*String str = new String("Hola que tal");
		Class claseString = str.getClass();
		Stream<Method> metodos = Arrays.stream(claseString.getMethods()); 
		//metodos.forEach(m -> System.out.println(m.getName()));
		Method methodLength = metodos.filter( m -> m.getName().equals("length")).findFirst().get();
		int tamaño = (Integer) methodLength.invoke(str);
		System.out.println(tamaño);*/
		
		/*String str = new String("Hola que tal");
		Class claseString = str.getClass();
		Stream<Method> metodos = Arrays.stream(claseString.getMethods()); 
		Method methodContains = metodos.filter( m -> m.getName().equals("contains")).findFirst().get();
		boolean contiene = (Boolean) methodContains.invoke(str, "que");
		System.out.println(contiene?"Si lo contiene":"No lo contiene");*/
		
		
	}

}
