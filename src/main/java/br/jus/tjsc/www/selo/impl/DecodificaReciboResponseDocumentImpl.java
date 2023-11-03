/*
 * An XML document type.
 * Localname: decodificaReciboResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.DecodificaReciboResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one decodificaReciboResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class DecodificaReciboResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.DecodificaReciboResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecodificaReciboResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECODIFICARECIBORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "decodificaReciboResponse");
    
    
    /**
     * Gets the "decodificaReciboResponse" element
     */
    public br.jus.tjsc.www.selo.DecodificaReciboResponse getDecodificaReciboResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.DecodificaReciboResponse target = null;
            target = (br.jus.tjsc.www.selo.DecodificaReciboResponse)get_store().find_element_user(DECODIFICARECIBORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "decodificaReciboResponse" element
     */
    public void setDecodificaReciboResponse(br.jus.tjsc.www.selo.DecodificaReciboResponse decodificaReciboResponse)
    {
        generatedSetterHelperImpl(decodificaReciboResponse, DECODIFICARECIBORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "decodificaReciboResponse" element
     */
    public br.jus.tjsc.www.selo.DecodificaReciboResponse addNewDecodificaReciboResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.DecodificaReciboResponse target = null;
            target = (br.jus.tjsc.www.selo.DecodificaReciboResponse)get_store().add_element_user(DECODIFICARECIBORESPONSE$0);
            return target;
        }
    }
}
