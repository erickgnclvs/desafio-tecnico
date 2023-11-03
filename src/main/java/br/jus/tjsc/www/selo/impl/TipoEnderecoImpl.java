/*
 * XML Type:  tipoEndereco
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoEndereco
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoEndereco(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoEnderecoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoEndereco
{
    private static final long serialVersionUID = 1L;
    
    public TipoEnderecoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOENDERECO$0 = 
        new javax.xml.namespace.QName("", "cdtipoendereco");
    private static final javax.xml.namespace.QName DETIPOENDERECO$2 = 
        new javax.xml.namespace.QName("", "detipoendereco");
    
    
    /**
     * Gets the "cdtipoendereco" element
     */
    public short getCdtipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOENDERECO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipoendereco" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdtipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOENDERECO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipoendereco" element
     */
    public boolean isSetCdtipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOENDERECO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipoendereco" element
     */
    public void setCdtipoendereco(short cdtipoendereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOENDERECO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOENDERECO$0);
            }
            target.setShortValue(cdtipoendereco);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipoendereco" element
     */
    public void xsetCdtipoendereco(org.apache.xmlbeans.XmlShort cdtipoendereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOENDERECO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDTIPOENDERECO$0);
            }
            target.set(cdtipoendereco);
        }
    }
    
    /**
     * Unsets the "cdtipoendereco" element
     */
    public void unsetCdtipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOENDERECO$0, 0);
        }
    }
    
    /**
     * Gets the "detipoendereco" element
     */
    public java.lang.String getDetipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETIPOENDERECO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detipoendereco" element
     */
    public org.apache.xmlbeans.XmlString xgetDetipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETIPOENDERECO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "detipoendereco" element
     */
    public boolean isSetDetipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETIPOENDERECO$2) != 0;
        }
    }
    
    /**
     * Sets the "detipoendereco" element
     */
    public void setDetipoendereco(java.lang.String detipoendereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETIPOENDERECO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETIPOENDERECO$2);
            }
            target.setStringValue(detipoendereco);
        }
    }
    
    /**
     * Sets (as xml) the "detipoendereco" element
     */
    public void xsetDetipoendereco(org.apache.xmlbeans.XmlString detipoendereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETIPOENDERECO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETIPOENDERECO$2);
            }
            target.set(detipoendereco);
        }
    }
    
    /**
     * Unsets the "detipoendereco" element
     */
    public void unsetDetipoendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETIPOENDERECO$2, 0);
        }
    }
}
