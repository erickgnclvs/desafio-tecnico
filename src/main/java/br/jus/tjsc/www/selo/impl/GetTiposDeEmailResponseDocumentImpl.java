/*
 * An XML document type.
 * Localname: getTiposDeEmailResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeEmailResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeEmailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEmailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEEMAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEmailResponse");
    
    
    /**
     * Gets the "getTiposDeEmailResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEmailResponse getGetTiposDeEmailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEmailResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEmailResponse)get_store().find_element_user(GETTIPOSDEEMAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeEmailResponse" element
     */
    public void setGetTiposDeEmailResponse(br.jus.tjsc.www.selo.GetTiposDeEmailResponse getTiposDeEmailResponse)
    {
        generatedSetterHelperImpl(getTiposDeEmailResponse, GETTIPOSDEEMAILRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeEmailResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEmailResponse addNewGetTiposDeEmailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEmailResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEmailResponse)get_store().add_element_user(GETTIPOSDEEMAILRESPONSE$0);
            return target;
        }
    }
}
