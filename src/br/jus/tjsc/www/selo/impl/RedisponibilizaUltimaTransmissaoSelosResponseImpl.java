/*
 * XML Type:  redisponibilizaUltimaTransmissaoSelosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML redisponibilizaUltimaTransmissaoSelosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class RedisponibilizaUltimaTransmissaoSelosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponse
{
    private static final long serialVersionUID = 1L;
    
    public RedisponibilizaUltimaTransmissaoSelosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROSELOSLIBERADOS$0 = 
        new javax.xml.namespace.QName("", "numeroSelosLiberados");
    
    
    /**
     * Gets the "numeroSelosLiberados" element
     */
    public int getNumeroSelosLiberados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROSELOSLIBERADOS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroSelosLiberados" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumeroSelosLiberados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROSELOSLIBERADOS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numeroSelosLiberados" element
     */
    public void setNumeroSelosLiberados(int numeroSelosLiberados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROSELOSLIBERADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROSELOSLIBERADOS$0);
            }
            target.setIntValue(numeroSelosLiberados);
        }
    }
    
    /**
     * Sets (as xml) the "numeroSelosLiberados" element
     */
    public void xsetNumeroSelosLiberados(org.apache.xmlbeans.XmlInt numeroSelosLiberados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROSELOSLIBERADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROSELOSLIBERADOS$0);
            }
            target.set(numeroSelosLiberados);
        }
    }
}
