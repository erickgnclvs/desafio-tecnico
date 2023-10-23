/*
 * XML Type:  comarca
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Comarca
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML comarca(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class ComarcaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Comarca
{
    private static final long serialVersionUID = 1L;
    
    public ComarcaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDCOMARCA$0 = 
        new javax.xml.namespace.QName("", "cdcomarca");
    private static final javax.xml.namespace.QName NMCOMARCA$2 = 
        new javax.xml.namespace.QName("", "nmcomarca");
    
    
    /**
     * Gets the "cdcomarca" element
     */
    public short getCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDCOMARCA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdcomarca" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDCOMARCA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdcomarca" element
     */
    public boolean isSetCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDCOMARCA$0) != 0;
        }
    }
    
    /**
     * Sets the "cdcomarca" element
     */
    public void setCdcomarca(short cdcomarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDCOMARCA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDCOMARCA$0);
            }
            target.setShortValue(cdcomarca);
        }
    }
    
    /**
     * Sets (as xml) the "cdcomarca" element
     */
    public void xsetCdcomarca(org.apache.xmlbeans.XmlShort cdcomarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDCOMARCA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDCOMARCA$0);
            }
            target.set(cdcomarca);
        }
    }
    
    /**
     * Unsets the "cdcomarca" element
     */
    public void unsetCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDCOMARCA$0, 0);
        }
    }
    
    /**
     * Gets the "nmcomarca" element
     */
    public java.lang.String getNmcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMCOMARCA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmcomarca" element
     */
    public org.apache.xmlbeans.XmlString xgetNmcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMCOMARCA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmcomarca" element
     */
    public boolean isSetNmcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMCOMARCA$2) != 0;
        }
    }
    
    /**
     * Sets the "nmcomarca" element
     */
    public void setNmcomarca(java.lang.String nmcomarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMCOMARCA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMCOMARCA$2);
            }
            target.setStringValue(nmcomarca);
        }
    }
    
    /**
     * Sets (as xml) the "nmcomarca" element
     */
    public void xsetNmcomarca(org.apache.xmlbeans.XmlString nmcomarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMCOMARCA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMCOMARCA$2);
            }
            target.set(nmcomarca);
        }
    }
    
    /**
     * Unsets the "nmcomarca" element
     */
    public void unsetNmcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMCOMARCA$2, 0);
        }
    }
}
