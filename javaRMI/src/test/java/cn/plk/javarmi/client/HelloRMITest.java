/**
 * 
 */
package cn.plk.javarmi.client;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import cn.plk.rpc.api.HelloAPI;

/**
 * @author {康培亮/AB052634}
 *
 */
public class HelloRMITest {

	public static void main(String[] args) {

		Registry registry = null;
		try {
			registry = LocateRegistry.getRegistry(18888);
			String[] serverNameList = registry.list();
			for (String serverName : serverNameList) {
				System.out.println(serverName);
			}
			HelloAPI helloServer = (HelloAPI) registry.lookup("helloServer");
			String greeting = helloServer.greeting("Franplk");
			System.out.println("Greeting = " + greeting);
		} catch (AccessException e) {

		} catch (RemoteException e) {

		} catch (NotBoundException e) {

		}
	}

}
