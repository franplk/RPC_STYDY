/**
 * 
 */
package cn.plk.zookeeper.watcher;

import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.Watcher.Event.KeeperState;

import cn.plk.zookeeper.operate.ActionAPI;

/**
 * @author {康培亮/AB052634}
 *
 */
public abstract class AbsractWatcher<T> extends ActionAPI<T> implements Watcher {

	public void connect(String hosts) throws IOException, InterruptedException {
		zooKeeper = new ZooKeeper(hosts, 2000, this);
	}

	@Override
	public void process(WatchedEvent event) {
		if (event.getState() == KeeperState.SyncConnected) {
			System.out.println("Connected");
		}
	}

	public void close() throws InterruptedException {
		zooKeeper.close();
	}
}