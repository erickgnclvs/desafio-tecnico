/*
 * XML Type:  tipoServentuario
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoServentuario
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoServentuario(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoServentuarioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoServentuario
{
    private static final long serialVersionUID = 1L;
    
    public TipoServentuarioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOSERVENTUARIO$0 = 
        new javax.xml.namespace.QName("", "cdtiposerventuario");
    private static final javax.xml.namespace.QName NMTIPOSERVENTUARIO$2 = 
        new javax.xml.namespace.QName("", "nmtiposerventuario");
    
    
    /**
     * Gets the "cdtiposerventuario" element
     */
    public short getCdtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOSERVENTUARIO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtiposerventuario" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOSERVENTUARIO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtiposerventuario" element
     */
    public boolean isSetCdtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOSERVENTUARIO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtiposerventuario" element
     */
    public void setCdtiposerventuario(short cdtiposerventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOSERVENTUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOSERVENTUARIO$0);
            }
            target.setShortValue(cdtiposerventuario);
        }
    }
    
    /**
     * Sets (as xml) the "cdtiposerventuario" element
     */
    public void xsetCdtiposerventuario(org.apache.xmlbeans.XmlShort cdtiposerventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOSERVENTUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDTIPOSERVENTUARIO$0);
            }
            target.set(cdtiposerventuario);
        }
    }
    
    /**
     * Unsets the "cdtiposerventuario" element
     */
    public void unsetCdtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOSERVENTUARIO$0, 0);
        }
    }
    
    /**
     * Gets the "nmtiposerventuario" element
     */
    public java.lang.String getNmtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOSERVENTUARIO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtiposerventuario" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOSERVENTUARIO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtiposerventuario" element
     */
    public boolean isSetNmtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOSERVENTUARIO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmtiposerventuario" element
     */
    public void setNmtiposerventuario(java.lang.String nmtiposerventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOSERVENTUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOSERVENTUARIO$2);
            }
            target.setStringValue(nmtiposerventuario);
        }
    }
    
    /**
     * Sets (as xml) the "nmtiposerventuario" element
     */
    public void xsetNmtiposerventuario(org.apache.xmlbeans.XmlString nmtiposerventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOSERVENTUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOSERVENTUARIO$2);
            }
            target.set(nmtiposerventuario);
        }
    }
    
    /**
     * Unsets the "nmtiposerventuario" element
     */
    public void unsetNmtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOSERVENTUARIO$2, 0);
        }
    }
}
