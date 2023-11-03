/*
 * XML Type:  getSelosPedidoCompactadosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getSelosPedidoCompactadosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetSelosPedidoCompactadosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoCompactadosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELOSPEDIDOCOMPACTADOS$0 = 
        new javax.xml.namespace.QName("", "selosPedidoCompactados");
    
    
    /**
     * Gets the "selosPedidoCompactados" element
     */
    public byte[] getSelosPedidoCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSPEDIDOCOMPACTADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "selosPedidoCompactados" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSelosPedidoCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSPEDIDOCOMPACTADOS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "selosPedidoCompactados" element
     */
    public boolean isSetSelosPedidoCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELOSPEDIDOCOMPACTADOS$0) != 0;
        }
    }
    
    /**
     * Sets the "selosPedidoCompactados" element
     */
    public void setSelosPedidoCompactados(byte[] selosPedidoCompactados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSPEDIDOCOMPACTADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELOSPEDIDOCOMPACTADOS$0);
            }
            target.setByteArrayValue(selosPedidoCompactados);
        }
    }
    
    /**
     * Sets (as xml) the "selosPedidoCompactados" element
     */
    public void xsetSelosPedidoCompactados(org.apache.xmlbeans.XmlBase64Binary selosPedidoCompactados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSPEDIDOCOMPACTADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SELOSPEDIDOCOMPACTADOS$0);
            }
            target.set(selosPedidoCompactados);
        }
    }
    
    /**
     * Unsets the "selosPedidoCompactados" element
     */
    public void unsetSelosPedidoCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELOSPEDIDOCOMPACTADOS$0, 0);
        }
    }
}
