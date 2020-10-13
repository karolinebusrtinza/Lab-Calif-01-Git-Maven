package com.tencsup.lab04.controller;
import com.tencsup.lab04.model.*;
import java.util.Scanner;

public class UserController {
	
	
	public static void main(String args[]) {
		String nom;
		String ape;
		int eda;
		User x= new User();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		nom = teclado.nextLine();
		System.out.print("Apellidos: ");
		ape = teclado.nextLine();
		System.out.print("Edad: ");
		eda = teclado.nextInt();
		
		x.nombre=nom;
		x.apellidos=ape;
		x.edad=eda;
		System.out.println("Nombre del usuario: "+x.nombre);
		System.out.println("Apellidos del usuario: "+x.apellidos);
		System.out.println("Edad del usuario: "+x.edad);
		
		
	}
}
