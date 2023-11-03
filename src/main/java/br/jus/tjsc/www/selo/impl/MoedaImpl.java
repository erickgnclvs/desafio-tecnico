/*
 * XML Type:  moeda
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Moeda
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML moeda(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class MoedaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Moeda
{
    private static final long serialVersionUID = 1L;
    
    public MoedaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDMOEDA$0 = 
        new javax.xml.namespace.QName("", "cdmoeda");
    private static final javax.xml.namespace.QName DESIMBOLO$2 = 
        new javax.xml.namespace.QName("", "desimbolo");
    private static final javax.xml.namespace.QName DTVIGENCIA$4 = 
        new javax.xml.namespace.QName("", "dtvigencia");
    private static final javax.xml.namespace.QName FLMOEDABR$6 = 
        new javax.xml.namespace.QName("", "flmoedabr");
    private static final javax.xml.namespace.QName FLVIGENTE$8 = 
        new javax.xml.namespace.QName("", "flvigente");
    private static final javax.xml.namespace.QName NMMOEDA$10 = 
        new javax.xml.namespace.QName("", "nmmoeda");
    private static final javax.xml.namespace.QName NMMOEDAPLURAL$12 = 
        new javax.xml.namespace.QName("", "nmmoedaplural");
    
    
    /**
     * Gets the "cdmoeda" element
     */
    public short getCdmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMOEDA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdmoeda" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDMOEDA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdmoeda" element
     */
    public boolean isSetCdmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDMOEDA$0) != 0;
        }
    }
    
    /**
     * Sets the "cdmoeda" element
     */
    public void setCdmoeda(short cdmoeda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMOEDA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDMOEDA$0);
            }
            target.setShortValue(cdmoeda);
        }
    }
    
    /**
     * Sets (as xml) the "cdmoeda" element
     */
    public void xsetCdmoeda(org.apache.xmlbeans.XmlShort cdmoeda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDMOEDA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDMOEDA$0);
            }
            target.set(cdmoeda);
        }
    }
    
    /**
     * Unsets the "cdmoeda" element
     */
    public void unsetCdmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDMOEDA$0, 0);
        }
    }
    
    /**
     * Gets the "desimbolo" element
     */
    public java.lang.String getDesimbolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESIMBOLO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "desimbolo" element
     */
    public org.apache.xmlbeans.XmlString xgetDesimbolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESIMBOLO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "desimbolo" element
     */
    public boolean isSetDesimbolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESIMBOLO$2) != 0;
        }
    }
    
    /**
     * Sets the "desimbolo" element
     */
    public void setDesimbolo(java.lang.String desimbolo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESIMBOLO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESIMBOLO$2);
            }
            target.setStringValue(desimbolo);
        }
    }
    
    /**
     * Sets (as xml) the "desimbolo" element
     */
    public void xsetDesimbolo(org.apache.xmlbeans.XmlString desimbolo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESIMBOLO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESIMBOLO$2);
            }
            target.set(desimbolo);
        }
    }
    
    /**
     * Unsets the "desimbolo" element
     */
    public void unsetDesimbolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESIMBOLO$2, 0);
        }
    }
    
    /**
     * Gets the "dtvigencia" element
     */
    public java.util.Calendar getDtvigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTVIGENCIA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtvigencia" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtvigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTVIGENCIA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtvigencia" element
     */
    public boolean isSetDtvigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTVIGENCIA$4) != 0;
        }
    }
    
    /**
     * Sets the "dtvigencia" element
     */
    public void setDtvigencia(java.util.Calendar dtvigencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTVIGENCIA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTVIGENCIA$4);
            }
            target.setCalendarValue(dtvigencia);
        }
    }
    
    /**
     * Sets (as xml) the "dtvigencia" element
     */
    public void xsetDtvigencia(org.apache.xmlbeans.XmlDateTime dtvigencia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTVIGENCIA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTVIGENCIA$4);
            }
            target.set(dtvigencia);
        }
    }
    
    /**
     * Unsets the "dtvigencia" element
     */
    public void unsetDtvigencia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTVIGENCIA$4, 0);
        }
    }
    
    /**
     * Gets the "flmoedabr" element
     */
    public short getFlmoedabr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLMOEDABR$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "flmoedabr" element
     */
    public org.apache.xmlbeans.XmlShort xgetFlmoedabr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(FLMOEDABR$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "flmoedabr" element
     */
    public void setFlmoedabr(short flmoedabr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLMOEDABR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLMOEDABR$6);
            }
            target.setShortValue(flmoedabr);
        }
    }
    
    /**
     * Sets (as xml) the "flmoedabr" element
     */
    public void xsetFlmoedabr(org.apache.xmlbeans.XmlShort flmoedabr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(FLMOEDABR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(FLMOEDABR$6);
            }
            target.set(flmoedabr);
        }
    }
    
    /**
     * Gets the "flvigente" element
     */
    public short getFlvigente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLVIGENTE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "flvigente" element
     */
    public org.apache.xmlbeans.XmlShort xgetFlvigente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(FLVIGENTE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "flvigente" element
     */
    public void setFlvigente(short flvigente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLVIGENTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLVIGENTE$8);
            }
            target.setShortValue(flvigente);
        }
    }
    
    /**
     * Sets (as xml) the "flvigente" element
     */
    public void xsetFlvigente(org.apache.xmlbeans.XmlShort flvigente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(FLVIGENTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(FLVIGENTE$8);
            }
            target.set(flvigente);
        }
    }
    
    /**
     * Gets the "nmmoeda" element
     */
    public java.lang.String getNmmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOEDA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmmoeda" element
     */
    public org.apache.xmlbeans.XmlString xgetNmmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOEDA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmmoeda" element
     */
    public boolean isSetNmmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMMOEDA$10) != 0;
        }
    }
    
    /**
     * Sets the "nmmoeda" element
     */
    public void setNmmoeda(java.lang.String nmmoeda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOEDA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMMOEDA$10);
            }
            target.setStringValue(nmmoeda);
        }
    }
    
    /**
     * Sets (as xml) the "nmmoeda" element
     */
    public void xsetNmmoeda(org.apache.xmlbeans.XmlString nmmoeda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOEDA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMMOEDA$10);
            }
            target.set(nmmoeda);
        }
    }
    
    /**
     * Unsets the "nmmoeda" element
     */
    public void unsetNmmoeda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMMOEDA$10, 0);
        }
    }
    
    /**
     * Gets the "nmmoedaplural" element
     */
    public java.lang.String getNmmoedaplural()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOEDAPLURAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmmoedaplural" element
     */
    public org.apache.xmlbeans.XmlString xgetNmmoedaplural()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOEDAPLURAL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmmoedaplural" element
     */
    public boolean isSetNmmoedaplural()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMMOEDAPLURAL$12) != 0;
        }
    }
    
    /**
     * Sets the "nmmoedaplural" element
     */
    public void setNmmoedaplural(java.lang.String nmmoedaplural)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOEDAPLURAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMMOEDAPLURAL$12);
            }
            target.setStringValue(nmmoedaplural);
        }
    }
    
    /**
     * Sets (as xml) the "nmmoedaplural" element
     */
    public void xsetNmmoedaplural(org.apache.xmlbeans.XmlString nmmoedaplural)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOEDAPLURAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMMOEDAPLURAL$12);
            }
            target.set(nmmoedaplural);
        }
    }
    
    /**
     * Unsets the "nmmoedaplural" element
     */
    public void unsetNmmoedaplural()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMMOEDAPLURAL$12, 0);
        }
    }
}
