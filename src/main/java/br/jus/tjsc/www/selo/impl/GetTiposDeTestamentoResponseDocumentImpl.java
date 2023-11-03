/*
 * An XML document type.
 * Localname: getTiposDeTestamentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeTestamentoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeTestamentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeTestamentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDETESTAMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTestamentoResponse");
    
    
    /**
     * Gets the "getTiposDeTestamentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse getGetTiposDeTestamentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse)get_store().find_element_user(GETTIPOSDETESTAMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeTestamentoResponse" element
     */
    public void setGetTiposDeTestamentoResponse(br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse getTiposDeTestamentoResponse)
    {
        generatedSetterHelperImpl(getTiposDeTestamentoResponse, GETTIPOSDETESTAMENTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeTestamentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse addNewGetTiposDeTestamentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTestamentoResponse)get_store().add_element_user(GETTIPOSDETESTAMENTORESPONSE$0);
            return target;
        }
    }
}
