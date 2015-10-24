package impl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import interfaces.DiceRMI;

public class DiceServer {
	public static void main(String args[]){
		try {
			Dice dice =  new Dice();
			//DiceRMI stub = (DiceRMI) UnicastRemoteObject.exportObject(dice, 9999);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("Dice", dice);
			System.out.println("Server is ready!");
		} 
		catch (RemoteException e) {System.out.println(e);}
		//catch (AlreadyBoundException e) {System.out.println(e);}	
	}
}	
