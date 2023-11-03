/*
 * An XML document type.
 * Localname: decodificaRecibo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.DecodificaReciboDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one decodificaRecibo(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class DecodificaReciboDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.DecodificaReciboDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecodificaReciboDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECODIFICARECIBO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "decodificaRecibo");
    
    
    /**
     * Gets the "decodificaRecibo" element
     */
    public br.jus.tjsc.www.selo.DecodificaRecibo getDecodificaRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.DecodificaRecibo target = null;
            target = (br.jus.tjsc.www.selo.DecodificaRecibo)get_store().find_element_user(DECODIFICARECIBO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "decodificaRecibo" element
     */
    public void setDecodificaRecibo(br.jus.tjsc.www.selo.DecodificaRecibo decodificaRecibo)
    {
        generatedSetterHelperImpl(decodificaRecibo, DECODIFICARECIBO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "decodificaRecibo" element
     */
    public br.jus.tjsc.www.selo.DecodificaRecibo addNewDecodificaRecibo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.DecodificaRecibo target = null;
            target = (br.jus.tjsc.www.selo.DecodificaRecibo)get_store().add_element_user(DECODIFICARECIBO$0);
            return target;
        }
    }
}
