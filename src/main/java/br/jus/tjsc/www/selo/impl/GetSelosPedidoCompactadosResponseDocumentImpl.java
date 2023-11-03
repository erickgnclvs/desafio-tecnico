/*
 * An XML document type.
 * Localname: getSelosPedidoCompactadosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosPedidoCompactadosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosPedidoCompactadosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoCompactadosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSPEDIDOCOMPACTADOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedidoCompactadosResponse");
    
    
    /**
     * Gets the "getSelosPedidoCompactadosResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse getGetSelosPedidoCompactadosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse)get_store().find_element_user(GETSELOSPEDIDOCOMPACTADOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosPedidoCompactadosResponse" element
     */
    public void setGetSelosPedidoCompactadosResponse(br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse getSelosPedidoCompactadosResponse)
    {
        generatedSetterHelperImpl(getSelosPedidoCompactadosResponse, GETSELOSPEDIDOCOMPACTADOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosPedidoCompactadosResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse addNewGetSelosPedidoCompactadosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse)get_store().add_element_user(GETSELOSPEDIDOCOMPACTADOSRESPONSE$0);
            return target;
        }
    }
}
