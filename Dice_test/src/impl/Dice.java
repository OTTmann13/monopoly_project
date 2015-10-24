package impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.DiceRMI;

public class Dice extends UnicastRemoteObject implements DiceRMI{

	protected Dice() throws RemoteException {}

	private static final long serialVersionUID = 7856407424598201679L;

	public Roll roll() throws RemoteException {
		return new Roll(6);
	}

}
