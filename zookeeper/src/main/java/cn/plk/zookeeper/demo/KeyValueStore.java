/**
 * 
 */
package cn.plk.zookeeper.demo;

import cn.plk.zookeeper.watcher.AbsractWatcher;

/**
 * @author {康培亮/AB052634}
 *
 */
public class KeyValueStore extends AbsractWatcher<String> {

	@Override
	public byte[] getBytes(String t) {
		return t.getBytes();
	}

	@Override
	public String getObject(byte[] data) {
		return new String(data);
	}
}