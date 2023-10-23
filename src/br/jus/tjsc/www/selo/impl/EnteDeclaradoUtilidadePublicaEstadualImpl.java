/*
 * XML Type:  enteDeclaradoUtilidadePublicaEstadual
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML enteDeclaradoUtilidadePublicaEstadual(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class EnteDeclaradoUtilidadePublicaEstadualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual
{
    private static final long serialVersionUID = 1L;
    
    public EnteDeclaradoUtilidadePublicaEstadualImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDCOMARCA$0 = 
        new javax.xml.namespace.QName("", "cdcomarca");
    private static final javax.xml.namespace.QName CDENTEPUB$2 = 
        new javax.xml.namespace.QName("", "cdentepub");
    private static final javax.xml.namespace.QName DTLEI$4 = 
        new javax.xml.namespace.QName("", "dtLei");
    private static final javax.xml.namespace.QName DTLEIEXTENSO$6 = 
        new javax.xml.namespace.QName("", "dtLeiExtenso");
    private static final javax.xml.namespace.QName LEI$8 = 
        new javax.xml.namespace.QName("", "lei");
    private static final javax.xml.namespace.QName NOMECOMARCA$10 = 
        new javax.xml.namespace.QName("", "nomeComarca");
    private static final javax.xml.namespace.QName NOMECOMARCAENTIDADE$12 = 
        new javax.xml.namespace.QName("", "nomeComarcaEntidade");
    private static final javax.xml.namespace.QName NOMEENTIDADE$14 = 
        new javax.xml.namespace.QName("", "nomeEntidade");
    
    
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
     * Gets the "cdentepub" element
     */
    public long getCdentepub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDENTEPUB$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdentepub" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdentepub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDENTEPUB$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdentepub" element
     */
    public boolean isSetCdentepub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDENTEPUB$2) != 0;
        }
    }
    
    /**
     * Sets the "cdentepub" element
     */
    public void setCdentepub(long cdentepub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDENTEPUB$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDENTEPUB$2);
            }
            target.setLongValue(cdentepub);
        }
    }
    
    /**
     * Sets (as xml) the "cdentepub" element
     */
    public void xsetCdentepub(org.apache.xmlbeans.XmlLong cdentepub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDENTEPUB$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDENTEPUB$2);
            }
            target.set(cdentepub);
        }
    }
    
    /**
     * Unsets the "cdentepub" element
     */
    public void unsetCdentepub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDENTEPUB$2, 0);
        }
    }
    
    /**
     * Gets the "dtLei" element
     */
    public java.lang.String getDtLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTLEI$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtLei" element
     */
    public org.apache.xmlbeans.XmlString xgetDtLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DTLEI$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtLei" element
     */
    public boolean isSetDtLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTLEI$4) != 0;
        }
    }
    
    /**
     * Sets the "dtLei" element
     */
    public void setDtLei(java.lang.String dtLei)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTLEI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTLEI$4);
            }
            target.setStringValue(dtLei);
        }
    }
    
    /**
     * Sets (as xml) the "dtLei" element
     */
    public void xsetDtLei(org.apache.xmlbeans.XmlString dtLei)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DTLEI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DTLEI$4);
            }
            target.set(dtLei);
        }
    }
    
    /**
     * Unsets the "dtLei" element
     */
    public void unsetDtLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTLEI$4, 0);
        }
    }
    
    /**
     * Gets the "dtLeiExtenso" element
     */
    public java.lang.String getDtLeiExtenso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTLEIEXTENSO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtLeiExtenso" element
     */
    public org.apache.xmlbeans.XmlString xgetDtLeiExtenso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DTLEIEXTENSO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtLeiExtenso" element
     */
    public boolean isSetDtLeiExtenso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTLEIEXTENSO$6) != 0;
        }
    }
    
    /**
     * Sets the "dtLeiExtenso" element
     */
    public void setDtLeiExtenso(java.lang.String dtLeiExtenso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTLEIEXTENSO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTLEIEXTENSO$6);
            }
            target.setStringValue(dtLeiExtenso);
        }
    }
    
    /**
     * Sets (as xml) the "dtLeiExtenso" element
     */
    public void xsetDtLeiExtenso(org.apache.xmlbeans.XmlString dtLeiExtenso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DTLEIEXTENSO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DTLEIEXTENSO$6);
            }
            target.set(dtLeiExtenso);
        }
    }
    
    /**
     * Unsets the "dtLeiExtenso" element
     */
    public void unsetDtLeiExtenso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTLEIEXTENSO$6, 0);
        }
    }
    
    /**
     * Gets the "lei" element
     */
    public java.lang.String getLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lei" element
     */
    public org.apache.xmlbeans.XmlString xgetLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEI$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "lei" element
     */
    public boolean isSetLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEI$8) != 0;
        }
    }
    
    /**
     * Sets the "lei" element
     */
    public void setLei(java.lang.String lei)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEI$8);
            }
            target.setStringValue(lei);
        }
    }
    
    /**
     * Sets (as xml) the "lei" element
     */
    public void xsetLei(org.apache.xmlbeans.XmlString lei)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEI$8);
            }
            target.set(lei);
        }
    }
    
    /**
     * Unsets the "lei" element
     */
    public void unsetLei()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEI$8, 0);
        }
    }
    
    /**
     * Gets the "nomeComarca" element
     */
    public java.lang.String getNomeComarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMECOMARCA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nomeComarca" element
     */
    public org.apache.xmlbeans.XmlString xgetNomeComarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMECOMARCA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nomeComarca" element
     */
    public boolean isSetNomeComarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMECOMARCA$10) != 0;
        }
    }
    
    /**
     * Sets the "nomeComarca" element
     */
    public void setNomeComarca(java.lang.String nomeComarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMECOMARCA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMECOMARCA$10);
            }
            target.setStringValue(nomeComarca);
        }
    }
    
    /**
     * Sets (as xml) the "nomeComarca" element
     */
    public void xsetNomeComarca(org.apache.xmlbeans.XmlString nomeComarca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMECOMARCA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMECOMARCA$10);
            }
            target.set(nomeComarca);
        }
    }
    
    /**
     * Unsets the "nomeComarca" element
     */
    public void unsetNomeComarca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMECOMARCA$10, 0);
        }
    }
    
    /**
     * Gets the "nomeComarcaEntidade" element
     */
    public java.lang.String getNomeComarcaEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMECOMARCAENTIDADE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nomeComarcaEntidade" element
     */
    public org.apache.xmlbeans.XmlString xgetNomeComarcaEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMECOMARCAENTIDADE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "nomeComarcaEntidade" element
     */
    public boolean isSetNomeComarcaEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMECOMARCAENTIDADE$12) != 0;
        }
    }
    
    /**
     * Sets the "nomeComarcaEntidade" element
     */
    public void setNomeComarcaEntidade(java.lang.String nomeComarcaEntidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMECOMARCAENTIDADE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMECOMARCAENTIDADE$12);
            }
            target.setStringValue(nomeComarcaEntidade);
        }
    }
    
    /**
     * Sets (as xml) the "nomeComarcaEntidade" element
     */
    public void xsetNomeComarcaEntidade(org.apache.xmlbeans.XmlString nomeComarcaEntidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMECOMARCAENTIDADE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMECOMARCAENTIDADE$12);
            }
            target.set(nomeComarcaEntidade);
        }
    }
    
    /**
     * Unsets the "nomeComarcaEntidade" element
     */
    public void unsetNomeComarcaEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMECOMARCAENTIDADE$12, 0);
        }
    }
    
    /**
     * Gets the "nomeEntidade" element
     */
    public java.lang.String getNomeEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMEENTIDADE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nomeEntidade" element
     */
    public org.apache.xmlbeans.XmlString xgetNomeEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMEENTIDADE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "nomeEntidade" element
     */
    public boolean isSetNomeEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMEENTIDADE$14) != 0;
        }
    }
    
    /**
     * Sets the "nomeEntidade" element
     */
    public void setNomeEntidade(java.lang.String nomeEntidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMEENTIDADE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMEENTIDADE$14);
            }
            target.setStringValue(nomeEntidade);
        }
    }
    
    /**
     * Sets (as xml) the "nomeEntidade" element
     */
    public void xsetNomeEntidade(org.apache.xmlbeans.XmlString nomeEntidade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMEENTIDADE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMEENTIDADE$14);
            }
            target.set(nomeEntidade);
        }
    }
    
    /**
     * Unsets the "nomeEntidade" element
     */
    public void unsetNomeEntidade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMEENTIDADE$14, 0);
        }
    }
}
