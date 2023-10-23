/*
 * XML Type:  motivoCancelProtesto
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.MotivoCancelProtesto
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML motivoCancelProtesto(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class MotivoCancelProtestoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.MotivoCancelProtesto
{
    private static final long serialVersionUID = 1L;
    
    public MotivoCancelProtestoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDMOTIVOCANCELPROTESTO$0 = 
        new javax.xml.namespace.QName("", "cdmotivocancelprotesto");
    private static final javax.xml.namespace.QName NMMOTIVOCANCELPROTESTO$2 = 
        new javax.xml.namespace.QName("", "nmmotivocancelprotesto");
    
    
    /**
     * Gets the "cdmotivocancelprotesto" element
     */
    public long getCdmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMOTIVOCANCELPROTESTO$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdmotivocancelprotesto" element
     */
    public org.apache.xmlbeans.XmlLong xgetCdmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDMOTIVOCANCELPROTESTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdmotivocancelprotesto" element
     */
    public boolean isSetCdmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDMOTIVOCANCELPROTESTO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdmotivocancelprotesto" element
     */
    public void setCdmotivocancelprotesto(long cdmotivocancelprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDMOTIVOCANCELPROTESTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDMOTIVOCANCELPROTESTO$0);
            }
            target.setLongValue(cdmotivocancelprotesto);
        }
    }
    
    /**
     * Sets (as xml) the "cdmotivocancelprotesto" element
     */
    public void xsetCdmotivocancelprotesto(org.apache.xmlbeans.XmlLong cdmotivocancelprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CDMOTIVOCANCELPROTESTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CDMOTIVOCANCELPROTESTO$0);
            }
            target.set(cdmotivocancelprotesto);
        }
    }
    
    /**
     * Unsets the "cdmotivocancelprotesto" element
     */
    public void unsetCdmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDMOTIVOCANCELPROTESTO$0, 0);
        }
    }
    
    /**
     * Gets the "nmmotivocancelprotesto" element
     */
    public java.lang.String getNmmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOTIVOCANCELPROTESTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmmotivocancelprotesto" element
     */
    public org.apache.xmlbeans.XmlString xgetNmmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOTIVOCANCELPROTESTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmmotivocancelprotesto" element
     */
    public boolean isSetNmmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMMOTIVOCANCELPROTESTO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmmotivocancelprotesto" element
     */
    public void setNmmotivocancelprotesto(java.lang.String nmmotivocancelprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMMOTIVOCANCELPROTESTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMMOTIVOCANCELPROTESTO$2);
            }
            target.setStringValue(nmmotivocancelprotesto);
        }
    }
    
    /**
     * Sets (as xml) the "nmmotivocancelprotesto" element
     */
    public void xsetNmmotivocancelprotesto(org.apache.xmlbeans.XmlString nmmotivocancelprotesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMMOTIVOCANCELPROTESTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMMOTIVOCANCELPROTESTO$2);
            }
            target.set(nmmotivocancelprotesto);
        }
    }
    
    /**
     * Unsets the "nmmotivocancelprotesto" element
     */
    public void unsetNmmotivocancelprotesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMMOTIVOCANCELPROTESTO$2, 0);
        }
    }
}
