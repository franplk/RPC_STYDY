/**
 * 
 */
package cn.plk.zookeeper.operate;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;

/**
 * @author {康培亮/AB052634}
 *
 */
public abstract class ActionAPI<T> {
	
	protected ZooKeeper zooKeeper;
	
	public abstract byte[] getBytes(T t);
	public abstract T getObject(byte[] data);
	
	/**
	 * 此处采用的是CreateMode是PERSISTENT, 表示The znode will not be automatically
	 * deleted upon client's disconnect. EPHEMERAL 表示The znode will be
	 * deleted upon the client's disconnect.
	 */
	public final void create(String path, T t) throws KeeperException, InterruptedException {
		byte[] data = getBytes(t);
		zooKeeper.create(path, data, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
	}
	
	public final T getData(String path) throws KeeperException, InterruptedException {
		byte[] data = zooKeeper.getData(path, false, null);
		return getObject(data);
	}
	
	public final List<String> getChild(String path) throws KeeperException, InterruptedException {
		return zooKeeper.getChildren(path, false);
	}
	
	public ZooKeeper getZooKeeper() {
		return zooKeeper;
	}

	public void setZooKeeper(ZooKeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}
}
