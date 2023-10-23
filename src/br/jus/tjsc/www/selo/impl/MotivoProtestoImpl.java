/*
 * XML Type:  motivoProtesto
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.MotivoProtesto
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML motivoProtesto(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class MotivoProtestoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.MotivoProtesto
{
    private static final long serialVersionUID = 1L;
    
    public MotivoProtestoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDMOTIVOPROTESTO$0 = 
        new javax.xml.namespace.QName("", "cdmotivoprotesto");
    private static final javax.xml.namespace.QName NMMOTIVOPROTESTO$2 = 
        new javax.xml.namespace.QName("", "nmmotivoprotesto");
    
    
    /**
     * Gets the "cdmotivoprotesto" element
     */
    public long getCdmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMOTIVOPROTESTO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdmotivoprotesto" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDMOTIVOPROTESTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdmotivoprotesto" element
     */
    public boolean isSetCdmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDMOTIVOPROTESTO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdmotivoprotesto" element
     */
    public void setCdmotivoprotesto(long cdmotivoprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMOTIVOPROTESTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDMOTIVOPROTESTO$0);
            }
            target.setLongValue(cdmotivoprotesto);
        }
    }
    
    /**
     * Sets (as xml) the "cdmotivoprotesto" element
     */
    public void xsetCdmotivoprotesto(org.apache.xmlbeans.XmlLong cdmotivoprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDMOTIVOPROTESTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDMOTIVOPROTESTO$0);
            }
            target.set(cdmotivoprotesto);
        }
    }
    
    /**
     * Unsets the "cdmotivoprotesto" element
     */
    public void unsetCdmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDMOTIVOPROTESTO$0, 0);
        }
    }
    
    /**
     * Gets the "nmmotivoprotesto" element
     */
    public java.lang.String getNmmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOTIVOPROTESTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmmotivoprotesto" element
     */
    public org.apache.xmlbeans.XmlString xgetNmmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOTIVOPROTESTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmmotivoprotesto" element
     */
    public boolean isSetNmmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMMOTIVOPROTESTO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmmotivoprotesto" element
     */
    public void setNmmotivoprotesto(java.lang.String nmmotivoprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOTIVOPROTESTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMMOTIVOPROTESTO$2);
            }
            target.setStringValue(nmmotivoprotesto);
        }
    }
    
    /**
     * Sets (as xml) the "nmmotivoprotesto" element
     */
    public void xsetNmmotivoprotesto(org.apache.xmlbeans.XmlString nmmotivoprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOTIVOPROTESTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMMOTIVOPROTESTO$2);
            }
            target.set(nmmotivoprotesto);
        }
    }
    
    /**
     * Unsets the "nmmotivoprotesto" element
     */
    public void unsetNmmotivoprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMMOTIVOPROTESTO$2, 0);
        }
    }
}
