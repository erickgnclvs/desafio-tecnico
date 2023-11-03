/*
 * XML Type:  tipoAto
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoAto
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoAto(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoAtoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoAto
{
    private static final long serialVersionUID = 1L;
    
    public TipoAtoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOATO$0 = 
        new javax.xml.namespace.QName("", "cdtipoato");
    private static final javax.xml.namespace.QName FLATIVO$2 = 
        new javax.xml.namespace.QName("", "flativo");
    private static final javax.xml.namespace.QName MODELOSCOMPATIVEIS$4 = 
        new javax.xml.namespace.QName("", "modeloscompativeis");
    private static final javax.xml.namespace.QName NMTIPOATO$6 = 
        new javax.xml.namespace.QName("", "nmtipoato");
    
    
    /**
     * Gets the "cdtipoato" element
     */
    public long getCdtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOATO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipoato" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOATO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipoato" element
     */
    public boolean isSetCdtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOATO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipoato" element
     */
    public void setCdtipoato(long cdtipoato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOATO$0);
            }
            target.setLongValue(cdtipoato);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipoato" element
     */
    public void xsetCdtipoato(org.apache.xmlbeans.XmlLong cdtipoato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDTIPOATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDTIPOATO$0);
            }
            target.set(cdtipoato);
        }
    }
    
    /**
     * Unsets the "cdtipoato" element
     */
    public void unsetCdtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOATO$0, 0);
        }
    }
    
    /**
     * Gets the "flativo" element
     */
    public short getFlativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLATIVO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "flativo" element
     */
    public org.apache.xmlbeans.XmlShort xgetFlativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(FLATIVO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "flativo" element
     */
    public void setFlativo(short flativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLATIVO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLATIVO$2);
            }
            target.setShortValue(flativo);
        }
    }
    
    /**
     * Sets (as xml) the "flativo" element
     */
    public void xsetFlativo(org.apache.xmlbeans.XmlShort flativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(FLATIVO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(FLATIVO$2);
            }
            target.set(flativo);
        }
    }
    
    /**
     * Gets the "modeloscompativeis" element
     */
    public java.lang.String getModeloscompativeis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELOSCOMPATIVEIS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "modeloscompativeis" element
     */
    public org.apache.xmlbeans.XmlString xgetModeloscompativeis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELOSCOMPATIVEIS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "modeloscompativeis" element
     */
    public boolean isSetModeloscompativeis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODELOSCOMPATIVEIS$4) != 0;
        }
    }
    
    /**
     * Sets the "modeloscompativeis" element
     */
    public void setModeloscompativeis(java.lang.String modeloscompativeis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELOSCOMPATIVEIS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODELOSCOMPATIVEIS$4);
            }
            target.setStringValue(modeloscompativeis);
        }
    }
    
    /**
     * Sets (as xml) the "modeloscompativeis" element
     */
    public void xsetModeloscompativeis(org.apache.xmlbeans.XmlString modeloscompativeis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELOSCOMPATIVEIS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODELOSCOMPATIVEIS$4);
            }
            target.set(modeloscompativeis);
        }
    }
    
    /**
     * Unsets the "modeloscompativeis" element
     */
    public void unsetModeloscompativeis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODELOSCOMPATIVEIS$4, 0);
        }
    }
    
    /**
     * Gets the "nmtipoato" element
     */
    public java.lang.String getNmtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOATO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipoato" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOATO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipoato" element
     */
    public boolean isSetNmtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOATO$6) != 0;
        }
    }
    
    /**
     * Sets the "nmtipoato" element
     */
    public void setNmtipoato(java.lang.String nmtipoato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOATO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOATO$6);
            }
            target.setStringValue(nmtipoato);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipoato" element
     */
    public void xsetNmtipoato(org.apache.xmlbeans.XmlString nmtipoato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOATO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOATO$6);
            }
            target.set(nmtipoato);
        }
    }
    
    /**
     * Unsets the "nmtipoato" element
     */
    public void unsetNmtipoato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOATO$6, 0);
        }
    }
}
