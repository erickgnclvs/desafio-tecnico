/*
 * XML Type:  tipoTelefone
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoTelefone
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoTelefone(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoTelefoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoTelefone
{
    private static final long serialVersionUID = 1L;
    
    public TipoTelefoneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOTELEFONE$0 = 
        new javax.xml.namespace.QName("", "cdtipotelefone");
    private static final javax.xml.namespace.QName DETIPOTELEFONE$2 = 
        new javax.xml.namespace.QName("", "detipotelefone");
    
    
    /**
     * Gets the "cdtipotelefone" element
     */
    public short getCdtipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOTELEFONE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipotelefone" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdtipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOTELEFONE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipotelefone" element
     */
    public boolean isSetCdtipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOTELEFONE$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipotelefone" element
     */
    public void setCdtipotelefone(short cdtipotelefone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOTELEFONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOTELEFONE$0);
            }
            target.setShortValue(cdtipotelefone);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipotelefone" element
     */
    public void xsetCdtipotelefone(org.apache.xmlbeans.XmlShort cdtipotelefone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOTELEFONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDTIPOTELEFONE$0);
            }
            target.set(cdtipotelefone);
        }
    }
    
    /**
     * Unsets the "cdtipotelefone" element
     */
    public void unsetCdtipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOTELEFONE$0, 0);
        }
    }
    
    /**
     * Gets the "detipotelefone" element
     */
    public java.lang.String getDetipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETIPOTELEFONE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detipotelefone" element
     */
    public org.apache.xmlbeans.XmlString xgetDetipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETIPOTELEFONE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "detipotelefone" element
     */
    public boolean isSetDetipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETIPOTELEFONE$2) != 0;
        }
    }
    
    /**
     * Sets the "detipotelefone" element
     */
    public void setDetipotelefone(java.lang.String detipotelefone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETIPOTELEFONE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETIPOTELEFONE$2);
            }
            target.setStringValue(detipotelefone);
        }
    }
    
    /**
     * Sets (as xml) the "detipotelefone" element
     */
    public void xsetDetipotelefone(org.apache.xmlbeans.XmlString detipotelefone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETIPOTELEFONE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETIPOTELEFONE$2);
            }
            target.set(detipotelefone);
        }
    }
    
    /**
     * Unsets the "detipotelefone" element
     */
    public void unsetDetipotelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETIPOTELEFONE$2, 0);
        }
    }
}
