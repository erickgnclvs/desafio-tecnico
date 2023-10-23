/*
 * XML Type:  tipoSubestabelecimento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoSubestabelecimento
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoSubestabelecimento(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoSubestabelecimentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoSubestabelecimento
{
    private static final long serialVersionUID = 1L;
    
    public TipoSubestabelecimentoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOSUBESTABELECIMENTO$0 = 
        new javax.xml.namespace.QName("", "cdtiposubestabelecimento");
    private static final javax.xml.namespace.QName NMTIPOSUBESTABELECIMENTO$2 = 
        new javax.xml.namespace.QName("", "nmtiposubestabelecimento");
    
    
    /**
     * Gets the "cdtiposubestabelecimento" element
     */
    public long getCdtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOSUBESTABELECIMENTO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtiposubestabelecimento" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOSUBESTABELECIMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtiposubestabelecimento" element
     */
    public boolean isSetCdtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOSUBESTABELECIMENTO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtiposubestabelecimento" element
     */
    public void setCdtiposubestabelecimento(long cdtiposubestabelecimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOSUBESTABELECIMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOSUBESTABELECIMENTO$0);
            }
            target.setLongValue(cdtiposubestabelecimento);
        }
    }
    
    /**
     * Sets (as xml) the "cdtiposubestabelecimento" element
     */
    public void xsetCdtiposubestabelecimento(org.apache.xmlbeans.XmlLong cdtiposubestabelecimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOSUBESTABELECIMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDTIPOSUBESTABELECIMENTO$0);
            }
            target.set(cdtiposubestabelecimento);
        }
    }
    
    /**
     * Unsets the "cdtiposubestabelecimento" element
     */
    public void unsetCdtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOSUBESTABELECIMENTO$0, 0);
        }
    }
    
    /**
     * Gets the "nmtiposubestabelecimento" element
     */
    public java.lang.String getNmtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOSUBESTABELECIMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtiposubestabelecimento" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOSUBESTABELECIMENTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtiposubestabelecimento" element
     */
    public boolean isSetNmtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOSUBESTABELECIMENTO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmtiposubestabelecimento" element
     */
    public void setNmtiposubestabelecimento(java.lang.String nmtiposubestabelecimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOSUBESTABELECIMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOSUBESTABELECIMENTO$2);
            }
            target.setStringValue(nmtiposubestabelecimento);
        }
    }
    
    /**
     * Sets (as xml) the "nmtiposubestabelecimento" element
     */
    public void xsetNmtiposubestabelecimento(org.apache.xmlbeans.XmlString nmtiposubestabelecimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOSUBESTABELECIMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOSUBESTABELECIMENTO$2);
            }
            target.set(nmtiposubestabelecimento);
        }
    }
    
    /**
     * Unsets the "nmtiposubestabelecimento" element
     */
    public void unsetNmtiposubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOSUBESTABELECIMENTO$2, 0);
        }
    }
}
