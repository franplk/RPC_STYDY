package cn.plk.javarmi.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import cn.plk.rpc.api.HelloAPI;

public class RMIService extends UnicastRemoteObject implements HelloAPI {

	private static final long serialVersionUID = 1L;

	public RMIService() throws RemoteException {
		super();
	}

	@Override
	public String greeting(String username) throws RemoteException {
		return "Hello," + username;
	}

}
