/*
 * An XML document type.
 * Localname: getSituacoesDeTituloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSituacoesDeTituloResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSituacoesDeTituloResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSituacoesDeTituloResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSITUACOESDETITULORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSituacoesDeTituloResponse");
    
    
    /**
     * Gets the "getSituacoesDeTituloResponse" element
     */
    public br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse getGetSituacoesDeTituloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse)get_store().find_element_user(GETSITUACOESDETITULORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSituacoesDeTituloResponse" element
     */
    public void setGetSituacoesDeTituloResponse(br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse getSituacoesDeTituloResponse)
    {
        generatedSetterHelperImpl(getSituacoesDeTituloResponse, GETSITUACOESDETITULORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSituacoesDeTituloResponse" element
     */
    public br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse addNewGetSituacoesDeTituloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse)get_store().add_element_user(GETSITUACOESDETITULORESPONSE$0);
            return target;
        }
    }
}
