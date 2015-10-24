package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import impl.Roll;

public interface DiceRMI extends Remote{
	
	Roll roll() throws RemoteException;

}
