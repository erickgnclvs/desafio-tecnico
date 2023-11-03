/*
 * XML Type:  tipoCobranca20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoCobranca20
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoCobranca20(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoCobranca20Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoCobranca20
{
    private static final long serialVersionUID = 1L;
    
    public TipoCobranca20Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOCOBRANCA$0 = 
        new javax.xml.namespace.QName("", "cdtipocobranca");
    private static final javax.xml.namespace.QName DISPOSITIVOLEGAL$2 = 
        new javax.xml.namespace.QName("", "dispositivolegal");
    private static final javax.xml.namespace.QName NMTIPOCOBRANCA$4 = 
        new javax.xml.namespace.QName("", "nmtipocobranca");
    
    
    /**
     * Gets the "cdtipocobranca" element
     */
    public long getCdtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOCOBRANCA$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipocobranca" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOCOBRANCA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipocobranca" element
     */
    public boolean isSetCdtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOCOBRANCA$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipocobranca" element
     */
    public void setCdtipocobranca(long cdtipocobranca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOCOBRANCA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOCOBRANCA$0);
            }
            target.setLongValue(cdtipocobranca);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipocobranca" element
     */
    public void xsetCdtipocobranca(org.apache.xmlbeans.XmlLong cdtipocobranca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOCOBRANCA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDTIPOCOBRANCA$0);
            }
            target.set(cdtipocobranca);
        }
    }
    
    /**
     * Unsets the "cdtipocobranca" element
     */
    public void unsetCdtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOCOBRANCA$0, 0);
        }
    }
    
    /**
     * Gets the "dispositivolegal" element
     */
    public java.lang.String getDispositivolegal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPOSITIVOLEGAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dispositivolegal" element
     */
    public org.apache.xmlbeans.XmlString xgetDispositivolegal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPOSITIVOLEGAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dispositivolegal" element
     */
    public boolean isSetDispositivolegal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPOSITIVOLEGAL$2) != 0;
        }
    }
    
    /**
     * Sets the "dispositivolegal" element
     */
    public void setDispositivolegal(java.lang.String dispositivolegal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPOSITIVOLEGAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPOSITIVOLEGAL$2);
            }
            target.setStringValue(dispositivolegal);
        }
    }
    
    /**
     * Sets (as xml) the "dispositivolegal" element
     */
    public void xsetDispositivolegal(org.apache.xmlbeans.XmlString dispositivolegal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPOSITIVOLEGAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPOSITIVOLEGAL$2);
            }
            target.set(dispositivolegal);
        }
    }
    
    /**
     * Unsets the "dispositivolegal" element
     */
    public void unsetDispositivolegal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPOSITIVOLEGAL$2, 0);
        }
    }
    
    /**
     * Gets the "nmtipocobranca" element
     */
    public java.lang.String getNmtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOCOBRANCA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipocobranca" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOCOBRANCA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipocobranca" element
     */
    public boolean isSetNmtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOCOBRANCA$4) != 0;
        }
    }
    
    /**
     * Sets the "nmtipocobranca" element
     */
    public void setNmtipocobranca(java.lang.String nmtipocobranca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOCOBRANCA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOCOBRANCA$4);
            }
            target.setStringValue(nmtipocobranca);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipocobranca" element
     */
    public void xsetNmtipocobranca(org.apache.xmlbeans.XmlString nmtipocobranca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOCOBRANCA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOCOBRANCA$4);
            }
            target.set(nmtipocobranca);
        }
    }
    
    /**
     * Unsets the "nmtipocobranca" element
     */
    public void unsetNmtipocobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOCOBRANCA$4, 0);
        }
    }
}
