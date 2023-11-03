/*
 * XML Type:  comarcaMunicipio
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.ComarcaMunicipio
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML comarcaMunicipio(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class ComarcaMunicipioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.ComarcaMunicipio
{
    private static final long serialVersionUID = 1L;
    
    public ComarcaMunicipioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDCOMARCA$0 = 
        new javax.xml.namespace.QName("", "cdcomarca");
    private static final javax.xml.namespace.QName CDMUNICIPIO$2 = 
        new javax.xml.namespace.QName("", "cdmunicipio");
    
    
    /**
     * Gets the "cdcomarca" element
     */
    public int getCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDCOMARCA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdcomarca" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDCOMARCA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdcomarca" element
     */
    public boolean isSetCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDCOMARCA$0) != 0;
        }
    }
    
    /**
     * Sets the "cdcomarca" element
     */
    public void setCdcomarca(int cdcomarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDCOMARCA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDCOMARCA$0);
            }
            target.setIntValue(cdcomarca);
        }
    }
    
    /**
     * Sets (as xml) the "cdcomarca" element
     */
    public void xsetCdcomarca(org.apache.xmlbeans.XmlInt cdcomarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDCOMARCA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDCOMARCA$0);
            }
            target.set(cdcomarca);
        }
    }
    
    /**
     * Unsets the "cdcomarca" element
     */
    public void unsetCdcomarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDCOMARCA$0, 0);
        }
    }
    
    /**
     * Gets the "cdmunicipio" element
     */
    public int getCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMUNICIPIO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdmunicipio" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDMUNICIPIO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdmunicipio" element
     */
    public boolean isSetCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDMUNICIPIO$2) != 0;
        }
    }
    
    /**
     * Sets the "cdmunicipio" element
     */
    public void setCdmunicipio(int cdmunicipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMUNICIPIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDMUNICIPIO$2);
            }
            target.setIntValue(cdmunicipio);
        }
    }
    
    /**
     * Sets (as xml) the "cdmunicipio" element
     */
    public void xsetCdmunicipio(org.apache.xmlbeans.XmlInt cdmunicipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDMUNICIPIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDMUNICIPIO$2);
            }
            target.set(cdmunicipio);
        }
    }
    
    /**
     * Unsets the "cdmunicipio" element
     */
    public void unsetCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDMUNICIPIO$2, 0);
        }
    }
}
