/*
 * XML Type:  verificaTransmissaoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.VerificaTransmissaoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML verificaTransmissaoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class VerificaTransmissaoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.VerificaTransmissaoResponse
{
    private static final long serialVersionUID = 1L;
    
    public VerificaTransmissaoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIBOTSRARMAZENADO$0 = 
        new javax.xml.namespace.QName("", "reciboTSRarmazenado");
    
    
    /**
     * Gets the "reciboTSRarmazenado" element
     */
    public byte[] getReciboTSRarmazenado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIBOTSRARMAZENADO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "reciboTSRarmazenado" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetReciboTSRarmazenado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECIBOTSRARMAZENADO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "reciboTSRarmazenado" element
     */
    public boolean isSetReciboTSRarmazenado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIBOTSRARMAZENADO$0) != 0;
        }
    }
    
    /**
     * Sets the "reciboTSRarmazenado" element
     */
    public void setReciboTSRarmazenado(byte[] reciboTSRarmazenado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECIBOTSRARMAZENADO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECIBOTSRARMAZENADO$0);
            }
            target.setByteArrayValue(reciboTSRarmazenado);
        }
    }
    
    /**
     * Sets (as xml) the "reciboTSRarmazenado" element
     */
    public void xsetReciboTSRarmazenado(org.apache.xmlbeans.XmlBase64Binary reciboTSRarmazenado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(RECIBOTSRARMAZENADO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(RECIBOTSRARMAZENADO$0);
            }
            target.set(reciboTSRarmazenado);
        }
    }
    
    /**
     * Unsets the "reciboTSRarmazenado" element
     */
    public void unsetReciboTSRarmazenado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIBOTSRARMAZENADO$0, 0);
        }
    }
}
