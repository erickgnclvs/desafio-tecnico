/*
 * XML Type:  especieTitulo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.EspecieTitulo
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML especieTitulo(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class EspecieTituloImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.EspecieTitulo
{
    private static final long serialVersionUID = 1L;
    
    public EspecieTituloImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDESPECIETITULO$0 = 
        new javax.xml.namespace.QName("", "cdespecietitulo");
    private static final javax.xml.namespace.QName NMESPECIETITULO$2 = 
        new javax.xml.namespace.QName("", "nmespecietitulo");
    private static final javax.xml.namespace.QName SGESPECIETITULO$4 = 
        new javax.xml.namespace.QName("", "sgespecietitulo");
    
    
    /**
     * Gets the "cdespecietitulo" element
     */
    public short getCdespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESPECIETITULO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdespecietitulo" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDESPECIETITULO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdespecietitulo" element
     */
    public boolean isSetCdespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDESPECIETITULO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdespecietitulo" element
     */
    public void setCdespecietitulo(short cdespecietitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESPECIETITULO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDESPECIETITULO$0);
            }
            target.setShortValue(cdespecietitulo);
        }
    }
    
    /**
     * Sets (as xml) the "cdespecietitulo" element
     */
    public void xsetCdespecietitulo(org.apache.xmlbeans.XmlShort cdespecietitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDESPECIETITULO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDESPECIETITULO$0);
            }
            target.set(cdespecietitulo);
        }
    }
    
    /**
     * Unsets the "cdespecietitulo" element
     */
    public void unsetCdespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDESPECIETITULO$0, 0);
        }
    }
    
    /**
     * Gets the "nmespecietitulo" element
     */
    public java.lang.String getNmespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMESPECIETITULO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmespecietitulo" element
     */
    public org.apache.xmlbeans.XmlString xgetNmespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMESPECIETITULO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmespecietitulo" element
     */
    public boolean isSetNmespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMESPECIETITULO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmespecietitulo" element
     */
    public void setNmespecietitulo(java.lang.String nmespecietitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMESPECIETITULO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMESPECIETITULO$2);
            }
            target.setStringValue(nmespecietitulo);
        }
    }
    
    /**
     * Sets (as xml) the "nmespecietitulo" element
     */
    public void xsetNmespecietitulo(org.apache.xmlbeans.XmlString nmespecietitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMESPECIETITULO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMESPECIETITULO$2);
            }
            target.set(nmespecietitulo);
        }
    }
    
    /**
     * Unsets the "nmespecietitulo" element
     */
    public void unsetNmespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMESPECIETITULO$2, 0);
        }
    }
    
    /**
     * Gets the "sgespecietitulo" element
     */
    public java.lang.String getSgespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SGESPECIETITULO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sgespecietitulo" element
     */
    public org.apache.xmlbeans.XmlString xgetSgespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SGESPECIETITULO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "sgespecietitulo" element
     */
    public boolean isSetSgespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SGESPECIETITULO$4) != 0;
        }
    }
    
    /**
     * Sets the "sgespecietitulo" element
     */
    public void setSgespecietitulo(java.lang.String sgespecietitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SGESPECIETITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SGESPECIETITULO$4);
            }
            target.setStringValue(sgespecietitulo);
        }
    }
    
    /**
     * Sets (as xml) the "sgespecietitulo" element
     */
    public void xsetSgespecietitulo(org.apache.xmlbeans.XmlString sgespecietitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SGESPECIETITULO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SGESPECIETITULO$4);
            }
            target.set(sgespecietitulo);
        }
    }
    
    /**
     * Unsets the "sgespecietitulo" element
     */
    public void unsetSgespecietitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SGESPECIETITULO$4, 0);
        }
    }
}
