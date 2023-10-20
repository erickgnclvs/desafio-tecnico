
package com.vhl.desafiotecnico.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://www.tjsc.jus.br/selo")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.vhl.desafiotecnico.wsdl.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, com.vhl.desafiotecnico.wsdl.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, com.vhl.desafiotecnico.wsdl.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vhl.desafiotecnico.wsdl.Exception
     */
    public com.vhl.desafiotecnico.wsdl.Exception getFaultInfo() {
        return faultInfo;
    }

}