/*
 * An XML document type.
 * Localname: getTiposDeEndossoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeEndossoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeEndossoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEndossoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEENDOSSORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndossoResponse");
    
    
    /**
     * Gets the "getTiposDeEndossoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEndossoResponse getGetTiposDeEndossoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEndossoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEndossoResponse)get_store().find_element_user(GETTIPOSDEENDOSSORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeEndossoResponse" element
     */
    public void setGetTiposDeEndossoResponse(br.jus.tjsc.www.selo.GetTiposDeEndossoResponse getTiposDeEndossoResponse)
    {
        generatedSetterHelperImpl(getTiposDeEndossoResponse, GETTIPOSDEENDOSSORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeEndossoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEndossoResponse addNewGetTiposDeEndossoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEndossoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEndossoResponse)get_store().add_element_user(GETTIPOSDEENDOSSORESPONSE$0);
            return target;
        }
    }
}
