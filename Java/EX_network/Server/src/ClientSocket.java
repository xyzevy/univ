import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ClientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		/*Socket socket=new Socket("127.0.0.1",3336);
		BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		writer.println("USER root");
		writer.flush();
		String reponse = reader.readLine();*/
			Scanner sc=new Scanner(System.in);
			//ServerSocket ss=new ServerSocket(3337);
			Socket s,s2;
		while(true){
			String str=new Scanner(System.in).next();
			s=new Socket("192.168.101.149",3336);
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeUTF("�ְ�:"+str);
			dos.flush();
			s.close();
			
			/*s2=ss.accept();
			DataInputStream dis=new DataInputStream(s2.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s2.close();*/
			
		}
	}
}
