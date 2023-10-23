/*
 * An XML document type.
 * Localname: getTiposDeSubestabelecimentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeSubestabelecimentoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeSubestabelecimentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeSubestabelecimentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDESUBESTABELECIMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSubestabelecimentoResponse");
    
    
    /**
     * Gets the "getTiposDeSubestabelecimentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse getGetTiposDeSubestabelecimentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse)get_store().find_element_user(GETTIPOSDESUBESTABELECIMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeSubestabelecimentoResponse" element
     */
    public void setGetTiposDeSubestabelecimentoResponse(br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse getTiposDeSubestabelecimentoResponse)
    {
        generatedSetterHelperImpl(getTiposDeSubestabelecimentoResponse, GETTIPOSDESUBESTABELECIMENTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeSubestabelecimentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse addNewGetTiposDeSubestabelecimentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponse)get_store().add_element_user(GETTIPOSDESUBESTABELECIMENTORESPONSE$0);
            return target;
        }
    }
}
