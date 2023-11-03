/*
 * XML Type:  putAtosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.PutAtosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML putAtosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class PutAtosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.PutAtosResponse
{
    private static final long serialVersionUID = 1L;
    
    public PutAtosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIBOTSR$0 = 
        new javax.xml.namespace.QName("", "reciboTSR");
    
    
    /**
     * Gets the "reciboTSR" element
     */
    public byte[] getReciboTSR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIBOTSR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "reciboTSR" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetReciboTSR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECIBOTSR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "reciboTSR" element
     */
    public boolean isSetReciboTSR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIBOTSR$0) != 0;
        }
    }
    
    /**
     * Sets the "reciboTSR" element
     */
    public void setReciboTSR(byte[] reciboTSR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIBOTSR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECIBOTSR$0);
            }
            target.setByteArrayValue(reciboTSR);
        }
    }
    
    /**
     * Sets (as xml) the "reciboTSR" element
     */
    public void xsetReciboTSR(org.apache.xmlbeans.XmlBase64Binary reciboTSR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECIBOTSR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(RECIBOTSR$0);
            }
            target.set(reciboTSR);
        }
    }
    
    /**
     * Unsets the "reciboTSR" element
     */
    public void unsetReciboTSR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIBOTSR$0, 0);
        }
    }
}
