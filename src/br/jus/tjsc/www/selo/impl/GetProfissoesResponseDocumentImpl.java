/*
 * An XML document type.
 * Localname: getProfissoesResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetProfissoesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getProfissoesResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetProfissoesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetProfissoesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProfissoesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROFISSOESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getProfissoesResponse");
    
    
    /**
     * Gets the "getProfissoesResponse" element
     */
    public br.jus.tjsc.www.selo.GetProfissoesResponse getGetProfissoesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetProfissoesResponse target = null;
            target = (br.jus.tjsc.www.selo.GetProfissoesResponse)get_store().find_element_user(GETPROFISSOESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProfissoesResponse" element
     */
    public void setGetProfissoesResponse(br.jus.tjsc.www.selo.GetProfissoesResponse getProfissoesResponse)
    {
        generatedSetterHelperImpl(getProfissoesResponse, GETPROFISSOESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getProfissoesResponse" element
     */
    public br.jus.tjsc.www.selo.GetProfissoesResponse addNewGetProfissoesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetProfissoesResponse target = null;
            target = (br.jus.tjsc.www.selo.GetProfissoesResponse)get_store().add_element_user(GETPROFISSOESRESPONSE$0);
            return target;
        }
    }
}
