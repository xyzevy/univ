import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketDemo {
	public static void main(String[] args){
		String str=null;
		Socket clientSocket;
		DataInputStream in=null;
		DataOutputStream out=null;
		try{
			clientSocket=new Socket("127.0.0.1",3337);
			//clientSocket=new Socket("192.168.101.149",3336);
			in=new DataInputStream(clientSocket.getInputStream());
			out=new DataOutputStream(clientSocket.getOutputStream());
			out.writeUTF("���ǿͻ���������");
			int i=0;
			while(true){
				str=in.readUTF();
				out.writeUTF(i++ +"");
				System.out.println("�ͻ����յ�:"+str);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}