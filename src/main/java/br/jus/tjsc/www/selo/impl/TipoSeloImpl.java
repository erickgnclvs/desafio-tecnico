/*
 * XML Type:  tipoSelo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoSelo
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoSelo(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoSeloImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoSelo
{
    private static final long serialVersionUID = 1L;
    
    public TipoSeloImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTPSELO$0 = 
        new javax.xml.namespace.QName("", "cdtpselo");
    private static final javax.xml.namespace.QName DETPSELO$2 = 
        new javax.xml.namespace.QName("", "detpselo");
    
    
    /**
     * Gets the "cdtpselo" element
     */
    public short getCdtpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTPSELO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtpselo" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdtpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTPSELO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtpselo" element
     */
    public boolean isSetCdtpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTPSELO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtpselo" element
     */
    public void setCdtpselo(short cdtpselo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTPSELO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTPSELO$0);
            }
            target.setShortValue(cdtpselo);
        }
    }
    
    /**
     * Sets (as xml) the "cdtpselo" element
     */
    public void xsetCdtpselo(org.apache.xmlbeans.XmlShort cdtpselo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTPSELO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDTPSELO$0);
            }
            target.set(cdtpselo);
        }
    }
    
    /**
     * Unsets the "cdtpselo" element
     */
    public void unsetCdtpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTPSELO$0, 0);
        }
    }
    
    /**
     * Gets the "detpselo" element
     */
    public java.lang.String getDetpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPSELO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detpselo" element
     */
    public org.apache.xmlbeans.XmlString xgetDetpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPSELO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "detpselo" element
     */
    public boolean isSetDetpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETPSELO$2) != 0;
        }
    }
    
    /**
     * Sets the "detpselo" element
     */
    public void setDetpselo(java.lang.String detpselo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPSELO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETPSELO$2);
            }
            target.setStringValue(detpselo);
        }
    }
    
    /**
     * Sets (as xml) the "detpselo" element
     */
    public void xsetDetpselo(org.apache.xmlbeans.XmlString detpselo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPSELO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETPSELO$2);
            }
            target.set(detpselo);
        }
    }
    
    /**
     * Unsets the "detpselo" element
     */
    public void unsetDetpselo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETPSELO$2, 0);
        }
    }
}
