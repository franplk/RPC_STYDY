/**
 * 
 */
package cn.plk.dubbo.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.plk.dubbo.api.HelloAPI;

/**
 * @author {康培亮/AB052634}
 *
 */
@Controller
public class HelloController {

	@Autowired
	private HelloAPI dubboService;

	public String greeting(String username) {
		return dubboService.greeting("dubbo");
	}

}
