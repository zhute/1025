package udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1. 创建 Server 的 Socket
        //    内部会进行本地 ip + port 的绑定
        //    例子：饭店开张，提供一个大家都认识的地段 ip + port
        //    ip 虽然没传，内部会帮我们处理，把所有的 ip 都会绑定
        try (DatagramSocket socket = new DatagramSocket(9939)) {

            // 2. 开门迎客，通过循环，处理业务
            while (true) {
                // 3. 处理一个要求
                action(socket);
            }
        }
    }

    /**
     * 处理要求
     * @param socket
     */
    private static void action(DatagramSocket socket) throws IOException {
        // 1. 读取客户端发来的请求

        // 1.1 准备一个字节数组，用来一会存放要读到的数据
        byte[] receiveBuffer = new byte[8192];
        // 1.2 把 buffer 封装成 datagram
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, 0, 8192);
        // 1.3 读取请求               2020-04-18 开始准备接收
        socket.receive(receivePacket);
        //                            4040-04-18 成功接收
        // 1.4 从 receive 中返回，就意味着，有人给我发送请求了

        System.out.println(
                Arrays.toString(
                        Arrays.copyOfRange(receiveBuffer, 0, receivePacket.getLength())
                )
        );

        // 2. 进行服务 —— 根据请求，处理业务，并生成响应
        // 3. 发送响应回去
    }
}
