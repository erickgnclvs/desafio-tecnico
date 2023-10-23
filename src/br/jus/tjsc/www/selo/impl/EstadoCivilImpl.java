/*
 * XML Type:  estadoCivil
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.EstadoCivil
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML estadoCivil(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class EstadoCivilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.EstadoCivil
{
    private static final long serialVersionUID = 1L;
    
    public EstadoCivilImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDESTADOCIVIL$0 = 
        new javax.xml.namespace.QName("", "cdestadocivil");
    private static final javax.xml.namespace.QName DEESTADOCIVILFEM$2 = 
        new javax.xml.namespace.QName("", "deestadocivilfem");
    private static final javax.xml.namespace.QName DEESTADOCIVILMASC$4 = 
        new javax.xml.namespace.QName("", "deestadocivilmasc");
    
    
    /**
     * Gets the "cdestadocivil" element
     */
    public short getCdestadocivil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESTADOCIVIL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdestadocivil" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdestadocivil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDESTADOCIVIL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdestadocivil" element
     */
    public boolean isSetCdestadocivil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDESTADOCIVIL$0) != 0;
        }
    }
    
    /**
     * Sets the "cdestadocivil" element
     */
    public void setCdestadocivil(short cdestadocivil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESTADOCIVIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDESTADOCIVIL$0);
            }
            target.setShortValue(cdestadocivil);
        }
    }
    
    /**
     * Sets (as xml) the "cdestadocivil" element
     */
    public void xsetCdestadocivil(org.apache.xmlbeans.XmlShort cdestadocivil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDESTADOCIVIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDESTADOCIVIL$0);
            }
            target.set(cdestadocivil);
        }
    }
    
    /**
     * Unsets the "cdestadocivil" element
     */
    public void unsetCdestadocivil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDESTADOCIVIL$0, 0);
        }
    }
    
    /**
     * Gets the "deestadocivilfem" element
     */
    public java.lang.String getDeestadocivilfem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESTADOCIVILFEM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deestadocivilfem" element
     */
    public org.apache.xmlbeans.XmlString xgetDeestadocivilfem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESTADOCIVILFEM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deestadocivilfem" element
     */
    public boolean isSetDeestadocivilfem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEESTADOCIVILFEM$2) != 0;
        }
    }
    
    /**
     * Sets the "deestadocivilfem" element
     */
    public void setDeestadocivilfem(java.lang.String deestadocivilfem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESTADOCIVILFEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEESTADOCIVILFEM$2);
            }
            target.setStringValue(deestadocivilfem);
        }
    }
    
    /**
     * Sets (as xml) the "deestadocivilfem" element
     */
    public void xsetDeestadocivilfem(org.apache.xmlbeans.XmlString deestadocivilfem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESTADOCIVILFEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEESTADOCIVILFEM$2);
            }
            target.set(deestadocivilfem);
        }
    }
    
    /**
     * Unsets the "deestadocivilfem" element
     */
    public void unsetDeestadocivilfem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEESTADOCIVILFEM$2, 0);
        }
    }
    
    /**
     * Gets the "deestadocivilmasc" element
     */
    public java.lang.String getDeestadocivilmasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESTADOCIVILMASC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deestadocivilmasc" element
     */
    public org.apache.xmlbeans.XmlString xgetDeestadocivilmasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESTADOCIVILMASC$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "deestadocivilmasc" element
     */
    public boolean isSetDeestadocivilmasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEESTADOCIVILMASC$4) != 0;
        }
    }
    
    /**
     * Sets the "deestadocivilmasc" element
     */
    public void setDeestadocivilmasc(java.lang.String deestadocivilmasc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESTADOCIVILMASC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEESTADOCIVILMASC$4);
            }
            target.setStringValue(deestadocivilmasc);
        }
    }
    
    /**
     * Sets (as xml) the "deestadocivilmasc" element
     */
    public void xsetDeestadocivilmasc(org.apache.xmlbeans.XmlString deestadocivilmasc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESTADOCIVILMASC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEESTADOCIVILMASC$4);
            }
            target.set(deestadocivilmasc);
        }
    }
    
    /**
     * Unsets the "deestadocivilmasc" element
     */
    public void unsetDeestadocivilmasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEESTADOCIVILMASC$4, 0);
        }
    }
}
