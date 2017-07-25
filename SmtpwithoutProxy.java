import java.io.*;
import java.net.*;
public class SmtpwithoutProxy {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Socket smtpSocket = null;  
        DataOutputStream os = null;
        DataInputStream is = null;
        FileInputStream fis = null;
        BufferedInputStream bis=null;
        try {
            smtpSocket = new Socket("smtp.honeywell.com", 25);
            os = new DataOutputStream(smtpSocket.getOutputStream());
            is = new DataInputStream(smtpSocket.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: hostname");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }
    if (smtpSocket != null && os != null && is != null) {
            try {
             
//              String[] attachFiles = new String[3];
//              attachFiles[0]="C:/Users/h225689/Desktop/todolist.txt";
        os.writeBytes("HELO\n");    
                os.writeBytes("MAIL From: gayathri@gmail.com\n");
                os.writeBytes("RCPT To: gayathri.t@honeywell.com\n");
                //os.writeBytes("RCPT To: pavithra.b@honeywell.com\r\n");
                //os.writeBytes("RCPT Bcc: BCCDude <jitendra.jain@honeywell.com>\r\n");
                os.writeBytes("DATA \n");
                os.writeBytes("From:gayathri@gmail.com \n"); 
                os.writeBytes("To: gayathri.t@honeywell.com\n");
               // os.writeBytes("Cc: <pavithra.b@honeywell.com>\r\n");
                //os.writeBytes("Bcc: BCCDude <jitendra.jain@honeywell.com>\r\n");
                os.writeBytes("Subject: testing Subject\r\n\r\n");
                os.writeBytes("Attach :");
              
                //MIMEBase64.encode(FileName1, out);
                
//                attachFiles[0] = "C:/Users/h225689/Desktop/sample.txt";
//                os.writeBytes("DATA " + attachFiles[0] + "\r\n");
                os.writeBytes("\n.\n");
        os.writeBytes("QUIT");
                String responseLine;
                while ((responseLine = is.readLine()) != null) {
                    System.out.println("Server: " + responseLine);
                    if (responseLine.indexOf("Ok") != -1) {
                      break;
                    }
                }
        os.close();
                is.close();
                smtpSocket.close();   
            } catch (UnknownHostException e) {
                System.err.println("Trying to connect to unknown host: " + e);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
        }
    }           
}