/*
 * XML Type:  tipoRegistroAverbacao
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoRegistroAverbacao
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoRegistroAverbacao(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoRegistroAverbacaoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoRegistroAverbacao
{
    private static final long serialVersionUID = 1L;
    
    public TipoRegistroAverbacaoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOREGAVERBACAO$0 = 
        new javax.xml.namespace.QName("", "cdtiporegaverbacao");
    private static final javax.xml.namespace.QName NMTIPOREGAVERBACAO$2 = 
        new javax.xml.namespace.QName("", "nmtiporegaverbacao");
    
    
    /**
     * Gets the "cdtiporegaverbacao" element
     */
    public java.lang.String getCdtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOREGAVERBACAO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtiporegaverbacao" element
     */
    public org.apache.xmlbeans.XmlString xgetCdtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDTIPOREGAVERBACAO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtiporegaverbacao" element
     */
    public boolean isSetCdtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOREGAVERBACAO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtiporegaverbacao" element
     */
    public void setCdtiporegaverbacao(java.lang.String cdtiporegaverbacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOREGAVERBACAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOREGAVERBACAO$0);
            }
            target.setStringValue(cdtiporegaverbacao);
        }
    }
    
    /**
     * Sets (as xml) the "cdtiporegaverbacao" element
     */
    public void xsetCdtiporegaverbacao(org.apache.xmlbeans.XmlString cdtiporegaverbacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDTIPOREGAVERBACAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CDTIPOREGAVERBACAO$0);
            }
            target.set(cdtiporegaverbacao);
        }
    }
    
    /**
     * Unsets the "cdtiporegaverbacao" element
     */
    public void unsetCdtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOREGAVERBACAO$0, 0);
        }
    }
    
    /**
     * Gets the "nmtiporegaverbacao" element
     */
    public java.lang.String getNmtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOREGAVERBACAO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtiporegaverbacao" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOREGAVERBACAO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtiporegaverbacao" element
     */
    public boolean isSetNmtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOREGAVERBACAO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmtiporegaverbacao" element
     */
    public void setNmtiporegaverbacao(java.lang.String nmtiporegaverbacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOREGAVERBACAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOREGAVERBACAO$2);
            }
            target.setStringValue(nmtiporegaverbacao);
        }
    }
    
    /**
     * Sets (as xml) the "nmtiporegaverbacao" element
     */
    public void xsetNmtiporegaverbacao(org.apache.xmlbeans.XmlString nmtiporegaverbacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOREGAVERBACAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOREGAVERBACAO$2);
            }
            target.set(nmtiporegaverbacao);
        }
    }
    
    /**
     * Unsets the "nmtiporegaverbacao" element
     */
    public void unsetNmtiporegaverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOREGAVERBACAO$2, 0);
        }
    }
}
