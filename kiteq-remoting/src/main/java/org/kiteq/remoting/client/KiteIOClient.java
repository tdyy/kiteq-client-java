package org.kiteq.remoting.client;

import org.kiteq.remoting.listener.KiteListener;

import java.util.Set;

/**
 * @author gaofeihang
 * @since Feb 11, 2015
 */
public interface KiteIOClient {
    
    void send(byte cmdType, byte[] data);
    
    <T> T sendAndGet(byte cmdType, byte[] data);
    
    void registerListener(KiteListener listener);
    
    void start() throws Exception;

    boolean reconnect();

    boolean isDead();

    void close();
    
    String getServerUrl();

    Set<String> getAcceptedTopics();

    boolean handshake();
}
