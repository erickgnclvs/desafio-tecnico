/*
 * An XML document type.
 * Localname: getSelosPedido
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedidoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosPedido(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosPedidoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedidoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSPEDIDO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedido");
    
    
    /**
     * Gets the "getSelosPedido" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedido getGetSelosPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedido target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedido)get_store().find_element_user(GETSELOSPEDIDO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosPedido" element
     */
    public void setGetSelosPedido(br.jus.tjsc.www.selo.GetSelosPedido getSelosPedido)
    {
        generatedSetterHelperImpl(getSelosPedido, GETSELOSPEDIDO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosPedido" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedido addNewGetSelosPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedido target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedido)get_store().add_element_user(GETSELOSPEDIDO$0);
            return target;
        }
    }
}
