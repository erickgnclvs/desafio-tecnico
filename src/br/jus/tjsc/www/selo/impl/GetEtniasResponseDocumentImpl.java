/*
 * An XML document type.
 * Localname: getEtniasResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEtniasResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEtniasResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEtniasResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEtniasResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEtniasResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETETNIASRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEtniasResponse");
    
    
    /**
     * Gets the "getEtniasResponse" element
     */
    public br.jus.tjsc.www.selo.GetEtniasResponse getGetEtniasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEtniasResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEtniasResponse)get_store().find_element_user(GETETNIASRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEtniasResponse" element
     */
    public void setGetEtniasResponse(br.jus.tjsc.www.selo.GetEtniasResponse getEtniasResponse)
    {
        generatedSetterHelperImpl(getEtniasResponse, GETETNIASRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEtniasResponse" element
     */
    public br.jus.tjsc.www.selo.GetEtniasResponse addNewGetEtniasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEtniasResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEtniasResponse)get_store().add_element_user(GETETNIASRESPONSE$0);
            return target;
        }
    }
}
