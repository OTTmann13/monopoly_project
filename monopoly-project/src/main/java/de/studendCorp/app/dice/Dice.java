package de.studendCorp.app.dice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import de.studendCorp.interfaces.dice.DiceRMI;

public class Dice extends UnicastRemoteObject implements DiceRMI{

	protected Dice() throws RemoteException {}

	private static final long serialVersionUID = 7856407424598201679L;

	public Roll roll() throws RemoteException {
		return new Roll(6);
	}

}