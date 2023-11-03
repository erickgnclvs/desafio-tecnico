/*
 * XML Type:  etnia
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Etnia
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML etnia(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class EtniaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Etnia
{
    private static final long serialVersionUID = 1L;
    
    public EtniaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDETNIA$0 = 
        new javax.xml.namespace.QName("", "cdetnia");
    private static final javax.xml.namespace.QName DEETNIA$2 = 
        new javax.xml.namespace.QName("", "deetnia");
    
    
    /**
     * Gets the "cdetnia" element
     */
    public short getCdetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDETNIA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdetnia" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDETNIA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdetnia" element
     */
    public boolean isSetCdetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDETNIA$0) != 0;
        }
    }
    
    /**
     * Sets the "cdetnia" element
     */
    public void setCdetnia(short cdetnia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDETNIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDETNIA$0);
            }
            target.setShortValue(cdetnia);
        }
    }
    
    /**
     * Sets (as xml) the "cdetnia" element
     */
    public void xsetCdetnia(org.apache.xmlbeans.XmlShort cdetnia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDETNIA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDETNIA$0);
            }
            target.set(cdetnia);
        }
    }
    
    /**
     * Unsets the "cdetnia" element
     */
    public void unsetCdetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDETNIA$0, 0);
        }
    }
    
    /**
     * Gets the "deetnia" element
     */
    public java.lang.String getDeetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEETNIA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deetnia" element
     */
    public org.apache.xmlbeans.XmlString xgetDeetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEETNIA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deetnia" element
     */
    public boolean isSetDeetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEETNIA$2) != 0;
        }
    }
    
    /**
     * Sets the "deetnia" element
     */
    public void setDeetnia(java.lang.String deetnia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEETNIA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEETNIA$2);
            }
            target.setStringValue(deetnia);
        }
    }
    
    /**
     * Sets (as xml) the "deetnia" element
     */
    public void xsetDeetnia(org.apache.xmlbeans.XmlString deetnia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEETNIA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEETNIA$2);
            }
            target.set(deetnia);
        }
    }
    
    /**
     * Unsets the "deetnia" element
     */
    public void unsetDeetnia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEETNIA$2, 0);
        }
    }
}
