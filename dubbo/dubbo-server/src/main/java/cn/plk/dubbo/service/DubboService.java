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
		return "Hello," + username;
	}

}
