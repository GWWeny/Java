package com.GT.Day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("格温");
        System.out.println(address);

        String name=address.getHostName();
        System.out.println(name);

        String ip=address.getHostAddress();
        System.out.println(ip);
    }
}
