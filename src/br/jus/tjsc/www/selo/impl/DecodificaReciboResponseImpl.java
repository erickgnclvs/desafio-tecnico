/*
 * XML Type:  decodificaReciboResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.DecodificaReciboResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML decodificaReciboResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class DecodificaReciboResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.DecodificaReciboResponse
{
    private static final long serialVersionUID = 1L;
    
    public DecodificaReciboResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIBODECODIFICADO$0 = 
        new javax.xml.namespace.QName("", "reciboDecodificado");
    
    
    /**
     * Gets the "reciboDecodificado" element
     */
    public br.jus.tjsc.www.selo.ReciboProtocolo getReciboDecodificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.ReciboProtocolo target = null;
            target = (br.jus.tjsc.www.selo.ReciboProtocolo)get_store().find_element_user(RECIBODECODIFICADO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reciboDecodificado" element
     */
    public boolean isSetReciboDecodificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIBODECODIFICADO$0) != 0;
        }
    }
    
    /**
     * Sets the "reciboDecodificado" element
     */
    public void setReciboDecodificado(br.jus.tjsc.www.selo.ReciboProtocolo reciboDecodificado)
    {
        generatedSetterHelperImpl(reciboDecodificado, RECIBODECODIFICADO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reciboDecodificado" element
     */
    public br.jus.tjsc.www.selo.ReciboProtocolo addNewReciboDecodificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.ReciboProtocolo target = null;
            target = (br.jus.tjsc.www.selo.ReciboProtocolo)get_store().add_element_user(RECIBODECODIFICADO$0);
            return target;
        }
    }
    
    /**
     * Unsets the "reciboDecodificado" element
     */
    public void unsetReciboDecodificado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIBODECODIFICADO$0, 0);
        }
    }
}
