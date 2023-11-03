/*
 * XML Type:  getSelosPedidoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedidoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getSelosPedidoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetSelosPedidoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedidoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELOSPEDIDO$0 = 
        new javax.xml.namespace.QName("", "selosPedido");
    
    
    /**
     * Gets the "selosPedido" element
     */
    public byte[] getSelosPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSPEDIDO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "selosPedido" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSelosPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSPEDIDO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "selosPedido" element
     */
    public boolean isSetSelosPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELOSPEDIDO$0) != 0;
        }
    }
    
    /**
     * Sets the "selosPedido" element
     */
    public void setSelosPedido(byte[] selosPedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSPEDIDO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELOSPEDIDO$0);
            }
            target.setByteArrayValue(selosPedido);
        }
    }
    
    /**
     * Sets (as xml) the "selosPedido" element
     */
    public void xsetSelosPedido(org.apache.xmlbeans.XmlBase64Binary selosPedido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSPEDIDO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SELOSPEDIDO$0);
            }
            target.set(selosPedido);
        }
    }
    
    /**
     * Unsets the "selosPedido" element
     */
    public void unsetSelosPedido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELOSPEDIDO$0, 0);
        }
    }
}
