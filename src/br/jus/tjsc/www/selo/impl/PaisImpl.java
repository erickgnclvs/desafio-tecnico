/*
 * XML Type:  pais
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Pais
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML pais(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class PaisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Pais
{
    private static final long serialVersionUID = 1L;
    
    public PaisImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDPAIS$0 = 
        new javax.xml.namespace.QName("", "cdpais");
    private static final javax.xml.namespace.QName DENACIONALIDADEFEMININA$2 = 
        new javax.xml.namespace.QName("", "denacionalidadefeminina");
    private static final javax.xml.namespace.QName DENACIONALIDADEMASC$4 = 
        new javax.xml.namespace.QName("", "denacionalidademasc");
    private static final javax.xml.namespace.QName DEPAIS$6 = 
        new javax.xml.namespace.QName("", "depais");
    
    
    /**
     * Gets the "cdpais" element
     */
    public short getCdpais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDPAIS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdpais" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdpais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDPAIS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdpais" element
     */
    public boolean isSetCdpais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDPAIS$0) != 0;
        }
    }
    
    /**
     * Sets the "cdpais" element
     */
    public void setCdpais(short cdpais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDPAIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDPAIS$0);
            }
            target.setShortValue(cdpais);
        }
    }
    
    /**
     * Sets (as xml) the "cdpais" element
     */
    public void xsetCdpais(org.apache.xmlbeans.XmlShort cdpais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDPAIS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDPAIS$0);
            }
            target.set(cdpais);
        }
    }
    
    /**
     * Unsets the "cdpais" element
     */
    public void unsetCdpais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDPAIS$0, 0);
        }
    }
    
    /**
     * Gets the "denacionalidadefeminina" element
     */
    public java.lang.String getDenacionalidadefeminina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENACIONALIDADEFEMININA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "denacionalidadefeminina" element
     */
    public org.apache.xmlbeans.XmlString xgetDenacionalidadefeminina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENACIONALIDADEFEMININA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "denacionalidadefeminina" element
     */
    public boolean isSetDenacionalidadefeminina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DENACIONALIDADEFEMININA$2) != 0;
        }
    }
    
    /**
     * Sets the "denacionalidadefeminina" element
     */
    public void setDenacionalidadefeminina(java.lang.String denacionalidadefeminina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENACIONALIDADEFEMININA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENACIONALIDADEFEMININA$2);
            }
            target.setStringValue(denacionalidadefeminina);
        }
    }
    
    /**
     * Sets (as xml) the "denacionalidadefeminina" element
     */
    public void xsetDenacionalidadefeminina(org.apache.xmlbeans.XmlString denacionalidadefeminina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENACIONALIDADEFEMININA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENACIONALIDADEFEMININA$2);
            }
            target.set(denacionalidadefeminina);
        }
    }
    
    /**
     * Unsets the "denacionalidadefeminina" element
     */
    public void unsetDenacionalidadefeminina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DENACIONALIDADEFEMININA$2, 0);
        }
    }
    
    /**
     * Gets the "denacionalidademasc" element
     */
    public java.lang.String getDenacionalidademasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENACIONALIDADEMASC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "denacionalidademasc" element
     */
    public org.apache.xmlbeans.XmlString xgetDenacionalidademasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENACIONALIDADEMASC$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "denacionalidademasc" element
     */
    public boolean isSetDenacionalidademasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DENACIONALIDADEMASC$4) != 0;
        }
    }
    
    /**
     * Sets the "denacionalidademasc" element
     */
    public void setDenacionalidademasc(java.lang.String denacionalidademasc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENACIONALIDADEMASC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENACIONALIDADEMASC$4);
            }
            target.setStringValue(denacionalidademasc);
        }
    }
    
    /**
     * Sets (as xml) the "denacionalidademasc" element
     */
    public void xsetDenacionalidademasc(org.apache.xmlbeans.XmlString denacionalidademasc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENACIONALIDADEMASC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENACIONALIDADEMASC$4);
            }
            target.set(denacionalidademasc);
        }
    }
    
    /**
     * Unsets the "denacionalidademasc" element
     */
    public void unsetDenacionalidademasc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DENACIONALIDADEMASC$4, 0);
        }
    }
    
    /**
     * Gets the "depais" element
     */
    public java.lang.String getDepais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPAIS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "depais" element
     */
    public org.apache.xmlbeans.XmlString xgetDepais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPAIS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "depais" element
     */
    public boolean isSetDepais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPAIS$6) != 0;
        }
    }
    
    /**
     * Sets the "depais" element
     */
    public void setDepais(java.lang.String depais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPAIS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPAIS$6);
            }
            target.setStringValue(depais);
        }
    }
    
    /**
     * Sets (as xml) the "depais" element
     */
    public void xsetDepais(org.apache.xmlbeans.XmlString depais)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPAIS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPAIS$6);
            }
            target.set(depais);
        }
    }
    
    /**
     * Unsets the "depais" element
     */
    public void unsetDepais()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPAIS$6, 0);
        }
    }
}
