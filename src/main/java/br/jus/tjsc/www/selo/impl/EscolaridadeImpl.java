/*
 * XML Type:  escolaridade
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Escolaridade
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML escolaridade(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class EscolaridadeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.Escolaridade
{
    private static final long serialVersionUID = 1L;
    
    public EscolaridadeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDESCOLARIDADE$0 = 
        new javax.xml.namespace.QName("", "cdescolaridade");
    private static final javax.xml.namespace.QName DEESCOLARIDADE$2 = 
        new javax.xml.namespace.QName("", "deescolaridade");
    
    
    /**
     * Gets the "cdescolaridade" element
     */
    public short getCdescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESCOLARIDADE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdescolaridade" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDESCOLARIDADE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdescolaridade" element
     */
    public boolean isSetCdescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDESCOLARIDADE$0) != 0;
        }
    }
    
    /**
     * Sets the "cdescolaridade" element
     */
    public void setCdescolaridade(short cdescolaridade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDESCOLARIDADE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDESCOLARIDADE$0);
            }
            target.setShortValue(cdescolaridade);
        }
    }
    
    /**
     * Sets (as xml) the "cdescolaridade" element
     */
    public void xsetCdescolaridade(org.apache.xmlbeans.XmlShort cdescolaridade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDESCOLARIDADE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDESCOLARIDADE$0);
            }
            target.set(cdescolaridade);
        }
    }
    
    /**
     * Unsets the "cdescolaridade" element
     */
    public void unsetCdescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDESCOLARIDADE$0, 0);
        }
    }
    
    /**
     * Gets the "deescolaridade" element
     */
    public java.lang.String getDeescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESCOLARIDADE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deescolaridade" element
     */
    public org.apache.xmlbeans.XmlString xgetDeescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESCOLARIDADE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deescolaridade" element
     */
    public boolean isSetDeescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEESCOLARIDADE$2) != 0;
        }
    }
    
    /**
     * Sets the "deescolaridade" element
     */
    public void setDeescolaridade(java.lang.String deescolaridade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEESCOLARIDADE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEESCOLARIDADE$2);
            }
            target.setStringValue(deescolaridade);
        }
    }
    
    /**
     * Sets (as xml) the "deescolaridade" element
     */
    public void xsetDeescolaridade(org.apache.xmlbeans.XmlString deescolaridade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEESCOLARIDADE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEESCOLARIDADE$2);
            }
            target.set(deescolaridade);
        }
    }
    
    /**
     * Unsets the "deescolaridade" element
     */
    public void unsetDeescolaridade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEESCOLARIDADE$2, 0);
        }
    }
}
