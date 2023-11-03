/*
 * XML Type:  tipoProcuracao
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoProcuracao
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoProcuracao(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoProcuracaoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoProcuracao
{
    private static final long serialVersionUID = 1L;
    
    public TipoProcuracaoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOPROCURACAO$0 = 
        new javax.xml.namespace.QName("", "cdtipoprocuracao");
    private static final javax.xml.namespace.QName NMTIPOPROCURACAO$2 = 
        new javax.xml.namespace.QName("", "nmtipoprocuracao");
    
    
    /**
     * Gets the "cdtipoprocuracao" element
     */
    public long getCdtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOPROCURACAO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipoprocuracao" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOPROCURACAO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipoprocuracao" element
     */
    public boolean isSetCdtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOPROCURACAO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipoprocuracao" element
     */
    public void setCdtipoprocuracao(long cdtipoprocuracao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOPROCURACAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOPROCURACAO$0);
            }
            target.setLongValue(cdtipoprocuracao);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipoprocuracao" element
     */
    public void xsetCdtipoprocuracao(org.apache.xmlbeans.XmlLong cdtipoprocuracao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOPROCURACAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDTIPOPROCURACAO$0);
            }
            target.set(cdtipoprocuracao);
        }
    }
    
    /**
     * Unsets the "cdtipoprocuracao" element
     */
    public void unsetCdtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOPROCURACAO$0, 0);
        }
    }
    
    /**
     * Gets the "nmtipoprocuracao" element
     */
    public java.lang.String getNmtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOPROCURACAO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipoprocuracao" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOPROCURACAO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipoprocuracao" element
     */
    public boolean isSetNmtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOPROCURACAO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmtipoprocuracao" element
     */
    public void setNmtipoprocuracao(java.lang.String nmtipoprocuracao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOPROCURACAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOPROCURACAO$2);
            }
            target.setStringValue(nmtipoprocuracao);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipoprocuracao" element
     */
    public void xsetNmtipoprocuracao(org.apache.xmlbeans.XmlString nmtipoprocuracao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOPROCURACAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOPROCURACAO$2);
            }
            target.set(nmtipoprocuracao);
        }
    }
    
    /**
     * Unsets the "nmtipoprocuracao" element
     */
    public void unsetNmtipoprocuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOPROCURACAO$2, 0);
        }
    }
}
