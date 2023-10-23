/*
 * An XML document type.
 * Localname: getTiposDeCobrancaResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeCobrancaResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeCobrancaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeCobrancaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDECOBRANCARESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobrancaResponse");
    
    
    /**
     * Gets the "getTiposDeCobrancaResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse getGetTiposDeCobrancaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse)get_store().find_element_user(GETTIPOSDECOBRANCARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeCobrancaResponse" element
     */
    public void setGetTiposDeCobrancaResponse(br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse getTiposDeCobrancaResponse)
    {
        generatedSetterHelperImpl(getTiposDeCobrancaResponse, GETTIPOSDECOBRANCARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeCobrancaResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse addNewGetTiposDeCobrancaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobrancaResponse)get_store().add_element_user(GETTIPOSDECOBRANCARESPONSE$0);
            return target;
        }
    }
}
