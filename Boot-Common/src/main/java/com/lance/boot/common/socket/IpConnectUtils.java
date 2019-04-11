package com.lance.boot.common.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author： zhangyinhua(LanceToBigData)
 * @description: 判断Ip、端口是否可以连接
 * @date 2019/3/1610:27
 */
public class IpConnectUtils {

    /**
     * 判断ip、端口是否可以连接
     *
     * @param host
     * @param port
     * @return
     */
    public static boolean isHostConnectable(String host, int port) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, port));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 判断ip是否可以连接（timeout是超时时间） 是否可以ping通
     *
     * @param host
     * @param timeOut
     * @return
     */
    public static boolean isHostReachable(String host, Integer timeOut) {
        try {
            return InetAddress.getByName(host).isReachable(timeOut);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
