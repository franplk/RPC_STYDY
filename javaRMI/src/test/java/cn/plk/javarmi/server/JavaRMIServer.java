/**
 * 
 */
package cn.plk.javarmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import cn.plk.javarmi.service.RMIService;

/**
 * @author {康培亮/AB052634}
 *
 */
public class JavaRMIServer {

	public static void main(String[] args) {
		try {
			// 创建一个服务注册管理器
			Registry registry = LocateRegistry.createRegistry(18888);
			
			// 创建一个服务
			RMIService helloService = new RMIService();
			
			// 将服务绑定命名
			registry.rebind("helloServer", helloService);

			System.out.println("bind server");
		} catch (RemoteException e) {

		}
	}

}
