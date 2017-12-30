package Server;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
public class server extends JFrame{ // ������MyTcp
	private BufferedReader reader; // ����BufferedReader����
	private ServerSocket server; // ����ServerSocket����
	private Socket socket; // ����Socket����socket
	private JTextArea ta = new JTextArea(); // ����JtextArea����
	private JTextField tf = new JTextField(); // ����JtextField����
	Container cc; // ����Container����
	private PrintWriter writer; // ����PrintWriter�����
	public server(String title) { // ���췽��
		super(title); // ���ø���Ĺ��췽��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc = this.getContentPane(); // ʵ��������

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf, "South"); // ���ı�����ڴ�����²�
		tf.addActionListener(new ActionListener() {
			// ���¼�
			public void actionPerformed(ActionEvent e) {
				// ���ı�������Ϣд����
				writer.println(tf.getText());
				// ���ı�������Ϣ��ʾ���ı�����
				ta.append(tf.getText() + '\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText(""); // ���ı������
			}
		});
	}
	void getserver() {
		try {
			server = new ServerSocket(8998); // ʵ����Socket����
			ta.append("�������׽����Ѿ������ɹ�"); // �����Ϣ
			ta.append("\n");
			while (true) { // ����׽���������״̬
				ta.append("�ȴ��ͻ���������"); // �����Ϣ
				ta.append("\n");
				socket = server.accept(); // ʵ����Socket����
				sendMessage();
				reader = new BufferedReader(new InputStreamReader(socket
						.getInputStream())); // ʵ����BufferedReader����
				getClientMessage(); // ����getClientMessage()����
			}
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}
	private void sendMessage() { 
		try { // ��׽�쳣
			writer = new PrintWriter(socket.getOutputStream(), true);
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}
	private void getClientMessage() {
		try {
			while (true) { // ����׽���������״̬
				if (reader.ready()) {
					// ��ÿͻ�����Ϣ
					ta.append("�ͻ���:" + reader.readLine());
					ta.append("\n");	
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
		try {
			if (reader != null) {
				reader.close(); // �ر���
			}
			if (socket != null) {
				socket.close(); // �ر��׽���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) { // ������
		server tcp = new server("��ͻ���������"); // �����������
		tcp.setSize(400,400);
		tcp.setVisible(true);
		tcp.getserver(); // ���÷���
	}
}