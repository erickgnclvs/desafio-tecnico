/*
 * XML Type:  juizPaz
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.JuizPaz
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML juizPaz(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class JuizPazImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.JuizPaz
{
    private static final long serialVersionUID = 1L;
    
    public JuizPazImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDCOMARCA$0 = 
        new javax.xml.namespace.QName("", "cdcomarca");
    private static final javax.xml.namespace.QName CDJUIZDEPAZ$2 = 
        new javax.xml.namespace.QName("", "cdjuizdepaz");
    private static final javax.xml.namespace.QName CDTPJUIZDEPAZ$4 = 
        new javax.xml.namespace.QName("", "cdtpjuizdepaz");
    private static final javax.xml.namespace.QName CPF$6 = 
        new javax.xml.namespace.QName("", "cpf");
    private static final javax.xml.namespace.QName DETPJUIZDEPAZ$8 = 
        new javax.xml.namespace.QName("", "detpjuizdepaz");
    private static final javax.xml.namespace.QName DTFIMEXERCICIO$10 = 
        new javax.xml.namespace.QName("", "dtfimexercicio");
    private static final javax.xml.namespace.QName DTINIEXERCICIO$12 = 
        new javax.xml.namespace.QName("", "dtiniexercicio");
    private static final javax.xml.namespace.QName NOME$14 = 
        new javax.xml.namespace.QName("", "nome");
    
    
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
     * Gets the "cdjuizdepaz" element
     */
    public long getCdjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDJUIZDEPAZ$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdjuizdepaz" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDJUIZDEPAZ$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdjuizdepaz" element
     */
    public boolean isSetCdjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDJUIZDEPAZ$2) != 0;
        }
    }
    
    /**
     * Sets the "cdjuizdepaz" element
     */
    public void setCdjuizdepaz(long cdjuizdepaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDJUIZDEPAZ$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDJUIZDEPAZ$2);
            }
            target.setLongValue(cdjuizdepaz);
        }
    }
    
    /**
     * Sets (as xml) the "cdjuizdepaz" element
     */
    public void xsetCdjuizdepaz(org.apache.xmlbeans.XmlLong cdjuizdepaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDJUIZDEPAZ$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDJUIZDEPAZ$2);
            }
            target.set(cdjuizdepaz);
        }
    }
    
    /**
     * Unsets the "cdjuizdepaz" element
     */
    public void unsetCdjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDJUIZDEPAZ$2, 0);
        }
    }
    
    /**
     * Gets the "cdtpjuizdepaz" element
     */
    public int getCdtpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTPJUIZDEPAZ$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtpjuizdepaz" element
     */
    public org.apache.xmlbeans.XmlInt xgetCdtpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTPJUIZDEPAZ$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtpjuizdepaz" element
     */
    public boolean isSetCdtpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTPJUIZDEPAZ$4) != 0;
        }
    }
    
    /**
     * Sets the "cdtpjuizdepaz" element
     */
    public void setCdtpjuizdepaz(int cdtpjuizdepaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTPJUIZDEPAZ$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTPJUIZDEPAZ$4);
            }
            target.setIntValue(cdtpjuizdepaz);
        }
    }
    
    /**
     * Sets (as xml) the "cdtpjuizdepaz" element
     */
    public void xsetCdtpjuizdepaz(org.apache.xmlbeans.XmlInt cdtpjuizdepaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CDTPJUIZDEPAZ$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CDTPJUIZDEPAZ$4);
            }
            target.set(cdtpjuizdepaz);
        }
    }
    
    /**
     * Unsets the "cdtpjuizdepaz" element
     */
    public void unsetCdtpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTPJUIZDEPAZ$4, 0);
        }
    }
    
    /**
     * Gets the "cpf" element
     */
    public java.lang.String getCpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CPF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cpf" element
     */
    public org.apache.xmlbeans.XmlString xgetCpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CPF$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "cpf" element
     */
    public boolean isSetCpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CPF$6) != 0;
        }
    }
    
    /**
     * Sets the "cpf" element
     */
    public void setCpf(java.lang.String cpf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CPF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CPF$6);
            }
            target.setStringValue(cpf);
        }
    }
    
    /**
     * Sets (as xml) the "cpf" element
     */
    public void xsetCpf(org.apache.xmlbeans.XmlString cpf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CPF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CPF$6);
            }
            target.set(cpf);
        }
    }
    
    /**
     * Unsets the "cpf" element
     */
    public void unsetCpf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CPF$6, 0);
        }
    }
    
    /**
     * Gets the "detpjuizdepaz" element
     */
    public java.lang.String getDetpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPJUIZDEPAZ$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detpjuizdepaz" element
     */
    public org.apache.xmlbeans.XmlString xgetDetpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPJUIZDEPAZ$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "detpjuizdepaz" element
     */
    public boolean isSetDetpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETPJUIZDEPAZ$8) != 0;
        }
    }
    
    /**
     * Sets the "detpjuizdepaz" element
     */
    public void setDetpjuizdepaz(java.lang.String detpjuizdepaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETPJUIZDEPAZ$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETPJUIZDEPAZ$8);
            }
            target.setStringValue(detpjuizdepaz);
        }
    }
    
    /**
     * Sets (as xml) the "detpjuizdepaz" element
     */
    public void xsetDetpjuizdepaz(org.apache.xmlbeans.XmlString detpjuizdepaz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETPJUIZDEPAZ$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETPJUIZDEPAZ$8);
            }
            target.set(detpjuizdepaz);
        }
    }
    
    /**
     * Unsets the "detpjuizdepaz" element
     */
    public void unsetDetpjuizdepaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETPJUIZDEPAZ$8, 0);
        }
    }
    
    /**
     * Gets the "dtfimexercicio" element
     */
    public java.util.Calendar getDtfimexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTFIMEXERCICIO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtfimexercicio" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtfimexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTFIMEXERCICIO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtfimexercicio" element
     */
    public boolean isSetDtfimexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTFIMEXERCICIO$10) != 0;
        }
    }
    
    /**
     * Sets the "dtfimexercicio" element
     */
    public void setDtfimexercicio(java.util.Calendar dtfimexercicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTFIMEXERCICIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTFIMEXERCICIO$10);
            }
            target.setCalendarValue(dtfimexercicio);
        }
    }
    
    /**
     * Sets (as xml) the "dtfimexercicio" element
     */
    public void xsetDtfimexercicio(org.apache.xmlbeans.XmlDateTime dtfimexercicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTFIMEXERCICIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTFIMEXERCICIO$10);
            }
            target.set(dtfimexercicio);
        }
    }
    
    /**
     * Unsets the "dtfimexercicio" element
     */
    public void unsetDtfimexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTFIMEXERCICIO$10, 0);
        }
    }
    
    /**
     * Gets the "dtiniexercicio" element
     */
    public java.util.Calendar getDtiniexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTINIEXERCICIO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtiniexercicio" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtiniexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTINIEXERCICIO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dtiniexercicio" element
     */
    public boolean isSetDtiniexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTINIEXERCICIO$12) != 0;
        }
    }
    
    /**
     * Sets the "dtiniexercicio" element
     */
    public void setDtiniexercicio(java.util.Calendar dtiniexercicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTINIEXERCICIO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTINIEXERCICIO$12);
            }
            target.setCalendarValue(dtiniexercicio);
        }
    }
    
    /**
     * Sets (as xml) the "dtiniexercicio" element
     */
    public void xsetDtiniexercicio(org.apache.xmlbeans.XmlDateTime dtiniexercicio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTINIEXERCICIO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTINIEXERCICIO$12);
            }
            target.set(dtiniexercicio);
        }
    }
    
    /**
     * Unsets the "dtiniexercicio" element
     */
    public void unsetDtiniexercicio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTINIEXERCICIO$12, 0);
        }
    }
    
    /**
     * Gets the "nome" element
     */
    public java.lang.String getNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nome" element
     */
    public org.apache.xmlbeans.XmlString xgetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "nome" element
     */
    public boolean isSetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOME$14) != 0;
        }
    }
    
    /**
     * Sets the "nome" element
     */
    public void setNome(java.lang.String nome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOME$14);
            }
            target.setStringValue(nome);
        }
    }
    
    /**
     * Sets (as xml) the "nome" element
     */
    public void xsetNome(org.apache.xmlbeans.XmlString nome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOME$14);
            }
            target.set(nome);
        }
    }
    
    /**
     * Unsets the "nome" element
     */
    public void unsetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOME$14, 0);
        }
    }
}
