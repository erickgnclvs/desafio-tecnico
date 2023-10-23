/*
 * XML Type:  estado
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Estado
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML estado(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class EstadoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Estado
{
    private static final long serialVersionUID = 1L;
    
    public EstadoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDESTADO$0 = 
        new javax.xml.namespace.QName("", "cdestado");
    private static final javax.xml.namespace.QName DEESTADO$2 = 
        new javax.xml.namespace.QName("", "deestado");
    
    
    /**
     * Gets the "cdestado" element
     */
    public java.lang.String getCdestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESTADO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdestado" element
     */
    public org.apache.xmlbeans.XmlString xgetCdestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDESTADO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdestado" element
     */
    public boolean isSetCdestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDESTADO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdestado" element
     */
    public void setCdestado(java.lang.String cdestado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESTADO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDESTADO$0);
            }
            target.setStringValue(cdestado);
        }
    }
    
    /**
     * Sets (as xml) the "cdestado" element
     */
    public void xsetCdestado(org.apache.xmlbeans.XmlString cdestado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDESTADO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CDESTADO$0);
            }
            target.set(cdestado);
        }
    }
    
    /**
     * Unsets the "cdestado" element
     */
    public void unsetCdestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDESTADO$0, 0);
        }
    }
    
    /**
     * Gets the "deestado" element
     */
    public java.lang.String getDeestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESTADO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deestado" element
     */
    public org.apache.xmlbeans.XmlString xgetDeestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESTADO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deestado" element
     */
    public boolean isSetDeestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEESTADO$2) != 0;
        }
    }
    
    /**
     * Sets the "deestado" element
     */
    public void setDeestado(java.lang.String deestado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESTADO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEESTADO$2);
            }
            target.setStringValue(deestado);
        }
    }
    
    /**
     * Sets (as xml) the "deestado" element
     */
    public void xsetDeestado(org.apache.xmlbeans.XmlString deestado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESTADO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEESTADO$2);
            }
            target.set(deestado);
        }
    }
    
    /**
     * Unsets the "deestado" element
     */
    public void unsetDeestado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEESTADO$2, 0);
        }
    }
}
