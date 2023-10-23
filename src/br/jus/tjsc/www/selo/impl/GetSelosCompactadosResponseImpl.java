/*
 * XML Type:  getSelosCompactadosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosCompactadosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getSelosCompactadosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetSelosCompactadosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosCompactadosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosCompactadosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELOSCOMPACTADOS$0 = 
        new javax.xml.namespace.QName("", "selosCompactados");
    
    
    /**
     * Gets the "selosCompactados" element
     */
    public byte[] getSelosCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSCOMPACTADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "selosCompactados" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSelosCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSCOMPACTADOS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "selosCompactados" element
     */
    public boolean isSetSelosCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELOSCOMPACTADOS$0) != 0;
        }
    }
    
    /**
     * Sets the "selosCompactados" element
     */
    public void setSelosCompactados(byte[] selosCompactados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELOSCOMPACTADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELOSCOMPACTADOS$0);
            }
            target.setByteArrayValue(selosCompactados);
        }
    }
    
    /**
     * Sets (as xml) the "selosCompactados" element
     */
    public void xsetSelosCompactados(org.apache.xmlbeans.XmlBase64Binary selosCompactados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SELOSCOMPACTADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SELOSCOMPACTADOS$0);
            }
            target.set(selosCompactados);
        }
    }
    
    /**
     * Unsets the "selosCompactados" element
     */
    public void unsetSelosCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELOSCOMPACTADOS$0, 0);
        }
    }
}
