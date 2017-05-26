/**
 * 
 */
package cn.plk.dubbo.service;

import cn.plk.dubbo.api.HelloAPI;

/**
 * @author {康培亮/AB052634}
 *
 */
public class DubboService implements HelloAPI {

	@Override
	public String greeting(String username) {
		if (username == null || "".equals(username)) {
			username = "dubbo";
		}
		return "Hello," + username;
	}

}
