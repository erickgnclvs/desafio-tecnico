/*
 * An XML document type.
 * Localname: getTiposDeRegistroDeAverbacaoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeRegistroDeAverbacaoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeRegistroDeAverbacaoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeRegistroDeAverbacaoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEREGISTRODEAVERBACAORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeRegistroDeAverbacaoResponse");
    
    
    /**
     * Gets the "getTiposDeRegistroDeAverbacaoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse getGetTiposDeRegistroDeAverbacaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse)get_store().find_element_user(GETTIPOSDEREGISTRODEAVERBACAORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeRegistroDeAverbacaoResponse" element
     */
    public void setGetTiposDeRegistroDeAverbacaoResponse(br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse getTiposDeRegistroDeAverbacaoResponse)
    {
        generatedSetterHelperImpl(getTiposDeRegistroDeAverbacaoResponse, GETTIPOSDEREGISTRODEAVERBACAORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeRegistroDeAverbacaoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse addNewGetTiposDeRegistroDeAverbacaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse)get_store().add_element_user(GETTIPOSDEREGISTRODEAVERBACAORESPONSE$0);
            return target;
        }
    }
}
