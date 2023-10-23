/*
 * An XML document type.
 * Localname: getSelosPedidoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosPedidoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosPedidoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSPEDIDORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedidoResponse");
    
    
    /**
     * Gets the "getSelosPedidoResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedidoResponse getGetSelosPedidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedidoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedidoResponse)get_store().find_element_user(GETSELOSPEDIDORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosPedidoResponse" element
     */
    public void setGetSelosPedidoResponse(br.jus.tjsc.www.selo.GetSelosPedidoResponse getSelosPedidoResponse)
    {
        generatedSetterHelperImpl(getSelosPedidoResponse, GETSELOSPEDIDORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosPedidoResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedidoResponse addNewGetSelosPedidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedidoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedidoResponse)get_store().add_element_user(GETSELOSPEDIDORESPONSE$0);
            return target;
        }
    }
}
