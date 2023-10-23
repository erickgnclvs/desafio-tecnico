/*
 * XML Type:  tipoEmail
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.TipoEmail
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML tipoEmail(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class TipoEmailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.TipoEmail
{
    private static final long serialVersionUID = 1L;
    
    public TipoEmailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDTIPOEMAIL$0 = 
        new javax.xml.namespace.QName("", "cdtipoemail");
    private static final javax.xml.namespace.QName DETIPOEMAIL$2 = 
        new javax.xml.namespace.QName("", "detipoemail");
    
    
    /**
     * Gets the "cdtipoemail" element
     */
    public short getCdtipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOEMAIL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdtipoemail" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdtipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOEMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdtipoemail" element
     */
    public boolean isSetCdtipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDTIPOEMAIL$0) != 0;
        }
    }
    
    /**
     * Sets the "cdtipoemail" element
     */
    public void setCdtipoemail(short cdtipoemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDTIPOEMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDTIPOEMAIL$0);
            }
            target.setShortValue(cdtipoemail);
        }
    }
    
    /**
     * Sets (as xml) the "cdtipoemail" element
     */
    public void xsetCdtipoemail(org.apache.xmlbeans.XmlShort cdtipoemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDTIPOEMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDTIPOEMAIL$0);
            }
            target.set(cdtipoemail);
        }
    }
    
    /**
     * Unsets the "cdtipoemail" element
     */
    public void unsetCdtipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDTIPOEMAIL$0, 0);
        }
    }
    
    /**
     * Gets the "detipoemail" element
     */
    public java.lang.String getDetipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETIPOEMAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detipoemail" element
     */
    public org.apache.xmlbeans.XmlString xgetDetipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETIPOEMAIL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "detipoemail" element
     */
    public boolean isSetDetipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETIPOEMAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "detipoemail" element
     */
    public void setDetipoemail(java.lang.String detipoemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETIPOEMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETIPOEMAIL$2);
            }
            target.setStringValue(detipoemail);
        }
    }
    
    /**
     * Sets (as xml) the "detipoemail" element
     */
    public void xsetDetipoemail(org.apache.xmlbeans.XmlString detipoemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETIPOEMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETIPOEMAIL$2);
            }
            target.set(detipoemail);
        }
    }
    
    /**
     * Unsets the "detipoemail" element
     */
    public void unsetDetipoemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETIPOEMAIL$2, 0);
        }
    }
}
