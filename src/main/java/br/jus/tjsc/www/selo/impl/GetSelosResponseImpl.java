/*
 * XML Type:  getSelosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getSelosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetSelosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELOSASSINADOS$0 = 
        new javax.xml.namespace.QName("", "selosAssinados");
    
    
    /**
     * Gets the "selosAssinados" element
     */
    public byte[] getSelosAssinados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSASSINADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "selosAssinados" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSelosAssinados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSASSINADOS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "selosAssinados" element
     */
    public boolean isSetSelosAssinados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELOSASSINADOS$0) != 0;
        }
    }
    
    /**
     * Sets the "selosAssinados" element
     */
    public void setSelosAssinados(byte[] selosAssinados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSASSINADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELOSASSINADOS$0);
            }
            target.setByteArrayValue(selosAssinados);
        }
    }
    
    /**
     * Sets (as xml) the "selosAssinados" element
     */
    public void xsetSelosAssinados(org.apache.xmlbeans.XmlBase64Binary selosAssinados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSASSINADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SELOSASSINADOS$0);
            }
            target.set(selosAssinados);
        }
    }
    
    /**
     * Unsets the "selosAssinados" element
     */
    public void unsetSelosAssinados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELOSASSINADOS$0, 0);
        }
    }
}
