/*
 * XML Type:  formaPagamento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.FormaPagamento
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML formaPagamento(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class FormaPagamentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.FormaPagamento
{
    private static final long serialVersionUID = 1L;
    
    public FormaPagamentoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDFORMAPAGAMENTO$0 = 
        new javax.xml.namespace.QName("", "cdformapagamento");
    private static final javax.xml.namespace.QName NMFORMAPAGAMENTO$2 = 
        new javax.xml.namespace.QName("", "nmformapagamento");
    
    
    /**
     * Gets the "cdformapagamento" element
     */
    public short getCdformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDFORMAPAGAMENTO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdformapagamento" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDFORMAPAGAMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdformapagamento" element
     */
    public boolean isSetCdformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDFORMAPAGAMENTO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdformapagamento" element
     */
    public void setCdformapagamento(short cdformapagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDFORMAPAGAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDFORMAPAGAMENTO$0);
            }
            target.setShortValue(cdformapagamento);
        }
    }
    
    /**
     * Sets (as xml) the "cdformapagamento" element
     */
    public void xsetCdformapagamento(org.apache.xmlbeans.XmlShort cdformapagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDFORMAPAGAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDFORMAPAGAMENTO$0);
            }
            target.set(cdformapagamento);
        }
    }
    
    /**
     * Unsets the "cdformapagamento" element
     */
    public void unsetCdformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDFORMAPAGAMENTO$0, 0);
        }
    }
    
    /**
     * Gets the "nmformapagamento" element
     */
    public java.lang.String getNmformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMFORMAPAGAMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmformapagamento" element
     */
    public org.apache.xmlbeans.XmlString xgetNmformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMFORMAPAGAMENTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmformapagamento" element
     */
    public boolean isSetNmformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMFORMAPAGAMENTO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmformapagamento" element
     */
    public void setNmformapagamento(java.lang.String nmformapagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMFORMAPAGAMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMFORMAPAGAMENTO$2);
            }
            target.setStringValue(nmformapagamento);
        }
    }
    
    /**
     * Sets (as xml) the "nmformapagamento" element
     */
    public void xsetNmformapagamento(org.apache.xmlbeans.XmlString nmformapagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMFORMAPAGAMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMFORMAPAGAMENTO$2);
            }
            target.set(nmformapagamento);
        }
    }
    
    /**
     * Unsets the "nmformapagamento" element
     */
    public void unsetNmformapagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMFORMAPAGAMENTO$2, 0);
        }
    }
}
