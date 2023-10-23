/*
 * XML Type:  situacaoTitulo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.SituacaoTitulo
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML situacaoTitulo(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class SituacaoTituloImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.SituacaoTitulo
{
    private static final long serialVersionUID = 1L;
    
    public SituacaoTituloImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSITUACAOTITULO$0 = 
        new javax.xml.namespace.QName("", "cdsituacaotitulo");
    private static final javax.xml.namespace.QName NMSITUACAOTITULO$2 = 
        new javax.xml.namespace.QName("", "nmsituacaotitulo");
    
    
    /**
     * Gets the "cdsituacaotitulo" element
     */
    public short getCdsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSITUACAOTITULO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdsituacaotitulo" element
     */
    public org.apache.xmlbeans.XmlShort xgetCdsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDSITUACAOTITULO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cdsituacaotitulo" element
     */
    public boolean isSetCdsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSITUACAOTITULO$0) != 0;
        }
    }
    
    /**
     * Sets the "cdsituacaotitulo" element
     */
    public void setCdsituacaotitulo(short cdsituacaotitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSITUACAOTITULO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSITUACAOTITULO$0);
            }
            target.setShortValue(cdsituacaotitulo);
        }
    }
    
    /**
     * Sets (as xml) the "cdsituacaotitulo" element
     */
    public void xsetCdsituacaotitulo(org.apache.xmlbeans.XmlShort cdsituacaotitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(CDSITUACAOTITULO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(CDSITUACAOTITULO$0);
            }
            target.set(cdsituacaotitulo);
        }
    }
    
    /**
     * Unsets the "cdsituacaotitulo" element
     */
    public void unsetCdsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSITUACAOTITULO$0, 0);
        }
    }
    
    /**
     * Gets the "nmsituacaotitulo" element
     */
    public java.lang.String getNmsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMSITUACAOTITULO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nmsituacaotitulo" element
     */
    public org.apache.xmlbeans.XmlString xgetNmsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMSITUACAOTITULO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nmsituacaotitulo" element
     */
    public boolean isSetNmsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NMSITUACAOTITULO$2) != 0;
        }
    }
    
    /**
     * Sets the "nmsituacaotitulo" element
     */
    public void setNmsituacaotitulo(java.lang.String nmsituacaotitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMSITUACAOTITULO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMSITUACAOTITULO$2);
            }
            target.setStringValue(nmsituacaotitulo);
        }
    }
    
    /**
     * Sets (as xml) the "nmsituacaotitulo" element
     */
    public void xsetNmsituacaotitulo(org.apache.xmlbeans.XmlString nmsituacaotitulo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NMSITUACAOTITULO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NMSITUACAOTITULO$2);
            }
            target.set(nmsituacaotitulo);
        }
    }
    
    /**
     * Unsets the "nmsituacaotitulo" element
     */
    public void unsetNmsituacaotitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NMSITUACAOTITULO$2, 0);
        }
    }
}
