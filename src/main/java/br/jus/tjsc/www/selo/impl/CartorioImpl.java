/*
 * XML Type:  cartorio
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Cartorio
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML cartorio(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class CartorioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Cartorio
{
    private static final long serialVersionUID = 1L;
    
    public CartorioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDMUNICIPIO$0 = 
        new javax.xml.namespace.QName("", "cdmunicipio");
    private static final javax.xml.namespace.QName DEEMAIL$2 = 
        new javax.xml.namespace.QName("", "deemail");
    private static final javax.xml.namespace.QName DSBAIRRO$4 = 
        new javax.xml.namespace.QName("", "dsbairro");
    private static final javax.xml.namespace.QName DSENDERECO$6 = 
        new javax.xml.namespace.QName("", "dsendereco");
    private static final javax.xml.namespace.QName FLSITUACAO$8 = 
        new javax.xml.namespace.QName("", "flsituacao");
    private static final javax.xml.namespace.QName NMCARTORIO$10 = 
        new javax.xml.namespace.QName("", "nmcartorio");
    private static final javax.xml.namespace.QName NMTITULAR$12 = 
        new javax.xml.namespace.QName("", "nmtitular");
    private static final javax.xml.namespace.QName NUCARTORIO$14 = 
        new javax.xml.namespace.QName("", "nucartorio");
    private static final javax.xml.namespace.QName NUCNPJCPF$16 = 
        new javax.xml.namespace.QName("", "nucnpjcpf");
    private static final javax.xml.namespace.QName NUFONE$18 = 
        new javax.xml.namespace.QName("", "nufone");
    
    
    /**
     * Gets the "cdmunicipio" element
     */
    public java.lang.String getCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMUNICIPIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdmunicipio" element
     */
    public org.apache.xmlbeans.XmlString xgetCdmunicipio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDMUNICIPIO$0, 0);
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
    public void setCdmunicipio(java.lang.String cdmunicipio)
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
            target.setStringValue(cdmunicipio);
        }
    }
    
    /**
     * Sets (as xml) the "cdmunicipio" element
     */
    public void xsetCdmunicipio(org.apache.xmlbeans.XmlString cdmunicipio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDMUNICIPIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CDMUNICIPIO$0);
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
     * Gets the "deemail" element
     */
    public java.lang.String getDeemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEEMAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deemail" element
     */
    public org.apache.xmlbeans.XmlString xgetDeemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEEMAIL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deemail" element
     */
    public boolean isSetDeemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEEMAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "deemail" element
     */
    public void setDeemail(java.lang.String deemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEEMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEEMAIL$2);
            }
            target.setStringValue(deemail);
        }
    }
    
    /**
     * Sets (as xml) the "deemail" element
     */
    public void xsetDeemail(org.apache.xmlbeans.XmlString deemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEEMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEEMAIL$2);
            }
            target.set(deemail);
        }
    }
    
    /**
     * Unsets the "deemail" element
     */
    public void unsetDeemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEEMAIL$2, 0);
        }
    }
    
    /**
     * Gets the "dsbairro" element
     */
    public java.lang.String getDsbairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSBAIRRO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dsbairro" element
     */
    public org.apache.xmlbeans.XmlString xgetDsbairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DSBAIRRO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dsbairro" element
     */
    public boolean isSetDsbairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DSBAIRRO$4) != 0;
        }
    }
    
    /**
     * Sets the "dsbairro" element
     */
    public void setDsbairro(java.lang.String dsbairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSBAIRRO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DSBAIRRO$4);
            }
            target.setStringValue(dsbairro);
        }
    }
    
    /**
     * Sets (as xml) the "dsbairro" element
     */
    public void xsetDsbairro(org.apache.xmlbeans.XmlString dsbairro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DSBAIRRO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DSBAIRRO$4);
            }
            target.set(dsbairro);
        }
    }
    
    /**
     * Unsets the "dsbairro" element
     */
    public void unsetDsbairro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DSBAIRRO$4, 0);
        }
    }
    
    /**
     * Gets the "dsendereco" element
     */
    public java.lang.String getDsendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSENDERECO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dsendereco" element
     */
    public org.apache.xmlbeans.XmlString xgetDsendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DSENDERECO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dsendereco" element
     */
    public boolean isSetDsendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DSENDERECO$6) != 0;
        }
    }
    
    /**
     * Sets the "dsendereco" element
     */
    public void setDsendereco(java.lang.String dsendereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DSENDERECO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DSENDERECO$6);
            }
            target.setStringValue(dsendereco);
        }
    }
    
    /**
     * Sets (as xml) the "dsendereco" element
     */
    public void xsetDsendereco(org.apache.xmlbeans.XmlString dsendereco)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DSENDERECO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DSENDERECO$6);
            }
            target.set(dsendereco);
        }
    }
    
    /**
     * Unsets the "dsendereco" element
     */
    public void unsetDsendereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DSENDERECO$6, 0);
        }
    }
    
    /**
     * Gets the "flsituacao" element
     */
    public int getFlsituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLSITUACAO$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "flsituacao" element
     */
    public org.apache.xmlbeans.XmlInt xgetFlsituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FLSITUACAO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "flsituacao" element
     */
    public boolean isSetFlsituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLSITUACAO$8) != 0;
        }
    }
    
    /**
     * Sets the "flsituacao" element
     */
    public void setFlsituacao(int flsituacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLSITUACAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLSITUACAO$8);
            }
            target.setIntValue(flsituacao);
        }
    }
    
    /**
     * Sets (as xml) the "flsituacao" element
     */
    public void xsetFlsituacao(org.apache.xmlbeans.XmlInt flsituacao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FLSITUACAO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FLSITUACAO$8);
            }
            target.set(flsituacao);
        }
    }
    
    /**
     * Unsets the "flsituacao" element
     */
    public void unsetFlsituacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLSITUACAO$8, 0);
        }
    }
    
    /**
     * Gets the "nmcartorio" element
     */
    public java.lang.String getNmcartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMCARTORIO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmcartorio" element
     */
    public org.apache.xmlbeans.XmlString xgetNmcartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMCARTORIO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmcartorio" element
     */
    public boolean isSetNmcartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMCARTORIO$10) != 0;
        }
    }
    
    /**
     * Sets the "nmcartorio" element
     */
    public void setNmcartorio(java.lang.String nmcartorio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMCARTORIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMCARTORIO$10);
            }
            target.setStringValue(nmcartorio);
        }
    }
    
    /**
     * Sets (as xml) the "nmcartorio" element
     */
    public void xsetNmcartorio(org.apache.xmlbeans.XmlString nmcartorio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMCARTORIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMCARTORIO$10);
            }
            target.set(nmcartorio);
        }
    }
    
    /**
     * Unsets the "nmcartorio" element
     */
    public void unsetNmcartorio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMCARTORIO$10, 0);
        }
    }
    
    /**
     * Gets the "nmtitular" element
     */
    public java.lang.String getNmtitular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTITULAR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmtitular" element
     */
    public org.apache.xmlbeans.XmlString xgetNmtitular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTITULAR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmtitular" element
     */
    public boolean isSetNmtitular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMTITULAR$12) != 0;
        }
    }
    
    /**
     * Sets the "nmtitular" element
     */
    public void setNmtitular(java.lang.String nmtitular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMTITULAR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMTITULAR$12);
            }
            target.setStringValue(nmtitular);
        }
    }
    
    /**
     * Sets (as xml) the "nmtitular" element
     */
    public void xsetNmtitular(org.apache.xmlbeans.XmlString nmtitular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMTITULAR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMTITULAR$12);
            }
            target.set(nmtitular);
        }
    }
    
    /**
     * Unsets the "nmtitular" element
     */
    public void unsetNmtitular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMTITULAR$12, 0);
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
     * Gets the "nucnpjcpf" element
     */
    public long getNucnpjcpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCNPJCPF$16, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "nucnpjcpf" element
     */
    public org.apache.xmlbeans.XmlLong xgetNucnpjcpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUCNPJCPF$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "nucnpjcpf" element
     */
    public boolean isSetNucnpjcpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUCNPJCPF$16) != 0;
        }
    }
    
    /**
     * Sets the "nucnpjcpf" element
     */
    public void setNucnpjcpf(long nucnpjcpf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCNPJCPF$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUCNPJCPF$16);
            }
            target.setLongValue(nucnpjcpf);
        }
    }
    
    /**
     * Sets (as xml) the "nucnpjcpf" element
     */
    public void xsetNucnpjcpf(org.apache.xmlbeans.XmlLong nucnpjcpf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUCNPJCPF$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUCNPJCPF$16);
            }
            target.set(nucnpjcpf);
        }
    }
    
    /**
     * Unsets the "nucnpjcpf" element
     */
    public void unsetNucnpjcpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUCNPJCPF$16, 0);
        }
    }
    
    /**
     * Gets the "nufone" element
     */
    public java.lang.String getNufone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUFONE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nufone" element
     */
    public org.apache.xmlbeans.XmlString xgetNufone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUFONE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "nufone" element
     */
    public boolean isSetNufone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUFONE$18) != 0;
        }
    }
    
    /**
     * Sets the "nufone" element
     */
    public void setNufone(java.lang.String nufone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUFONE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUFONE$18);
            }
            target.setStringValue(nufone);
        }
    }
    
    /**
     * Sets (as xml) the "nufone" element
     */
    public void xsetNufone(org.apache.xmlbeans.XmlString nufone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUFONE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUFONE$18);
            }
            target.set(nufone);
        }
    }
    
    /**
     * Unsets the "nufone" element
     */
    public void unsetNufone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUFONE$18, 0);
        }
    }
}
