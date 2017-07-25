
package com.honeywell.email;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Base64;

import javax.baja.email.BEmail;
import javax.baja.email.BOutgoingAccount;
import javax.baja.security.BPassword;
import javax.baja.sys.Action;
import javax.baja.sys.BIService;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.log.*;

public class BHttpProxyOutgoingAccount extends BOutgoingAccount
implements BIService
    
{
  /*-
   class BHttpProxyOutgoingAccount
   {
   properties{
   
    httpProxyIP : String
    default {[ "" ]} 
    
    httpProxyPort : int
    default {[ 8888 ]}
    
    
    httpProxyAuthPolicy:BSecurityTypeEnum
    default {[BSecurityTypeEnum.make(0) ]}

      
    httpProxyUserName : String
    default {[ " " ]}
      
    httpProxyPassword : String
    default {[ " " ]}
   
    
  
   }
   actions{

   send(paramEmail : BEmail)
   default {[ new BEmail() ]}
   
   }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.honeywell.email.BHttpProxyOutgoingAccount(1790420244)1.0$ @*/
/* Generated Mon Mar 20 11:29:39 IST 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "httpProxyIP"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>httpProxyIP</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#getHttpProxyIP
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#setHttpProxyIP
   */
  public static final Property httpProxyIP = newProperty(0, "",null);
  
  /**
   * Get the <code>httpProxyIP</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyIP
   */
  public String getHttpProxyIP() { return getString(httpProxyIP); }
  
  /**
   * Set the <code>httpProxyIP</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyIP
   */
  public void setHttpProxyIP(String v) { setString(httpProxyIP,v,null); }

////////////////////////////////////////////////////////////////
// Property "httpProxyPort"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>httpProxyPort</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#getHttpProxyPort
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#setHttpProxyPort
   */
  public static final Property httpProxyPort = newProperty(0, 8888,null);
  
  /**
   * Get the <code>httpProxyPort</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyPort
   */
  public int getHttpProxyPort() { return getInt(httpProxyPort); }
  
  /**
   * Set the <code>httpProxyPort</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyPort
   */
  public void setHttpProxyPort(int v) { setInt(httpProxyPort,v,null); }

////////////////////////////////////////////////////////////////
// Property "httpProxyAuthPolicy"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>httpProxyAuthPolicy</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#getHttpProxyAuthPolicy
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#setHttpProxyAuthPolicy
   */
  public static final Property httpProxyAuthPolicy = newProperty(0, BSecurityTypeEnum.make(0),null);
  
  /**
   * Get the <code>httpProxyAuthPolicy</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyAuthPolicy
   */
  public BSecurityTypeEnum getHttpProxyAuthPolicy() { return (BSecurityTypeEnum)get(httpProxyAuthPolicy); }
  
  /**
   * Set the <code>httpProxyAuthPolicy</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyAuthPolicy
   */
  public void setHttpProxyAuthPolicy(BSecurityTypeEnum v) { set(httpProxyAuthPolicy,v,null); }

////////////////////////////////////////////////////////////////
// Property "httpProxyUserName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>httpProxyUserName</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#getHttpProxyUserName
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#setHttpProxyUserName
   */
  public static final Property httpProxyUserName = newProperty(0, " ",null);
  
  /**
   * Get the <code>httpProxyUserName</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyUserName
   */
  public String getHttpProxyUserName() { return getString(httpProxyUserName); }
  
  /**
   * Set the <code>httpProxyUserName</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyUserName
   */
  public void setHttpProxyUserName(String v) { setString(httpProxyUserName,v,null); }

////////////////////////////////////////////////////////////////
// Property "httpProxyPassword"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>httpProxyPassword</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#getHttpProxyPassword
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#setHttpProxyPassword
   */
  public static final Property httpProxyPassword = newProperty(0, " ",null);
  
  /**
   * Get the <code>httpProxyPassword</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyPassword
   */
  public String getHttpProxyPassword() { return getString(httpProxyPassword); }
  
  /**
   * Set the <code>httpProxyPassword</code> property.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#httpProxyPassword
   */
  public void setHttpProxyPassword(String v) { setString(httpProxyPassword,v,null); }

////////////////////////////////////////////////////////////////
// Action "send"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>send</code> action.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#send()
   */
  public static final Action send = newAction(0,new BEmail(),null);
  
  /**
   * Invoke the <code>send</code> action.
   * @see com.honeywell.email.BHttpProxyOutgoingAccount#send
   */
  public void send(BEmail paramEmail) { invoke(send,paramEmail,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHttpProxyOutgoingAccount.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  public static final Log log=Log.getLog("proxyEmail");
      
  public void doSend(BEmail paramEmail)
  {
    this.lease();
    log.trace("In send method*******************");
    // slotfacets{[BFacets.make("fieldEditor",BString.make("wbutil:UserPasswordFE"))]}
    Socket tunnel = null;
    DataOutputStream os = null;
    BufferedReader br = null;
    String smtpHost;
    int smtpPort;
    String smtpUserPass=null;

    try
    {      
      
      log.trace("******tunnel creating******* for :" +getHttpProxyIP() +" and " + getHttpProxyPort()  );
      
      tunnel = new Socket(getHttpProxyIP(), getHttpProxyPort());
      log.trace("******tunnel created******* for :" +getHttpProxyIP() +" and " + getHttpProxyPort()  );
       
   
      if(getUseAuthentication()){
        smtpUserPass= getAccount()+":"+getPassword().getValue();
       // smtpUserPass= getBasicAuthentication(getAccount(),getPassword().getValue());
      }
      //  smtpUserPass= new String(Base64.getEncoder().encodeToString((getAccount().trim()+":"+getPassword().toString().trim()).getBytes()));  
      
      

      os = new DataOutputStream(tunnel.getOutputStream());

      br = new BufferedReader(new InputStreamReader(tunnel.getInputStream()));

      String javaVersion = "Java/" + System.getProperty("java.version");
      String userAgent =
          System.getProperty("http.agent") == null ? javaVersion
                                                  : System.getProperty("http.agent") + " " +
                                                      javaVersion;

      smtpHost = this.getHostname();
      smtpPort = this.getPort();
      String msg =
          "CONNECT " + smtpHost + ":" + smtpPort + " HTTP/1.0\n" + "User-Agent: " + userAgent;
      
      if (getHttpProxyAuthPolicy() == BSecurityTypeEnum.basic)
      msg = msg + "\nProxy-Authorization: Basic " + getBasicAuthentication(getHttpProxyUserName(),getHttpProxyPassword());    
      
      
      if (getHttpProxyAuthPolicy() == BSecurityTypeEnum.digest)
      msg = msg + "\nProxy-Authorization: Basic " + getDigestAuthentication(getHttpProxyUserName(),getHttpProxyPassword());  
      
      msg = msg + "\nPragma: no-cache";
      msg = msg + "\r\n\r\n";

      byte b[];
      try
      {

        b = msg.getBytes("ASCII7");

      }
      catch (UnsupportedEncodingException ignored)
      {
        b = msg.getBytes();

      }
      os.write(b);
      os.flush();
      log.trace("First Time: " + br.readLine());

      String strFrom = paramEmail.getFrom().toString();
      String strTo = paramEmail.getTo().toString();
      String strArray[]=strTo.split(";");    
      String strCc = paramEmail.getCc().toString();
      String strBcc = paramEmail.getBcc().toString();
      String[] strRcptCc=strCc.split(";");
      String[] strRcptBcc=strBcc.split(";");
      os.writeBytes("EHLO "+smtpHost+"\n"); 
      
      log.trace(br.readLine());
    if (getUseAuthentication())
    {
      log.trace("In smtp authentication");
      os.writeBytes("AUTH PLAIN");
      os.writeBytes(smtpUserPass);
    }
    os.writeBytes("MAIL From: " + strFrom.substring(0, strFrom.indexOf("|")) + "\r\n");
   
    log.trace(br.readLine());
    for (int i=0;i<strArray.length;i++){   
    os.writeBytes("RCPT To: " + strArray[i].substring(0, strArray[i].indexOf("|"))+"\r\n");
    }
    //os.writeBytes("\r\n");
     if (strCc.length() > 1)
    {
      
       for(int i=0;i<strRcptCc.length;i++)
      os.writeBytes("RCPT To: " + strRcptCc[i].substring(0, strRcptCc[i].indexOf("|")) + "\r\n");     
       log.trace(br.readLine());
    }

    if (strBcc.length() > 1)
    {
      
      for(int i=0;i<strRcptBcc.length;i++)
      os.writeBytes("RCPT To: " + strRcptBcc[i].substring(0, strRcptBcc[i].indexOf("|")) + "\r\n");
    }  
    os.writeBytes("DATA \n");
    log.trace(br.readLine());
    os.writeBytes("From: " + strFrom.substring(0, strFrom.indexOf("|")) + "\r\n");
    log.trace(br.readLine());
    os.writeBytes("Subject: " + paramEmail.getSubject().toString() + "\r\n");
    for (int i=0;i<strArray.length;i++){   
      os.writeBytes("To: " + strArray[i].substring(0, strArray[i].indexOf("|"))+"\r\n"); 
      }

     if (strCc.length() > 1)
    {
       for(int i=0;i<strRcptCc.length;i++)
      os.writeBytes("Cc: " + strRcptCc[i].substring(0, strRcptCc[i].indexOf("|")) + "\r\n");   
    }   
     os.writeBytes("\r\n");
    os.writeBytes(paramEmail.getBody().toString()+"\r\n.\r\n");  
    

    os.writeBytes("QUIT\r\n");
    log.trace("Sent message successfully....");
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw new RuntimeException(e);
    }finally{
      try{
      os.flush();
      os.close();
      br.close();
      tunnel.close();
      }catch(Exception e){
        e.printStackTrace();
      }
      
    }
  }

  public static String getDigestAuthentication(String userName, String password) throws Exception
  {
  MessageDigest md5 = null;
    md5 = MessageDigest.getInstance("MD5");
    md5.update(userName.trim().getBytes());
    String digestedUser = md5.digest().toString(); 
    md5.update(password.trim().getBytes());
    String digestedPass =md5.digest().toString();
    String credentials = digestedUser +":"+ digestedPass;
  return credentials;
  }
  
  public static String getBasicAuthentication(String userName, String password)
  {
    
    String authorization="";
    if (userName != null && password != null)
    {
      authorization = userName.trim() + ':' + password.trim();
      authorization = java.util.Base64.getEncoder().encodeToString((authorization.getBytes()));
     }

    return authorization;
  }
  
  public Type[] getServiceTypes()
  {
    // TODO Auto-generated method stub
    return null;
  }

  public void serviceStarted() throws Exception
  {
    // TODO Auto-generated method stub
    
  }

  public void serviceStopped() throws Exception
  {
    // TODO Auto-generated method stub
    
  }


}