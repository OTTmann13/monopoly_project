package de.studendCorp.app.dice;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DiceServer {
	public static void main(String args[]){
		try {
			Dice dice =  new Dice();
			Registry registry = LocateRegistry.createRegistry(4567);
			registry.rebind("Dice", dice);
			System.out.println("Server is ready!");
		} 
		catch (RemoteException e) {System.out.println(e);}	
	}
}	
