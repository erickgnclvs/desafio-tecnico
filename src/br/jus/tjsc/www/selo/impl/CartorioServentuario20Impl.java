/*
 * XML Type:  cartorioServentuario20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.CartorioServentuario20
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML cartorioServentuario20(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class CartorioServentuario20Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.CartorioServentuario20
{
    private static final long serialVersionUID = 1L;
    
    public CartorioServentuario20Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSERVENTUARIO$0 = 
        new javax.xml.namespace.QName("", "cdserventuario");
    private static final javax.xml.namespace.QName CDTIPOSERVENTUARIO$2 = 
        new javax.xml.namespace.QName("", "cdtiposerventuario");
    private static final javax.xml.namespace.QName NMSERVENTUARIO$4 = 
        new javax.xml.namespace.QName("", "nmserventuario");
    private static final javax.xml.namespace.QName NMTIPOSERVENTUARIO$6 = 
        new javax.xml.namespace.QName("", "nmtiposerventuario");
    private static final javax.xml.namespace.QName NUCARTORIO$8 = 
        new javax.xml.namespace.QName("", "nucartorio");
    
    
    /**
     * Gets the "cdserventuario" element
     */
    public int getCdserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSERVENTUARIO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdserventuario" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDSERVENTUARIO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdserventuario" element
     */
    public boolean isSetCdserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSERVENTUARIO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdserventuario" element
     */
    public void setCdserventuario(int cdserventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSERVENTUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSERVENTUARIO$0);
            }
            target.setIntValue(cdserventuario);
        }
    }
    
    /**
     * Sets (as xml) the "cdserventuario" element
     */
    public void xsetCdserventuario(org.apache.xmlbeans.XmlInt cdserventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDSERVENTUARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDSERVENTUARIO$0);
            }
            target.set(cdserventuario);
        }
    }
    
    /**
     * Unsets the "cdserventuario" element
     */
    public void unsetCdserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSERVENTUARIO$0, 0);
        }
    }
    
    /**
     * Gets the "cdtiposerventuario" element
     */
    public int getCdtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOSERVENTUARIO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtiposerventuario" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdtiposerventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTIPOSERVENTUARIO$2, 0);
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
            return get_store().count_elements(CDTIPOSERVENTUARIO$2) != 0;
        }
    }
    
    /**
     * Sets the "cdtiposerventuario" element
     */
    public void setCdtiposerventuario(int cdtiposerventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOSERVENTUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOSERVENTUARIO$2);
            }
            target.setIntValue(cdtiposerventuario);
        }
    }
    
    /**
     * Sets (as xml) the "cdtiposerventuario" element
     */
    public void xsetCdtiposerventuario(org.apache.xmlbeans.XmlInt cdtiposerventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTIPOSERVENTUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDTIPOSERVENTUARIO$2);
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
            get_store().remove_element(CDTIPOSERVENTUARIO$2, 0);
        }
    }
    
    /**
     * Gets the "nmserventuario" element
     */
    public java.lang.String getNmserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMSERVENTUARIO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmserventuario" element
     */
    public org.apache.xmlbeans.XmlString xgetNmserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMSERVENTUARIO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmserventuario" element
     */
    public boolean isSetNmserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMSERVENTUARIO$4) != 0;
        }
    }
    
    /**
     * Sets the "nmserventuario" element
     */
    public void setNmserventuario(java.lang.String nmserventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMSERVENTUARIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMSERVENTUARIO$4);
            }
            target.setStringValue(nmserventuario);
        }
    }
    
    /**
     * Sets (as xml) the "nmserventuario" element
     */
    public void xsetNmserventuario(org.apache.xmlbeans.XmlString nmserventuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMSERVENTUARIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMSERVENTUARIO$4);
            }
            target.set(nmserventuario);
        }
    }
    
    /**
     * Unsets the "nmserventuario" element
     */
    public void unsetNmserventuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMSERVENTUARIO$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOSERVENTUARIO$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOSERVENTUARIO$6, 0);
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
            return get_store().count_elements(NMTIPOSERVENTUARIO$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOSERVENTUARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOSERVENTUARIO$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOSERVENTUARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOSERVENTUARIO$6);
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
            get_store().remove_element(NMTIPOSERVENTUARIO$6, 0);
        }
    }
    
    /**
     * Gets the "nucartorio" element
     */
    public int getNucartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCARTORIO$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "nucartorio" element
     */
    public org.apache.xmlbeans.XmlInt xgetNucartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUCARTORIO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "nucartorio" element
     */
    public boolean isSetNucartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUCARTORIO$8) != 0;
        }
    }
    
    /**
     * Sets the "nucartorio" element
     */
    public void setNucartorio(int nucartorio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCARTORIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUCARTORIO$8);
            }
            target.setIntValue(nucartorio);
        }
    }
    
    /**
     * Sets (as xml) the "nucartorio" element
     */
    public void xsetNucartorio(org.apache.xmlbeans.XmlInt nucartorio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUCARTORIO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUCARTORIO$8);
            }
            target.set(nucartorio);
        }
    }
    
    /**
     * Unsets the "nucartorio" element
     */
    public void unsetNucartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUCARTORIO$8, 0);
        }
    }
}
