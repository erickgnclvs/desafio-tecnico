/*
 * XML Type:  tipoDocumento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoDocumento
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoDocumento(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoDocumentoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoDocumento
{
    private static final long serialVersionUID = 1L;
    
    public TipoDocumentoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTPDOCUMENTO$0 = 
        new javax.xml.namespace.QName("", "cdtpdocumento");
    private static final javax.xml.namespace.QName DETPDOCUMENTO$2 = 
        new javax.xml.namespace.QName("", "detpdocumento");
    private static final javax.xml.namespace.QName DETPDOCUMENTOABREV$4 = 
        new javax.xml.namespace.QName("", "detpdocumentoabrev");
    
    
    /**
     * Gets the "cdtpdocumento" element
     */
    public short getCdtpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTPDOCUMENTO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtpdocumento" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdtpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTPDOCUMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtpdocumento" element
     */
    public boolean isSetCdtpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTPDOCUMENTO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtpdocumento" element
     */
    public void setCdtpdocumento(short cdtpdocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTPDOCUMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTPDOCUMENTO$0);
            }
            target.setShortValue(cdtpdocumento);
        }
    }
    
    /**
     * Sets (as xml) the "cdtpdocumento" element
     */
    public void xsetCdtpdocumento(org.apache.xmlbeans.XmlShort cdtpdocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTPDOCUMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDTPDOCUMENTO$0);
            }
            target.set(cdtpdocumento);
        }
    }
    
    /**
     * Unsets the "cdtpdocumento" element
     */
    public void unsetCdtpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTPDOCUMENTO$0, 0);
        }
    }
    
    /**
     * Gets the "detpdocumento" element
     */
    public java.lang.String getDetpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPDOCUMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detpdocumento" element
     */
    public org.apache.xmlbeans.XmlString xgetDetpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPDOCUMENTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "detpdocumento" element
     */
    public boolean isSetDetpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETPDOCUMENTO$2) != 0;
        }
    }
    
    /**
     * Sets the "detpdocumento" element
     */
    public void setDetpdocumento(java.lang.String detpdocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPDOCUMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETPDOCUMENTO$2);
            }
            target.setStringValue(detpdocumento);
        }
    }
    
    /**
     * Sets (as xml) the "detpdocumento" element
     */
    public void xsetDetpdocumento(org.apache.xmlbeans.XmlString detpdocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPDOCUMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETPDOCUMENTO$2);
            }
            target.set(detpdocumento);
        }
    }
    
    /**
     * Unsets the "detpdocumento" element
     */
    public void unsetDetpdocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETPDOCUMENTO$2, 0);
        }
    }
    
    /**
     * Gets the "detpdocumentoabrev" element
     */
    public java.lang.String getDetpdocumentoabrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPDOCUMENTOABREV$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detpdocumentoabrev" element
     */
    public org.apache.xmlbeans.XmlString xgetDetpdocumentoabrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPDOCUMENTOABREV$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "detpdocumentoabrev" element
     */
    public boolean isSetDetpdocumentoabrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETPDOCUMENTOABREV$4) != 0;
        }
    }
    
    /**
     * Sets the "detpdocumentoabrev" element
     */
    public void setDetpdocumentoabrev(java.lang.String detpdocumentoabrev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPDOCUMENTOABREV$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETPDOCUMENTOABREV$4);
            }
            target.setStringValue(detpdocumentoabrev);
        }
    }
    
    /**
     * Sets (as xml) the "detpdocumentoabrev" element
     */
    public void xsetDetpdocumentoabrev(org.apache.xmlbeans.XmlString detpdocumentoabrev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPDOCUMENTOABREV$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETPDOCUMENTOABREV$4);
            }
            target.set(detpdocumentoabrev);
        }
    }
    
    /**
     * Unsets the "detpdocumentoabrev" element
     */
    public void unsetDetpdocumentoabrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETPDOCUMENTOABREV$4, 0);
        }
    }
}
