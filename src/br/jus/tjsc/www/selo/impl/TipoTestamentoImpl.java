/*
 * XML Type:  tipoTestamento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoTestamento
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoTestamento(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoTestamentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoTestamento
{
    private static final long serialVersionUID = 1L;
    
    public TipoTestamentoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOTESTAMENTO$0 = 
        new javax.xml.namespace.QName("", "cdtipotestamento");
    private static final javax.xml.namespace.QName NMTIPOTESTAMENTO$2 = 
        new javax.xml.namespace.QName("", "nmtipotestamento");
    
    
    /**
     * Gets the "cdtipotestamento" element
     */
    public long getCdtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOTESTAMENTO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipotestamento" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOTESTAMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipotestamento" element
     */
    public boolean isSetCdtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOTESTAMENTO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipotestamento" element
     */
    public void setCdtipotestamento(long cdtipotestamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOTESTAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOTESTAMENTO$0);
            }
            target.setLongValue(cdtipotestamento);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipotestamento" element
     */
    public void xsetCdtipotestamento(org.apache.xmlbeans.XmlLong cdtipotestamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOTESTAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDTIPOTESTAMENTO$0);
            }
            target.set(cdtipotestamento);
        }
    }
    
    /**
     * Unsets the "cdtipotestamento" element
     */
    public void unsetCdtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOTESTAMENTO$0, 0);
        }
    }
    
    /**
     * Gets the "nmtipotestamento" element
     */
    public java.lang.String getNmtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOTESTAMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipotestamento" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOTESTAMENTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipotestamento" element
     */
    public boolean isSetNmtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOTESTAMENTO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmtipotestamento" element
     */
    public void setNmtipotestamento(java.lang.String nmtipotestamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOTESTAMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOTESTAMENTO$2);
            }
            target.setStringValue(nmtipotestamento);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipotestamento" element
     */
    public void xsetNmtipotestamento(org.apache.xmlbeans.XmlString nmtipotestamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOTESTAMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOTESTAMENTO$2);
            }
            target.set(nmtipotestamento);
        }
    }
    
    /**
     * Unsets the "nmtipotestamento" element
     */
    public void unsetNmtipotestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOTESTAMENTO$2, 0);
        }
    }
}
