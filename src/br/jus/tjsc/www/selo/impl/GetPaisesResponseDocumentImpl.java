/*
 * An XML document type.
 * Localname: getPaisesResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetPaisesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getPaisesResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetPaisesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetPaisesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetPaisesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPAISESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getPaisesResponse");
    
    
    /**
     * Gets the "getPaisesResponse" element
     */
    public br.jus.tjsc.www.selo.GetPaisesResponse getGetPaisesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetPaisesResponse target = null;
            target = (br.jus.tjsc.www.selo.GetPaisesResponse)get_store().find_element_user(GETPAISESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPaisesResponse" element
     */
    public void setGetPaisesResponse(br.jus.tjsc.www.selo.GetPaisesResponse getPaisesResponse)
    {
        generatedSetterHelperImpl(getPaisesResponse, GETPAISESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getPaisesResponse" element
     */
    public br.jus.tjsc.www.selo.GetPaisesResponse addNewGetPaisesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetPaisesResponse target = null;
            target = (br.jus.tjsc.www.selo.GetPaisesResponse)get_store().add_element_user(GETPAISESRESPONSE$0);
            return target;
        }
    }
}
