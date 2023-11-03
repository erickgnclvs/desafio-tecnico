/*
 * XML Type:  cartorioLivro
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.CartorioLivro
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML cartorioLivro(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class CartorioLivroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.CartorioLivro
{
    private static final long serialVersionUID = 1L;
    
    public CartorioLivroImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDCARTORIOLIVRO$0 = 
        new javax.xml.namespace.QName("", "cdcartoriolivro");
    private static final javax.xml.namespace.QName CDTIPOFORMALIVRO$2 = 
        new javax.xml.namespace.QName("", "cdtipoformalivro");
    private static final javax.xml.namespace.QName CDTIPOLIVRO$4 = 
        new javax.xml.namespace.QName("", "cdtipolivro");
    private static final javax.xml.namespace.QName DTABERTURA$6 = 
        new javax.xml.namespace.QName("", "dtabertura");
    private static final javax.xml.namespace.QName DTENCERRAMENTO$8 = 
        new javax.xml.namespace.QName("", "dtencerramento");
    private static final javax.xml.namespace.QName NMTIPOFORMALIVRO$10 = 
        new javax.xml.namespace.QName("", "nmtipoformalivro");
    private static final javax.xml.namespace.QName NMTIPOLIVRO$12 = 
        new javax.xml.namespace.QName("", "nmtipolivro");
    private static final javax.xml.namespace.QName NUCARTORIO$14 = 
        new javax.xml.namespace.QName("", "nucartorio");
    private static final javax.xml.namespace.QName NUCARTORIORESPONSAVEL$16 = 
        new javax.xml.namespace.QName("", "nucartorioresponsavel");
    private static final javax.xml.namespace.QName SEQLIVRO$18 = 
        new javax.xml.namespace.QName("", "seqlivro");
    
    
    /**
     * Gets the "cdcartoriolivro" element
     */
    public long getCdcartoriolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDCARTORIOLIVRO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdcartoriolivro" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdcartoriolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDCARTORIOLIVRO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdcartoriolivro" element
     */
    public boolean isSetCdcartoriolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDCARTORIOLIVRO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdcartoriolivro" element
     */
    public void setCdcartoriolivro(long cdcartoriolivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDCARTORIOLIVRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDCARTORIOLIVRO$0);
            }
            target.setLongValue(cdcartoriolivro);
        }
    }
    
    /**
     * Sets (as xml) the "cdcartoriolivro" element
     */
    public void xsetCdcartoriolivro(org.apache.xmlbeans.XmlLong cdcartoriolivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDCARTORIOLIVRO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDCARTORIOLIVRO$0);
            }
            target.set(cdcartoriolivro);
        }
    }
    
    /**
     * Unsets the "cdcartoriolivro" element
     */
    public void unsetCdcartoriolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDCARTORIOLIVRO$0, 0);
        }
    }
    
    /**
     * Gets the "cdtipoformalivro" element
     */
    public int getCdtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOFORMALIVRO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipoformalivro" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTIPOFORMALIVRO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipoformalivro" element
     */
    public boolean isSetCdtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOFORMALIVRO$2) != 0;
        }
    }
    
    /**
     * Sets the "cdtipoformalivro" element
     */
    public void setCdtipoformalivro(int cdtipoformalivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOFORMALIVRO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOFORMALIVRO$2);
            }
            target.setIntValue(cdtipoformalivro);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipoformalivro" element
     */
    public void xsetCdtipoformalivro(org.apache.xmlbeans.XmlInt cdtipoformalivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTIPOFORMALIVRO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDTIPOFORMALIVRO$2);
            }
            target.set(cdtipoformalivro);
        }
    }
    
    /**
     * Unsets the "cdtipoformalivro" element
     */
    public void unsetCdtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOFORMALIVRO$2, 0);
        }
    }
    
    /**
     * Gets the "cdtipolivro" element
     */
    public int getCdtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOLIVRO$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipolivro" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTIPOLIVRO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipolivro" element
     */
    public boolean isSetCdtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOLIVRO$4) != 0;
        }
    }
    
    /**
     * Sets the "cdtipolivro" element
     */
    public void setCdtipolivro(int cdtipolivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOLIVRO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOLIVRO$4);
            }
            target.setIntValue(cdtipolivro);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipolivro" element
     */
    public void xsetCdtipolivro(org.apache.xmlbeans.XmlInt cdtipolivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTIPOLIVRO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDTIPOLIVRO$4);
            }
            target.set(cdtipolivro);
        }
    }
    
    /**
     * Unsets the "cdtipolivro" element
     */
    public void unsetCdtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOLIVRO$4, 0);
        }
    }
    
    /**
     * Gets the "dtabertura" element
     */
    public java.util.Calendar getDtabertura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTABERTURA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtabertura" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtabertura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTABERTURA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtabertura" element
     */
    public boolean isSetDtabertura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTABERTURA$6) != 0;
        }
    }
    
    /**
     * Sets the "dtabertura" element
     */
    public void setDtabertura(java.util.Calendar dtabertura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTABERTURA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTABERTURA$6);
            }
            target.setCalendarValue(dtabertura);
        }
    }
    
    /**
     * Sets (as xml) the "dtabertura" element
     */
    public void xsetDtabertura(org.apache.xmlbeans.XmlDateTime dtabertura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTABERTURA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTABERTURA$6);
            }
            target.set(dtabertura);
        }
    }
    
    /**
     * Unsets the "dtabertura" element
     */
    public void unsetDtabertura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTABERTURA$6, 0);
        }
    }
    
    /**
     * Gets the "dtencerramento" element
     */
    public java.util.Calendar getDtencerramento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTENCERRAMENTO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtencerramento" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtencerramento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTENCERRAMENTO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtencerramento" element
     */
    public boolean isSetDtencerramento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTENCERRAMENTO$8) != 0;
        }
    }
    
    /**
     * Sets the "dtencerramento" element
     */
    public void setDtencerramento(java.util.Calendar dtencerramento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTENCERRAMENTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTENCERRAMENTO$8);
            }
            target.setCalendarValue(dtencerramento);
        }
    }
    
    /**
     * Sets (as xml) the "dtencerramento" element
     */
    public void xsetDtencerramento(org.apache.xmlbeans.XmlDateTime dtencerramento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTENCERRAMENTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTENCERRAMENTO$8);
            }
            target.set(dtencerramento);
        }
    }
    
    /**
     * Unsets the "dtencerramento" element
     */
    public void unsetDtencerramento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTENCERRAMENTO$8, 0);
        }
    }
    
    /**
     * Gets the "nmtipoformalivro" element
     */
    public java.lang.String getNmtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOFORMALIVRO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipoformalivro" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOFORMALIVRO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipoformalivro" element
     */
    public boolean isSetNmtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOFORMALIVRO$10) != 0;
        }
    }
    
    /**
     * Sets the "nmtipoformalivro" element
     */
    public void setNmtipoformalivro(java.lang.String nmtipoformalivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOFORMALIVRO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOFORMALIVRO$10);
            }
            target.setStringValue(nmtipoformalivro);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipoformalivro" element
     */
    public void xsetNmtipoformalivro(org.apache.xmlbeans.XmlString nmtipoformalivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOFORMALIVRO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOFORMALIVRO$10);
            }
            target.set(nmtipoformalivro);
        }
    }
    
    /**
     * Unsets the "nmtipoformalivro" element
     */
    public void unsetNmtipoformalivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOFORMALIVRO$10, 0);
        }
    }
    
    /**
     * Gets the "nmtipolivro" element
     */
    public java.lang.String getNmtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOLIVRO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtipolivro" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOLIVRO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtipolivro" element
     */
    public boolean isSetNmtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTIPOLIVRO$12) != 0;
        }
    }
    
    /**
     * Sets the "nmtipolivro" element
     */
    public void setNmtipolivro(java.lang.String nmtipolivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTIPOLIVRO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTIPOLIVRO$12);
            }
            target.setStringValue(nmtipolivro);
        }
    }
    
    /**
     * Sets (as xml) the "nmtipolivro" element
     */
    public void xsetNmtipolivro(org.apache.xmlbeans.XmlString nmtipolivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTIPOLIVRO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTIPOLIVRO$12);
            }
            target.set(nmtipolivro);
        }
    }
    
    /**
     * Unsets the "nmtipolivro" element
     */
    public void unsetNmtipolivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTIPOLIVRO$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCARTORIO$14, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUCARTORIO$14, 0);
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
            return get_store().count_elements(NUCARTORIO$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCARTORIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUCARTORIO$14);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUCARTORIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUCARTORIO$14);
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
            get_store().remove_element(NUCARTORIO$14, 0);
        }
    }
    
    /**
     * Gets the "nucartorioresponsavel" element
     */
    public int getNucartorioresponsavel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCARTORIORESPONSAVEL$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "nucartorioresponsavel" element
     */
    public org.apache.xmlbeans.XmlInt xgetNucartorioresponsavel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUCARTORIORESPONSAVEL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "nucartorioresponsavel" element
     */
    public boolean isSetNucartorioresponsavel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUCARTORIORESPONSAVEL$16) != 0;
        }
    }
    
    /**
     * Sets the "nucartorioresponsavel" element
     */
    public void setNucartorioresponsavel(int nucartorioresponsavel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCARTORIORESPONSAVEL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUCARTORIORESPONSAVEL$16);
            }
            target.setIntValue(nucartorioresponsavel);
        }
    }
    
    /**
     * Sets (as xml) the "nucartorioresponsavel" element
     */
    public void xsetNucartorioresponsavel(org.apache.xmlbeans.XmlInt nucartorioresponsavel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUCARTORIORESPONSAVEL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUCARTORIORESPONSAVEL$16);
            }
            target.set(nucartorioresponsavel);
        }
    }
    
    /**
     * Unsets the "nucartorioresponsavel" element
     */
    public void unsetNucartorioresponsavel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUCARTORIORESPONSAVEL$16, 0);
        }
    }
    
    /**
     * Gets the "seqlivro" element
     */
    public java.lang.String getSeqlivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQLIVRO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "seqlivro" element
     */
    public org.apache.xmlbeans.XmlString xgetSeqlivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQLIVRO$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "seqlivro" element
     */
    public boolean isSetSeqlivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQLIVRO$18) != 0;
        }
    }
    
    /**
     * Sets the "seqlivro" element
     */
    public void setSeqlivro(java.lang.String seqlivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQLIVRO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQLIVRO$18);
            }
            target.setStringValue(seqlivro);
        }
    }
    
    /**
     * Sets (as xml) the "seqlivro" element
     */
    public void xsetSeqlivro(org.apache.xmlbeans.XmlString seqlivro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQLIVRO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEQLIVRO$18);
            }
            target.set(seqlivro);
        }
    }
    
    /**
     * Unsets the "seqlivro" element
     */
    public void unsetSeqlivro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQLIVRO$18, 0);
        }
    }
}
