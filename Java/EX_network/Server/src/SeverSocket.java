import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverSocket {
	public static void main(String[] args) throws IOException, InterruptedException{
		//try{
			ServerSocket serverSocket=null;
			Socket clientSocket=null;
			String str=null;
			DataOutputStream out=null;
			DataInputStream in=null;
			serverSocket=new ServerSocket(4331);
			System.out.println("�ȴ���ͻ��������ӣ�����");
			clientSocket=serverSocket.accept();
			in=new DataInputStream(clientSocket.getInputStream());
			
			out=new DataOutputStream(clientSocket.getOutputStream());
			while(true){
				str=in.readUTF();
				out.writeUTF(str);
				System.out.println("�������յ���"+str);
				Thread.sleep(1000);
			}
		//}catch(Exception e){
		//	e.printStackTrace();
		//}
	}
}