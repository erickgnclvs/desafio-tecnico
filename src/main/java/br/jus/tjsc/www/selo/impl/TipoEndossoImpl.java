/*
 * XML Type:  tipoEndosso
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoEndosso
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoEndosso(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoEndossoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoEndosso
{
    private static final long serialVersionUID = 1L;
    
    public TipoEndossoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOENDOSSO$0 = 
        new javax.xml.namespace.QName("", "cdtipoendosso");
    private static final javax.xml.namespace.QName NMTIPOENDOSSO$2 = 
        new javax.xml.namespace.QName("", "nmtipoendosso");
    
    
    /**
     * Gets the "cdtipoendosso" element
     */
    public long getCdtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOENDOSSO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipoendosso" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOENDOSSO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipoendosso" element
     */
    public boolean isSetCdtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOENDOSSO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipoendosso" element
     */
    public void setCdtipoendosso(long cdtipoendosso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOENDOSSO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOENDOSSO$0);
            }
            target.setLongValue(cdtipoendosso);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipoendosso" element
     */
    public void xsetCdtipoendosso(org.apache.xmlbeans.XmlLong cdtipoendosso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOENDOSSO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDTIPOENDOSSO$0);
            }
            target.set(cdtipoendosso);
        }
    }
    
    /**
     * Unsets the "cdtipoendosso" element
     */
    public void unsetCdtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOENDOSSO$0, 0);
        }
    }
    
    /**
     * Gets the "nmtipoendosso" element
     */
    public java.lang.String getNmtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOENDOSSO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipoendosso" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOENDOSSO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipoendosso" element
     */
    public boolean isSetNmtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOENDOSSO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmtipoendosso" element
     */
    public void setNmtipoendosso(java.lang.String nmtipoendosso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOENDOSSO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOENDOSSO$2);
            }
            target.setStringValue(nmtipoendosso);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipoendosso" element
     */
    public void xsetNmtipoendosso(org.apache.xmlbeans.XmlString nmtipoendosso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOENDOSSO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOENDOSSO$2);
            }
            target.set(nmtipoendosso);
        }
    }
    
    /**
     * Unsets the "nmtipoendosso" element
     */
    public void unsetNmtipoendosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOENDOSSO$2, 0);
        }
    }
}
