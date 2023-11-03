/*
 * XML Type:  banco
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Banco
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML banco(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class BancoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Banco
{
    private static final long serialVersionUID = 1L;
    
    public BancoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDBANCO$0 = 
        new javax.xml.namespace.QName("", "cdbanco");
    private static final javax.xml.namespace.QName NMBANCO$2 = 
        new javax.xml.namespace.QName("", "nmbanco");
    
    
    /**
     * Gets the "cdbanco" element
     */
    public java.lang.String getCdbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDBANCO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdbanco" element
     */
    public org.apache.xmlbeans.XmlString xgetCdbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDBANCO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdbanco" element
     */
    public boolean isSetCdbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDBANCO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdbanco" element
     */
    public void setCdbanco(java.lang.String cdbanco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDBANCO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDBANCO$0);
            }
            target.setStringValue(cdbanco);
        }
    }
    
    /**
     * Sets (as xml) the "cdbanco" element
     */
    public void xsetCdbanco(org.apache.xmlbeans.XmlString cdbanco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDBANCO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CDBANCO$0);
            }
            target.set(cdbanco);
        }
    }
    
    /**
     * Unsets the "cdbanco" element
     */
    public void unsetCdbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDBANCO$0, 0);
        }
    }
    
    /**
     * Gets the "nmbanco" element
     */
    public java.lang.String getNmbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBANCO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmbanco" element
     */
    public org.apache.xmlbeans.XmlString xgetNmbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMBANCO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmbanco" element
     */
    public boolean isSetNmbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMBANCO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmbanco" element
     */
    public void setNmbanco(java.lang.String nmbanco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBANCO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMBANCO$2);
            }
            target.setStringValue(nmbanco);
        }
    }
    
    /**
     * Sets (as xml) the "nmbanco" element
     */
    public void xsetNmbanco(org.apache.xmlbeans.XmlString nmbanco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMBANCO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMBANCO$2);
            }
            target.set(nmbanco);
        }
    }
    
    /**
     * Unsets the "nmbanco" element
     */
    public void unsetNmbanco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMBANCO$2, 0);
        }
    }
}
