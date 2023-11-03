/**
 * ExceptionException.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package samples.service.xmlbeans;

public class ExceptionException extends java.lang.Exception {

  private static final long serialVersionUID = 1698078812289L;

  private br.jus.tjsc.www.selo.ExceptionDocument faultMessage;

  public ExceptionException() {
    super("ExceptionException");
  }

  public ExceptionException(java.lang.String s) {
    super(s);
  }

  public ExceptionException(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public ExceptionException(java.lang.Throwable cause) {
    super(cause);
  }

  public void setFaultMessage(br.jus.tjsc.www.selo.ExceptionDocument msg) {
    faultMessage = msg;
  }

  public br.jus.tjsc.www.selo.ExceptionDocument getFaultMessage() {
    return faultMessage;
  }
}
