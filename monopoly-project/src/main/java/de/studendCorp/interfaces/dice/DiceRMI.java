package de.studendCorp.interfaces.dice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import de.studendCorp.app.dice.Roll;

public interface DiceRMI extends Remote{
	
	Roll roll() throws RemoteException;

}

