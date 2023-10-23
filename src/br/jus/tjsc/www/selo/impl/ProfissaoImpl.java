/*
 * XML Type:  profissao
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Profissao
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML profissao(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class ProfissaoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Profissao
{
    private static final long serialVersionUID = 1L;
    
    public ProfissaoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDPROFISSAO$0 = 
        new javax.xml.namespace.QName("", "cdprofissao");
    private static final javax.xml.namespace.QName DEPROFISSAO$2 = 
        new javax.xml.namespace.QName("", "deprofissao");
    
    
    /**
     * Gets the "cdprofissao" element
     */
    public short getCdprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDPROFISSAO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdprofissao" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDPROFISSAO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdprofissao" element
     */
    public boolean isSetCdprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDPROFISSAO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdprofissao" element
     */
    public void setCdprofissao(short cdprofissao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDPROFISSAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDPROFISSAO$0);
            }
            target.setShortValue(cdprofissao);
        }
    }
    
    /**
     * Sets (as xml) the "cdprofissao" element
     */
    public void xsetCdprofissao(org.apache.xmlbeans.XmlShort cdprofissao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDPROFISSAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDPROFISSAO$0);
            }
            target.set(cdprofissao);
        }
    }
    
    /**
     * Unsets the "cdprofissao" element
     */
    public void unsetCdprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDPROFISSAO$0, 0);
        }
    }
    
    /**
     * Gets the "deprofissao" element
     */
    public java.lang.String getDeprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPROFISSAO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deprofissao" element
     */
    public org.apache.xmlbeans.XmlString xgetDeprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPROFISSAO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deprofissao" element
     */
    public boolean isSetDeprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPROFISSAO$2) != 0;
        }
    }
    
    /**
     * Sets the "deprofissao" element
     */
    public void setDeprofissao(java.lang.String deprofissao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPROFISSAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPROFISSAO$2);
            }
            target.setStringValue(deprofissao);
        }
    }
    
    /**
     * Sets (as xml) the "deprofissao" element
     */
    public void xsetDeprofissao(org.apache.xmlbeans.XmlString deprofissao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPROFISSAO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPROFISSAO$2);
            }
            target.set(deprofissao);
        }
    }
    
    /**
     * Unsets the "deprofissao" element
     */
    public void unsetDeprofissao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPROFISSAO$2, 0);
        }
    }
}
