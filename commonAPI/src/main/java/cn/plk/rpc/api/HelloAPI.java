/**
 * 
 */
package cn.plk.rpc.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author {康培亮/AB052634}
 *
 */
public interface HelloAPI extends Remote {
	
	public String greeting (String username) throws RemoteException;

}
