/*
 * XML Type:  municipio
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Municipio
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML municipio(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class MunicipioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Municipio
{
    private static final long serialVersionUID = 1L;
    
    public MunicipioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDMUNICIPIO$0 = 
        new javax.xml.namespace.QName("", "cdmunicipio");
    private static final javax.xml.namespace.QName DEESTADO$2 = 
        new javax.xml.namespace.QName("", "deestado");
    private static final javax.xml.namespace.QName NMMUNICIPIO$4 = 
        new javax.xml.namespace.QName("", "nmmunicipio");
    
    
    /**
     * Gets the "cdmunicipio" element
     */
    public int getCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMUNICIPIO$0, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDMUNICIPIO$0, 0);
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
            return get_store().count_elements(CDMUNICIPIO$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMUNICIPIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDMUNICIPIO$0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDMUNICIPIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDMUNICIPIO$0);
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
            get_store().remove_element(CDMUNICIPIO$0, 0);
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
    
    /**
     * Gets the "nmmunicipio" element
     */
    public java.lang.String getNmmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMUNICIPIO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmmunicipio" element
     */
    public org.apache.xmlbeans.XmlString xgetNmmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMUNICIPIO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmmunicipio" element
     */
    public boolean isSetNmmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMMUNICIPIO$4) != 0;
        }
    }
    
    /**
     * Sets the "nmmunicipio" element
     */
    public void setNmmunicipio(java.lang.String nmmunicipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMUNICIPIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMMUNICIPIO$4);
            }
            target.setStringValue(nmmunicipio);
        }
    }
    
    /**
     * Sets (as xml) the "nmmunicipio" element
     */
    public void xsetNmmunicipio(org.apache.xmlbeans.XmlString nmmunicipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMUNICIPIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMMUNICIPIO$4);
            }
            target.set(nmmunicipio);
        }
    }
    
    /**
     * Unsets the "nmmunicipio" element
     */
    public void unsetNmmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMMUNICIPIO$4, 0);
        }
    }
}
