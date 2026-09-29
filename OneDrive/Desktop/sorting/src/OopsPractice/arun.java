package OopsPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class arun extends Frame implements Runnable, ActionListener {
    TextField textField;
    TextArea textArea;
    Button send;



    Socket socket;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    Thread chat;
    arun(){
        textField =new TextField();
        textArea=new TextArea();
        send=new Button("send");

        send.addActionListener(this);
        try {

            socket= new Socket("local",12000);

            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream =new DataOutputStream(socket.getOutputStream());
        }
        catch(Exception E) {

        }
        add(textField);
        add(textArea);
        add(send);

        chat =new Thread(this);
        chat.setDaemon(true);
        chat.start();

        setSize(500,500);
        setTitle("arun");
        setLayout(new FlowLayout());
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = textField.getText();
        textArea.append("arun:" + msg + "\n");
        textField.setText("");
        try {
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        } catch (IOException ex) {

        }
    }
    public static void main(String[] args) {
new arun();
    }
    public void run(){
        while(true){
            try{
                String msg=dataInputStream.readUTF();
                textArea.append("tharun:"+msg+"\n");
            }
            catch(Exception E){

            }
        }
    }
}
